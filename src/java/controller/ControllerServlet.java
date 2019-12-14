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
import entity.*;
import java.util.*;
import javax.servlet.http.HttpSession;

//@WebServlet(name = "ControllerServlet", urlPatterns = {"/ControllerServlet","/category","/product"})

public class ControllerServlet extends HttpServlet {

    @EJB
    private CategorySessionBean categorySB;
    @EJB
    private ProductSessionBean productSB;
    @EJB
    private ProductDetailSessionBean productDetailSB; 
    
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
        String userPath = request.getServletPath();
        HttpSession session = request.getSession();
        if (userPath.equals("/updateCart")) {
            ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
            int productId = Integer.parseInt(request.getParameter("productId"));
            String quantity = request.getParameter("quantity");
            
            cart.update(productId, quantity);
            try {
                request.getRequestDispatcher("viewCart.jsp").forward(request, response);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        
    }
}
