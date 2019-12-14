/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.naming.*;
import java.sql.*;
import javax.sql.*;

/**
 *
 * @author DELL
 */
public class search extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String par = (String) request.getParameter("search");
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
                request.getRequestDispatcher("category?" + id).forward(request, response);
            } 
            else {
                request.getRequestDispatcher("category?" + 0).forward(request, response);
            }
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
