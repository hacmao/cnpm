/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addProduct;
import entity.Category;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 *
 * @author DELL
 */

public class viewAddProduct extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String product_id = request.getParameter("product_id");
        String category_id = request.getParameter("category_id");
        String price = request.getParameter("price");
        String Description = request.getParameter("Description");
        String DescriptionDetail = request.getParameter("DescriptionDetail"); 
        String categoryName="";
        
        HttpSession session = request.getSession();
        session.setAttribute("name", name); 
        session.setAttribute("product_id", product_id); 
        session.setAttribute("categoryName", categoryName);
        session.setAttribute("price", price); 
        session.setAttribute("Description", Description);
        session.setAttribute("descriptionDetail", DescriptionDetail);
        
        try {
            Context initContext = new InitialContext(); 
            Context envContext = (Context) initContext.lookup("java:comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/lab8"); 
            Connection conn = ds.getConnection();
            Statement sttm = conn.createStatement();
            String sql = "select * from category where category_id=" + category_id;
            ResultSet rs = sttm.executeQuery(sql);
            if(rs.next()){
                categoryName = rs.getString("name");
            }
            else {
                session.setAttribute("wrongCategory", "1");
                sql = "select * from product where product_id = " + product_id;
                rs = sttm.executeQuery(sql);
                if (rs.next()) {
                    session.setAttribute("wrongProductId", "1");
                    request.getRequestDispatcher("/addFail.jsp").forward(request, response);
                }
                request.getRequestDispatcher("/addFail.jsp").forward(request, response);
            }
            
            sql = "select * from product where product_id = " + product_id;
            rs = sttm.executeQuery(sql);
            if (rs.next()) {
                session.setAttribute("wrongProductId", "1");
                request.getRequestDispatcher("/addFail.jsp").forward(request, response);
            }
            
            
        }catch (SQLException | NamingException ex) {
            System.err.println(ex);
        }
       
        request.getRequestDispatcher("/viewAddProduct.jsp").forward(request, response);
    }

   

}
