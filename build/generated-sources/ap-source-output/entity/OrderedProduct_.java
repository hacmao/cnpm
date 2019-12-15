package entity;

import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-15T22:37:00")
@StaticMetamodel(OrderedProduct.class)
public class OrderedProduct_ { 

    public static volatile SingularAttribute<OrderedProduct, Integer> quantity;
    public static volatile SingularAttribute<OrderedProduct, Product> productId;
    public static volatile SingularAttribute<OrderedProduct, Integer> orderId;
    public static volatile SingularAttribute<OrderedProduct, Integer> id;

}