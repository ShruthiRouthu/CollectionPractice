package collectionpractice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Shruthi Routhu
 */
public class Lab4 {
    
    public static void main(String[] args) {
        
        Set<Employee> employeeSet = new HashSet<>();
        
        employeeSet.add(new Employee("Routhu", "Shruthi", "111-111-1111"));
        employeeSet.add(new Employee("Muddada","Raj","555-555-5555"));
        employeeSet.add(new Employee("Lombardo","Jim","555-555-5555"));
        employeeSet.add(new Employee("Austen", "Jane","222-222-2222"));
        
        System.out.println("Employees in my Set:");
        for(Employee e : employeeSet){
            Employee emp = e;
            System.out.println(e);
        }

        
    }
    
}
