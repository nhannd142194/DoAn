package entities;

import entities.Detailreceipt;
import entities.Employee;
import entities.Tablecoffee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-28T01:03:03")
@StaticMetamodel(Receipt.class)
public class Receipt_ { 

    public static volatile SingularAttribute<Receipt, Date> date;
    public static volatile SingularAttribute<Receipt, Long> totalPrice;
    public static volatile ListAttribute<Receipt, Tablecoffee> tablecoffeeList;
    public static volatile SingularAttribute<Receipt, Employee> employeeId;
    public static volatile ListAttribute<Receipt, Detailreceipt> detailreceiptList;
    public static volatile SingularAttribute<Receipt, Integer> receiptId;
    public static volatile SingularAttribute<Receipt, String> customerName;
    public static volatile SingularAttribute<Receipt, Boolean> status;

}