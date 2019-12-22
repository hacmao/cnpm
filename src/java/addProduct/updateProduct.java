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

/**
 *
 * @author DELL
 */
public class updateProduct extends HttpServlet {
    
    @EJB
    private ProductSessionBean productSB;
    @EJB 
    private ProductDetailSessionBean productDetailSB;
    
    
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
        ProductDetail selectedProductDetail = (ProductDetail) session.getAttribute("selectedProductDetail");
        String info = request.getParameter("info");
        String warranty = request.getParameter("warranty");
        String quantity = request.getParameter("quantity");
        String numSelled = request.getParameter("numSelled");
        String price = request.getParameter("price");
        if (info != null) selectedProductDetail.setInformation(info);
            
        if (warranty != null) selectedProductDetail.setGuaranty(warranty);
        if (quantity != null) selectedProductDetail.setQuantity(Integer.parseInt(quantity));
        if (numSelled != null) selectedProductDetail.setNumSelled(Integer.parseInt(numSelled));
        if (price != null) product.setPrice(Float.parseFloat(price));
        
        productSB.edit(product);
        productDetailSB.edit(selectedProductDetail);
        System.err.println("product?" + product.getProductId());
        request.getRequestDispatcher("product?" + product.getProductId()).forward(request, response);
        
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
