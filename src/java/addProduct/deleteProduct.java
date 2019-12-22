/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addProduct;

import entity.*;
import entity.Product;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session_bean.*;
import java.util.*;

/**
 *
 * @author DELL
 */
public class deleteProduct extends HttpServlet {

    @EJB
    private ProductSessionBean productSB;
    @EJB 
    private ProductDetailSessionBean productDetailSB;
    
    @EJB
    private CustomerOrderSessionBean customerOrderSB;

    @EJB
    private OrderedProductSessionBean orderedProductSB;
    @EJB
    private CustomerSessionBean customerSB;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Product product = (Product) session.getAttribute("selectedProduct");
        int id = product.getProductId();
        ProductDetail selectedProductDetail = (ProductDetail) session.getAttribute("selectedProductDetail");
        List<OrderedProduct> orderedProduct = orderedProductSB.findAll();
        if (selectedProductDetail.getQuantity() == 0) {
            productSB.remove(product);
            productDetailSB.remove(selectedProductDetail);
        }
        for (OrderedProduct op : orderedProduct) {
            if(op.getProductId().getProductId() == id) {
                int orderId = op.getOrderId();
                CustomerOrder customerOrder = customerOrderSB.find(orderId);
                if (!customerOrder.getStatus().equals("done")){
                    session.setAttribute("deleteErr", "true");
                    response.sendRedirect("product?" + id);
                    return;
                }
            }
        }
        
        productSB.remove(product);
        productDetailSB.remove(selectedProductDetail);
        response.sendRedirect("index");
        return;
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
