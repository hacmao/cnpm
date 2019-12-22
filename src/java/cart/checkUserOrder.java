/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;

import entity.*;
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
import session_bean.UserSessionBean;

/**
 *
 * @author DELL
 */
public class checkUserOrder extends HttpServlet {

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
    @EJB
    private UserSessionBean userSessionBean;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user; 
        String userName;
        userName = request.getParameter("userName");
        if (userName == null){
            user = (User) session.getAttribute("user");
            
            userName = user.getName();
        }
        
        List<Customer> customers = customerSB.findAll();
        List<CustomerOrder> customerOrders = customerOrderSB.findAll(); 

        List<OrderInfo> orderInfos = new ArrayList<OrderInfo>() ;
        SimpleDateFormat  df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        int size;
        if (customers != null){
            size = customers.size(); 
            CustomerOrder customerOrder = null;
            for (int i=0; i < size; i++) {
                Customer customer = customers.get(i);
                int customerId = customer.getCustomerId();
                if (!customer.getName().equals(userName) && !customer.getName().equals(userName + "(admin)")) continue;
                for (CustomerOrder c : customerOrders){
                    if(c.getCustomerId().getCustomerId() == customerId){
                        customerOrder = c;
                        break;
                    }
                }
                System.err.println("lol");
                OrderInfo orderInfo = new OrderInfo();
                orderInfo.setId(customerId);
                orderInfo.setName(customer.getName());
                orderInfo.setCcNumber(customer.getCcNumber());
                orderInfo.setConfirmationNumber(customerOrder.getConfirmationNumber()); 
                orderInfo.setDateCreated(df.format(customerOrder.getDateCreated())); 
                orderInfo.setStatus(customerOrder.getStatus());
                List<String> products = new ArrayList<String>();
                List<String> amounts = new ArrayList<String>();

                List<OrderedProduct> orderedProducts = orderedProductSB.findByOrderId(customerOrder.getOrderId());
                for (OrderedProduct op : orderedProducts) {
                    Product p = (Product) productSB.find(op.getProductId().getProductId());
                    products.add(p.getName());
                    amounts.add(Integer.toString(op.getQuantity()));
                }

                orderInfo.setProducts(products);
                orderInfo.setAmounts(amounts);
                orderInfos.add(orderInfo);

            }
        } else size = 0;
        session.setAttribute("size", size);
        session.setAttribute("orderInfos", orderInfos);
        request.getRequestDispatcher("checkUserOrder.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


}
