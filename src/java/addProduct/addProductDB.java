/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addProduct;

import java.io.*;
import java.sql.*;
import javax.naming.*;
import org.xml.sax.Attributes;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.*;

/**
 *
 * @author DELL
 */
public class addProductDB extends HttpServlet {

    private String PATH = "D:\\BK2\\cnpm\\final2\\web\\img\\";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        int product_id = Integer.parseInt((String) session.getAttribute("product_id")) ;
        int category_id = Integer.parseInt((String) session.getAttribute("category_id"));
        float price = Float.parseFloat((String) session.getAttribute("price")); 
        String Description = (String) session.getAttribute("Description");
        String DescriptionDetail = (String) session.getAttribute("descriptionDetail");
        String warranty = (String) session.getAttribute("warranty");
        List<String> img = (List<String>) session.getAttribute("allImage"); 
        
        while (img.size() != 6) {
            img.add("");
        }
        try {
            Context initContext = new InitialContext(); 
            Context envContext = (Context) initContext.lookup("java:comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/lab8"); 
            Connection conn = ds.getConnection();
            String sql = "insert into product(product_id, name, price, description, description_detail, image,thumb_image, last_update, Categorycategory_id, product_detailproduct_id) "
                + "values (?,?,?,?,?,?,?, ?, ?, ?); "
                + " insert into product_detail(product_id, information, image1, image2, image3, image4, image5, accessories, guaranty)"
                +" values (?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            
            // product 
            pst.setInt(1, product_id);
            pst.setString(2, name);
            pst.setFloat(3, price);
            pst.setString(4, Description);
            pst.setString(5, DescriptionDetail);
            pst.setString(6, img.get(0));
            pst.setString(7, img.get(0)) ;
            pst.setString(8, "2019-09-14");
            pst.setInt(9, category_id);
            pst.setInt(10, product_id);
            
            // product detail 
            pst.setInt(11, product_id);
            pst.setString(12, Description);
            pst.setString(13, img.get(1));
            pst.setString(14, img.get(2));
            pst.setString(15, img.get(3));
            pst.setString(16, img.get(4));
            pst.setString(17, img.get(5));
            pst.setString(18, "");
            pst.setString(19, warranty);
            
            sql = pst.toString().split(":")[1];
            String sql1 = sql.split(";")[0];
            String sql2 = sql.split(";")[1];
            sql1 = sql1.replace('\'', '"');
            sql2 = sql2.replace('\'', '"');
            session.setAttribute("sql", sql1);
            
            Statement sttm = conn.createStatement();
            sttm.executeUpdate(sql1);
            session.setAttribute("sql", sql1 + "---" + sql2);
            sttm.executeUpdate(sql2);
            System.err.println(sql);
            sttm.close();
            
            
        } catch (SQLException | NamingException ex) {
            
            request.getRequestDispatcher("/addFail.jsp").forward(request, response);
            System.err.println(ex);
        }
        request.getRequestDispatcher("/index.jsp").forward(request, response);
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
