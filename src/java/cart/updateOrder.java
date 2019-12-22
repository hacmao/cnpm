/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;

import entity.Customer;
import entity.CustomerOrder;
import entity.OrderInfo;
import entity.OrderedProduct;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session_bean.CustomerOrderSessionBean;
import session_bean.CustomerSessionBean;
import session_bean.OrderManager;
import session_bean.OrderedProductSessionBean;
import session_bean.ProductSessionBean;

/**
 *
 * @author DELL
 */
public class updateOrder extends HttpServlet {
    
    @EJB
    private ProductSessionBean productSB;
    @EJB 
    private OrderManager orderManager ;
    @EJB
    private CustomerOrderSessionBean customerOrderSB;

    @EJB
    private OrderedProductSessionBean orderedProductSB;
    @EJB
    private CustomerSessionBean customerSB;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        HttpSession session = request.getSession();
        List<Customer> customers = customerSB.findAll();
        List<CustomerOrder> customerOrders = customerOrderSB.findAll(); 

        List<OrderInfo> orderInfos = new ArrayList<OrderInfo>() ;
        SimpleDateFormat  df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        int size = customers.size(); 
        CustomerOrder customerOrder = null;
        for (int i=0; i < size; i++) {
            Customer customer = customers.get(i);
            if (customerId != customer.getCustomerId()) continue; 
            for (CustomerOrder c : customerOrders){
                if(c.getCustomerId().getCustomerId() == customerId){
                    customerOrder = c;
                    break;
                }
            }
            customerOrder.setStatus(request.getParameter("status"));
            customerOrderSB.edit(customerOrder);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}