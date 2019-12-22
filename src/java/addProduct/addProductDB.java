/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addProduct;




import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
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
public class addProductDB extends HttpServlet {

    private String PATH = "D:\\BK2\\cnpm\\final2\\web\\img\\";
    @EJB
    private CategorySessionBean categorySB;
    @EJB
    private ProductSessionBean productSB;
    @EJB
    private ProductDetailSessionBean productDetailSB; 
    
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
            img.add(null);
        }
        
        Product product = new Product();
        product.setProductId(product_id);
        product.setName(name);
        product.setDescription(Description);
        product.setDescriptionDetail(DescriptionDetail);
        product.setPrice(price);
        product.setImage(img.get(0));
        product.setThumbImage(img.get(0));
        product.setLastUpdate(new Date());
        product.setCategorycategoryid(categorySB.find(category_id));
        product.setProductDetailproductId(product_id);
        productSB.create(product);
        
        ProductDetail productDetail = new ProductDetail();
        productDetail.setProductId(product_id);
        productDetail.setInformation(Description);
        productDetail.setImage1(img.get(1));
        productDetail.setImage2(img.get(2));
        productDetail.setImage3(img.get(3));
        productDetail.setImage4(img.get(4));
        productDetail.setImage5(img.get(5));
        productDetail.setQuantity(1000);
        productDetail.setGuaranty(warranty);
        productDetail.setNumSelled(0); 
        productDetailSB.create(productDetail);
        
        request.getRequestDispatcher("/category?" + category_id).forward(request, response);
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
