/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import entity.*;
import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import session_bean.CategorySessionBean;
import session_bean.ProductSessionBean;
import java.util.*;
import session_bean.ProductDetailSessionBean;

/**
 * Web application lifecycle listener.
 *
 * @author Admin
 */
public class ControllerServletListener implements ServletContextListener {
    @EJB
    ProductSessionBean productSessionBean;
    @EJB
    CategorySessionBean categorySessionBean;
    @EJB 
    ProductDetailSessionBean productDetailSessionBean;
    ServletContext context;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        context = sce.getServletContext();
        
        List<Product> products = productSessionBean.findAll();
        int size = products.size();
        List<ProductDetail> productDetails = productDetailSessionBean.findAll();
        Collections.sort(productDetails, Comparator.comparing(ProductDetail::getNumSelled)); 
        List<Product> bestProducts = new ArrayList<Product>();
        for (int i=0;i < 5; i++) {
            bestProducts.add(productSessionBean.find(productDetails.get(size - i - 1).getProductId()));
        }
        
        context.setAttribute("bestProducts", bestProducts);
        context.setAttribute("newProducts", products.subList(size - 5, size ));
        context.setAttribute("categories", categorySessionBean.findRange(new int[] {0,5}));
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
