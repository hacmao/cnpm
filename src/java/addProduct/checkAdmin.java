/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addProduct;

import entity.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.naming.*;

/**
 *
 * @author DELL
 */
public class checkAdmin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(); 
        String name = (String) request.getParameter("name");
        String password = (String) request.getParameter("password"); 
        try {
            Context initContext = new InitialContext(); 
            Context envContext = (Context) initContext.lookup("java:comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/lab8"); 
            Connection conn = ds.getConnection();
            Statement sttm = conn.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from user where name=\"" + name + "\" and password=\"" + password + "\""; 
            
            ResultSet rs = sttm.executeQuery(sql);
            if (!rs.next()) {
                session.setAttribute("isLogin", "0"); 
            }
            else {
                User user = new User();
                user.setName(name);
                user.setPassword(password);
                user.setImg(rs.getString("img"));
                user.setInfo(rs.getString("info"));
                session.setAttribute("user", user);
                if (name.equals("admin")) {
                    session.setAttribute("isLogin", "1"); 
                } 
                else {
                    session.setAttribute("isLogin", "2");
                }
            }
        } catch (SQLException | NamingException ex) {
            System.err.println(ex);
        }
        session.setAttribute("name", name);
        session.setAttribute("password", password);
        String checkout = (String) session.getAttribute("isCheckout");
        System.err.println(checkout);
        if (checkout != null) {
            Form form = (Form) session.getAttribute("form");
            if (form != null){
                form.setName(name);
            }
            response.sendRedirect("checkout.jsp");
            return;
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

}
