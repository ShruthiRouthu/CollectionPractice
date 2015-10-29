package collectionpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shruthi Routhu
 */
public class Lab2 {
    
    public static void main(String[] args) {
        
        List<Employee>  employees  =  new ArrayList<>();
        employees.add(new Employee("Routhu", "Shruthi", "111-111-1111"));
        employees.add(new Employee("Lombardo", "Jim", "222-222-2222"));
        employees.add(new Employee("Muddada", "Raj", "333-333-3333"));
        
        System.out.println("Employees in my List:");
        for(Employee e : employees){
            Employee emp = e;
            System.out.println(e);
        }
    }
    
}
