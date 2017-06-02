package entities;

import entities.Receipt;
import entities.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-28T01:03:03")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> employeeName;
    public static volatile SingularAttribute<Employee, String> address;
    public static volatile SingularAttribute<Employee, String> role;
    public static volatile ListAttribute<Employee, User> userList;
    public static volatile ListAttribute<Employee, Receipt> receiptList;
    public static volatile SingularAttribute<Employee, String> phone;
    public static volatile SingularAttribute<Employee, Integer> employeeId;

}