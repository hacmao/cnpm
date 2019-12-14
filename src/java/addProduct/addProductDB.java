/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addProduct;

import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
public class addProductDB extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        String product_id ;
        String category_id = (String) session.getAttribute("category_id");
        String price = (String) session.getAttribute("price");
        String Description = (String) session.getAttribute("Description");
        String DescriptionDetail = (String) session.getAttribute("descriptionDetail");
        try {
            Context initContext = new InitialContext(); 
            Context envContext = (Context) initContext.lookup("java:comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/lab8"); 
            Connection conn = ds.getConnection();
            Statement sttm = conn.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "select count(*) as numRow from product";  
            ResultSet rs = sttm.executeQuery(sql); 
            product_id = Integer.toString(rs.getInt("numRow") + 1); 
            sttm = conn.createStatement();
            sql = "insert into product values (" + product_id + ",\"" + name + "\"," + price + ",\"" + 
                    Description + "\",\"" + DescriptionDetail + "\",\"\",\"\",\"2019-12-2\"," + category_id + "," + product_id + ");";
            session.setAttribute("sql", sql);
            
            sttm.executeUpdate(sql); 
            request.getRequestDispatcher("/addSuccess.jsp").forward(request, response);

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
