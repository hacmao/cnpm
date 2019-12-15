package session_bean;
import entity.OrderedProduct;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
*
* @author ThanDieu
*/
@Stateless
public class OrderedProductSessionBean extends AbstractSessionBean<OrderedProduct> {
    @PersistenceContext(name = "lab11PU")
    private EntityManager em;
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    public OrderedProductSessionBean() {
        super(OrderedProduct.class);
    }

    @Override
    public OrderedProduct create(OrderedProduct entity) {
        getEntityManager().persist(entity);
        return entity;
    }
    public List<OrderedProduct> findByOrderId(Object id) {
        return em.createNamedQuery("OrderedProduct.findByOrderId").setParameter("orderId", id).getResultList();
    }
}