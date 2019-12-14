/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session_bean;
import entity.Category;
import entity.Product; 
import java.util.List;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author DELL
 */
@Stateless
public class CategorySessionBean extends AbstractSessionBean<Category>{
    @PersistenceContext(name = "lab11PU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategorySessionBean(){
        super(Category.class);
    }
}
