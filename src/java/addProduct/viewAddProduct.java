/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addProduct;
import entity.Category;
import java.io.*;
import java.sql.*;
import javax.naming.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.*;
import javax.servlet.annotation.MultipartConfig;

/**
 *
 * @author DELL
 */

@MultipartConfig
public class viewAddProduct extends HttpServlet {

    String previewPath = "img\\";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        //String product_id = request.getParameter("product_id");
        String category_id = request.getParameter("category_id");
        String price = request.getParameter("price");
        String description = request.getParameter("Description");
        String descriptionDetail = request.getParameter("DescriptionDetail"); 
        String warranty = request.getParameter("warranty");
        String categoryName;
        
        HttpSession session = request.getSession();
        session.setAttribute("name", name); 
        session.setAttribute("price", price); 
        session.setAttribute("Description", description);
        session.setAttribute("descriptionDetail", descriptionDetail);
        session.setAttribute("warranty", warranty);
        
        //save images into directory   
        String userPath = request.getRequestURI().substring(request.getContextPath().length());
        String appPath = request.getServletContext().getRealPath("");
        if (!appPath.endsWith("\\"))
            appPath = appPath + "\\";
        String fullSavePath = null;
        fullSavePath = appPath + previewPath;
        File fileSaveDir = new File(fullSavePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }
        
        List<String> list = new ArrayList<>();
            for (Part path : request.getParts()) {
                String fileName = extractFileName(path);
                if (fileName != null && fileName.length() > 0) {
                    list.add(fileName);
                    String filePath = fullSavePath + File.separator + fileName;
                    InputStream is = path.getInputStream();
                    Files.copy(is, Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);
                    //path.write(filePath);
                }
            }
        session.setAttribute("allImage", list);
        
        try {
            Context initContext = new InitialContext(); 
            Context envContext = (Context) initContext.lookup("java:comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/lab8"); 
            Connection conn = ds.getConnection();
            Statement sttm = conn.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           
            // get product id 
            String sql = "select count(*) as numRow from product";  
            ResultSet rs = sttm.executeQuery(sql); 
            rs.next();
            String product_id = Integer.toString(rs.getInt("numRow") + 1);  
            session.setAttribute("product_id", product_id);
            
            sttm = conn.createStatement();
            sql = "select * from category where category_id=" + category_id;       
            rs = sttm.executeQuery(sql);
            if(rs.next()){
                categoryName = rs.getString("name");
                session.setAttribute("categoryName", categoryName);
                session.setAttribute("category_id", category_id);
            }
            else {
                session.setAttribute("wrongCategory", "1");
                request.getRequestDispatcher("/addFail.jsp").forward(request, response);
            } 
        }catch (SQLException | NamingException ex) {
            request.getRequestDispatcher("/addFail.jsp").forward(request, response);
            System.err.println(ex);
        }
       
        request.getRequestDispatcher("/viewAddProduct.jsp").forward(request, response);
    }
    
    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                String clientFileName = s.substring(s.indexOf("=") + 2, s.length() - 1);
                int i = clientFileName.lastIndexOf('\\');
                return clientFileName.substring(i + 1);
            }
        }
        return null;
    }
   

}
