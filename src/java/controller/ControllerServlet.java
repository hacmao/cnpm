package controller;
import cart.ShoppingCart;


import java.io.IOException;
import javax.ejb.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session_bean.*;
import entity.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpSession;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;
import javax.validation.ConstraintViolation;
import session_bean.CustomerOrderSessionBean;
import session_bean.CustomerSessionBean;
import session_bean.OrderedProductSessionBean;
import java.nio.file.Files;
import java.nio.file.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.naming.*;
import java.sql.*;
import javax.sql.*;
import javax.servlet.*;


//@WebServlet(name = "ControllerServlet", urlPatterns = {"/ControllerServlet","/category","/product"})
@MultipartConfig
public class ControllerServlet extends HttpServlet {

    @EJB
    private CategorySessionBean categorySB;
    @EJB
    private ProductSessionBean productSB;
    @EJB
    private ProductDetailSessionBean productDetailSB; 
    
    @EJB 
    private OrderManager orderManager ;
    @EJB
    private CustomerOrderSessionBean customerOrderSB;

    @EJB
    private OrderedProductSessionBean orderedProductSB;
    @EJB
    private CustomerSessionBean customerSB;
    
    @EJB 
    private UserSessionBean userSB;
    
    private String previewPath = "img\\user\\";
    
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
                Product product = productSB.find(Integer.parseInt(productId));
                ProductDetail productDetail = productDetailSB.find(Integer.parseInt(productId));
                if (productDetail.getQuantity() != 0) {
                    cart.addItem(product);
                    
                }
                session.setAttribute("selectedProduct", product);
                session.setAttribute("selectedProductDetail", productDetail);
                request.getRequestDispatcher("product.jsp").forward(request, response);    // check quantity
            }
            String userView = (String) session.getAttribute("view");
            userPath = userView;
        } 
        else if (userPath.equals("/checkOrder")){
                List<Customer> customers = customerSB.findAll();
                List<CustomerOrder> customerOrders = customerOrderSB.findAll(); 
                
                List<OrderInfo> orderInfos = new ArrayList<OrderInfo>() ;
                SimpleDateFormat  df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                int size = customers.size(); 
                CustomerOrder customerOrder = null;
                for (int i=0; i < size; i++) {
                    Customer customer = customers.get(i);
                    int customerId = customer.getCustomerId();
                    for (CustomerOrder c : customerOrders){
                        if(c.getCustomerId().getCustomerId() == customerId){
                            customerOrder = c;
                            break;
                        }
                    }
                    
                    OrderInfo orderInfo = new OrderInfo();
                    orderInfo.setId(customerId);
                    orderInfo.setName(customer.getName());
                    orderInfo.setCcNumber(customer.getCcNumber());
                    orderInfo.setConfirmationNumber(customerOrder.getConfirmationNumber()); 
                    orderInfo.setDateCreated(df.format(customerOrder.getDateCreated())); 
                    List<String> products = new ArrayList<String>();
                    List<String> amounts = new ArrayList<String>();
                    
                    List<OrderedProduct> orderedProducts = orderedProductSB.findByOrderId(customerOrder.getOrderId());
                    for (OrderedProduct op : orderedProducts) {
                        Product p = (Product) productSB.find(op.getProductId().getProductId());
                        products.add(p.getName());
                        amounts.add(Integer.toString(op.getQuantity()));
                    }
                    
                    orderInfo.setProducts(products);
                    orderInfo.setAmounts(amounts);
                    orderInfos.add(orderInfo);
                    
                }
                
                session.setAttribute("size", size);
                session.setAttribute("orderInfos", orderInfos);

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
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            ProductDetail productDetail = productDetailSB.find(productId);
            System.err.println(quantity);
            if (quantity <= productDetail.getQuantity()) {
                cart.update(productId, Integer.toString(quantity));
                session.setAttribute("errId", 0);
            }
            else{
                session.setAttribute("errId", productId);
            }
            
            try {
                request.getRequestDispatcher("viewCart.jsp").forward(request, response);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        else if (userPath.equals("/purchase")) {
            session.setAttribute("isCheckout", "1");
            String isLogin = (String) session.getAttribute("isLogin");
            if (isLogin == "0" || isLogin == null) {
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
                
                session.setAttribute("form", form);
                request.getRequestDispatcher("login/login.jsp").forward(request, response);
                return;
            }
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
                        cart.clear();
                        session.setAttribute("cart", cart);
                        // end session
                        //session.invalidate();
                        if (!language.isEmpty()) { //if user changed language using the toggle,
                            // reset the language attribute - otherwise
                            request.setAttribute("language", language); // language will be switched on confirmation page!
                        }
                        // get order details
                        Map orderMap = orderManager.getOrderDetails(orderId);
                        // place order details in request scope
                        // subtract quantity product left in database
                        List<Product> products = (List<Product>) orderMap.get("products");
                        List<OrderedProduct> orderedProducts = (List<OrderedProduct>) orderMap.get("orderedProducts");
                        int i = 0; 
                        for (Product p : products) {
                            int id = p.getProductId();
                            ProductDetail pd = productDetailSB.find(id);
                            int quantity = orderedProducts.get(i).getQuantity() ;
                            pd.setQuantity(pd.getQuantity() - quantity); 
                            pd.setNumSelled(pd.getNumSelled() + quantity);
                            productDetailSB.edit(pd);
                        } 

                        
                        request.setAttribute("customer", orderMap.get("customer"));
                        request.setAttribute("products", products);
                        request.setAttribute("orderRecord", orderMap.get("orderRecord"));
                        request.setAttribute("orderedProducts", orderedProducts);
                        userPath = "/confirmation";
                        // otherwise, send back to checkout page and display error
                    }else {
                            userPath = "/checkout";
                            request.setAttribute("orderFailureFlag", true);
                    }
                }
            }
        }
        
        else if (userPath.equals("/updateProfile")){
            User user = (User) session.getAttribute("user");
            user.setName(request.getParameter("username"));
            user.setInfo(request.getParameter("info"));
            user.setPassword(request.getParameter("password"));
            

            String appPath = request.getServletContext().getRealPath("");
            if (!appPath.endsWith("\\"))
                appPath = appPath + "\\";
            String fullSavePath = null;
            fullSavePath = appPath + previewPath;
            File fileSaveDir = new File(fullSavePath);
            if (!fileSaveDir.exists()) {
                fileSaveDir.mkdir();
            }

            List<String> list = new ArrayList<>();
            for (Part path : request.getParts()) {
                String fileName = extractFileName(path);
                if (fileName != null && fileName.length() > 0) {
                    list.add(fileName);
                    String filePath = fullSavePath + File.separator + fileName;
                    InputStream is = path.getInputStream();
                    Files.copy(is, Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);
                    break;
                    //path.write(filePath);
                }
            }
            if (list.size() > 0)
                user.setImg(list.get(0));
            System.err.println(list);
            userSB.edit(user);
            session.setAttribute("user", user);
            request.getRequestDispatcher("profile.jsp").forward(request, response);
        }
        
        
        String url = userPath + ".jsp";
        try {
            request.getRequestDispatcher(url).forward(request, response);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                String clientFileName = s.substring(s.indexOf("=") + 2, s.length() - 1);
                int i = clientFileName.lastIndexOf('\\');
                return clientFileName.substring(i + 1);
            }
        }
        return null;
    }
}

