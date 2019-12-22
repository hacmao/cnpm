/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.*;
import session_bean.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.naming.*;
import java.sql.*;
import java.util.ArrayList;
import javax.ejb.*;
import javax.servlet.http.HttpSession;
import javax.sql.*;
import java.util.*;

/**
 *
 * @author DELL
 */
public class search extends HttpServlet {

    @EJB
    CategorySessionBean categorySessionBean;
    @EJB
    ProductSessionBean productSessionBean;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String par = (String) request.getParameter("search");
        HttpSession session = request.getSession();
        session.setAttribute("par", par); 
        List<Product> categoryProducts = new ArrayList<Product>();
        try {
            Context initContext = new InitialContext(); 
            Context envContext = (Context) initContext.lookup("java:comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/lab8"); 
            Connection conn = ds.getConnection();
            String sql = "select * from category where name=\"" + par + "\"";
            Statement sttm = conn.createStatement( );
            ResultSet rs = sttm.executeQuery(sql); 
            if (rs.next()) {
                int id = rs.getInt("category_id");
                Category category = categorySessionBean.find(id);
                List<Product> products = productSessionBean.findAll();
                for (Product p : products){    
                    if(p.getCategorycategoryid().getCategoryId() == id) {
                        categoryProducts.add(p);
                    }
                }
            }
            sql = "select * from product where name like \"%" + par + "%\" or description like \"%" + par + "%\"";
            System.err.println(sql);
            rs = sttm.executeQuery(sql);
            while (rs.next()){
                if (rs == null) {
                    break;
                }
                int productId = rs.getInt("product_id");
                Product product = productSessionBean.find(productId);
                if (!categoryProducts.contains(product)){
                    categoryProducts.add(product);
                }
            }
            System.err.println(categoryProducts.size());
            if (categoryProducts.size() == 0) {
                categoryProducts = null;
            }
            session.setAttribute("categoryProducts", categoryProducts);
            response.sendRedirect("search.jsp");
        } catch (SQLException | NamingException ex) {
            System.err.println(ex);
        }
        
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
