/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addProduct;
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
public class signUp extends HttpServlet {




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
        boolean fail = false; 
        try {
            Context initContext = new InitialContext(); 
            Context envContext = (Context) initContext.lookup("java:comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/lab8"); 
            Connection conn = ds.getConnection();
            Statement sttm = conn.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "select COUNT(*) as numRow from user where name=\"" + name + "\" "; 
            
            ResultSet rs = sttm.executeQuery(sql);
            rs.next();
            if (rs.getInt("numRow") == 0) {             // if name is not exist in database, add 
                sql = "insert into user values (\"" + name + "\", \"" + password + "\");"; 
                sttm = conn.createStatement();
                sttm.executeUpdate(sql);
            }
            else {
                fail = true; 
                session.setAttribute("fail", "1");
            }
            
        } catch (SQLException | NamingException ex) {
            System.err.println(ex);
        }
        if(fail){
            response.sendRedirect("login/signup.jsp");
        } else {
            response.sendRedirect("login/login.html");
        }
    }


}
