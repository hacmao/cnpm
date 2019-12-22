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
import java.io.IOException;


import java.util.List;
import entity.*;
import java.util.Date;  
import javax.ejb.EJB;
import session_bean.CategorySessionBean;
import session_bean.ProductDetailSessionBean;
import session_bean.ProductSessionBean;

/**
 *
 * @author DELL
 */

@MultipartConfig
public class viewAddProduct extends HttpServlet {

    String previewPath = "img\\";
    @EJB
    private CategorySessionBean categorySB;
    @EJB
    private ProductSessionBean productSB;
    @EJB
    private ProductDetailSessionBean productDetailSB;
    
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
        List<Product> products = productSB.findAll();
        int size = products.size();
        String product_id = Integer.toString(products.get(size-1).getProductId() + 1);  
        session.setAttribute("product_id", product_id);
        Category category = categorySB.find(Integer.parseInt(category_id));
        if(category != null){
            categoryName = category.getName();
            session.setAttribute("categoryName", categoryName);
            session.setAttribute("category_id", category_id);
        }
        else {
            session.setAttribute("wrongCategory", "1");
            request.getRequestDispatcher("/addFail.jsp").forward(request, response);
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
