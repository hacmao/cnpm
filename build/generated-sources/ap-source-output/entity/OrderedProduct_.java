package entity;

import entity.CustomerOrder;
import entity.ProductDetail;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-14T22:20:42")
@StaticMetamodel(OrderedProduct.class)
public class OrderedProduct_ { 

    public static volatile CollectionAttribute<OrderedProduct, CustomerOrder> customerOrderCollection;
    public static volatile SingularAttribute<OrderedProduct, Integer> quantity;
    public static volatile SingularAttribute<OrderedProduct, Integer> productId;
    public static volatile SingularAttribute<OrderedProduct, Integer> orderId;
    public static volatile CollectionAttribute<OrderedProduct, CustomerOrder> customerOrderCollection1;
    public static volatile CollectionAttribute<OrderedProduct, ProductDetail> productDetailCollection;

}