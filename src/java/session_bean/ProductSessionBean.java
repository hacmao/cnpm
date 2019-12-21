/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session_bean;

import entity.Product;
import entity.ProductDetail;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.jsp.jstl.sql.Result;
import javax.sql.DataSource;


@Stateless
public class ProductSessionBean extends AbstractSessionBean<Product> {

    @PersistenceContext(name = "lab11PU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductSessionBean(){
        super(Product.class);
    }
    

    
}