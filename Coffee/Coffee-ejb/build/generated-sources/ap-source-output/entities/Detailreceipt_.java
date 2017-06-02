package entities;

import entities.DetailreceiptPK;
import entities.Product;
import entities.Receipt;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-28T01:03:03")
@StaticMetamodel(Detailreceipt.class)
public class Detailreceipt_ { 

    public static volatile SingularAttribute<Detailreceipt, Product> product;
    public static volatile SingularAttribute<Detailreceipt, Integer> count;
    public static volatile SingularAttribute<Detailreceipt, Receipt> receipt;
    public static volatile SingularAttribute<Detailreceipt, DetailreceiptPK> detailreceiptPK;

}