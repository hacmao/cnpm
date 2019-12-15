package controller;
import cart.ShoppingCart;


import java.io.IOException;
import javax.ejb.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session_bean.CategorySessionBean;
import session_bean.ProductSessionBean;
import session_bean.ProductDetailSessionBean;
import session_bean.OrderManager;
import entity.*;
import java.util.*;
import javax.servlet.http.HttpSession;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;
import javax.validation.ConstraintViolation;

//@WebServlet(name = "ControllerServlet", urlPatterns = {"/ControllerServlet","/category","/product"})

public class ControllerServlet extends HttpServlet {

    @EJB
    private CategorySessionBean categorySB;
    @EJB
    private ProductSessionBean productSB;
    @EJB
    private ProductDetailSessionBean productDetailSB; 
    
    @EJB 
    private OrderManager orderManager ;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String userPath = request.getServletPath();
        HttpSession session = request.getSession();
        
        if (userPath.equals("/category")) {
            String categoryId = request.getQueryString();
            if (categoryId != null) {
                if (Integer.parseInt(categoryId) == 0) {
                    session.setAttribute("categoryProducts", null);
                    request.getRequestDispatcher("category.jsp").forward(request, response);
                    
                }
                try {
                    Category selectedCategory;
                    List<Product> categoryProducts;
                    selectedCategory = categorySB.find(Integer.parseInt(categoryId));
                    session.setAttribute("selectedCategory", selectedCategory);
                    categoryProducts = (List<Product>) selectedCategory.getProductCollection();
                    session.setAttribute("categoryProducts", categoryProducts);
                } catch(Exception ex) {
                    System.err.println(ex);
                }
            }
        } else if (userPath.equals("/product")){
            Product selectedProduct;
            ProductDetail selectedProductDetail;
            String productId = request.getQueryString();
            if (productId != null){
                selectedProduct = productSB.find(Integer.parseInt(productId));
                selectedProductDetail = productDetailSB.find(Integer.parseInt(productId));
                session.setAttribute("selectedProduct", selectedProduct);
                session.setAttribute("selectedProductDetail", selectedProductDetail);
            }
        } else if (userPath.equals("/viewCart")) {
            String clear = request.getParameter("clear");
            if ((clear != null) && clear.equals("true")) {
                ShoppingCart cart = (ShoppingCart)
                session.getAttribute("cart");
                cart.clear();
            }
        }
        else if (userPath.equals("/addToCart")) {
            // if user is adding item to cart for first time
            // create cart object and attach it to user session
            ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");

            if (cart == null) {
                cart = new ShoppingCart();
                session.setAttribute("cart", cart);
            }
            // get user input from request
            String productId = request.getQueryString();
            if (!productId.isEmpty()) {
                Product product =
                productSB.find(Integer.parseInt(productId));
                cart.addItem(product);
            }
            String userView = (String) session.getAttribute("view");
            userPath = userView;
        } 
        
        String url = userPath + ".jsp";
        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String userPath = request.getServletPath();
        HttpSession session = request.getSession();
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        if (userPath.equals("/updateCart")) {
            int productId = Integer.parseInt(request.getParameter("productId"));
            String quantity = request.getParameter("quantity");
            
            cart.update(productId, quantity);
            try {
                request.getRequestDispatcher("viewCart.jsp").forward(request, response);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        else if (userPath.equals("/purchase")) {
            if (cart != null) {
                Form form = new Form();
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String phone = request.getParameter("phone");
                String address = request.getParameter("address");
                String cityRegion = request.getParameter("cityRegion");
                String ccNumber = request.getParameter("creditcard");

                form.setName(name);
                form.setEmail(email);
                form.setPhone(phone);
                form.setAddress(address);
                form.setCityRegion(cityRegion);
                form.setCcNumber(ccNumber);

                boolean validationErrorFlag = false;
                Set<ConstraintViolation<Form>> violations = validator.validate(form);
                if (violations.size() > 0) {
                    validationErrorFlag = true;
                    request.setAttribute("validationErrorFlag", validationErrorFlag);
                    userPath = "/checkout";
                } else {
                    int orderId = orderManager.placeOrder(name, email, phone, address, cityRegion, ccNumber, cart);
                    if (orderId != 0) {
                        // in case language was set using toggle, get language choice before destroying session
                        Locale locale = (Locale)
                        session.getAttribute("javax.servlet.jsp.jstl.fmt.locale.session");
                        String language = "";
                        if (locale != null) {
                            language = (String) locale.getLanguage();
                        }
                        // dissociate shopping cart from session
                        cart = null;
                        // end session
                        session.invalidate();
                        if (!language.isEmpty()) { //if user changed language using the toggle,
                            // reset the language attribute - otherwise
                            request.setAttribute("language", language); // language will be switched on confirmation page!
                        }
                        // get order details
                        Map orderMap = orderManager.getOrderDetails(orderId);
                        // place order details in request scope
                        request.setAttribute("customer", orderMap.get("customer"));
                        request.setAttribute("products", orderMap.get("products"));
                        request.setAttribute("orderRecord", orderMap.get("orderRecord"));
                        request.setAttribute("orderedProducts", orderMap.get("orderedProducts"));
                        userPath = "/confirmation";
                        // otherwise, send back to checkout page and display error
                    }else {
                            //userPath = "/checkout";
                            //request.setAttribute("orderFailureFlag", true);
                            request.getRequestDispatcher("addFail.jsp").forward(request, response);
                    }
                }
            }
        }
        String url = userPath + ".jsp";
        try {
            request.getRequestDispatcher(url).forward(request, response);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

