package entities;

import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-28T01:03:03")
@StaticMetamodel(Groupproduct.class)
public class Groupproduct_ { 

    public static volatile SingularAttribute<Groupproduct, String> groupName;
    public static volatile SingularAttribute<Groupproduct, Integer> groupId;
    public static volatile ListAttribute<Groupproduct, Product> productList;

}