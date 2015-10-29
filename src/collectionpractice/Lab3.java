package collectionpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shruthi Routhu
 */
public class Lab3 {
    
    public static void main(String[] args) {
        
        List myList = new ArrayList();
        myList.add(new Employee("Routhu", "Shruthi", "111-111-1111"));
        myList.add(new Dog("Scooby", 2456));
        myList.add(new Employee("Muddada","Raj","555-555-5555"));
        myList.add(new Dog("Scrappy",9876));
        
        System.out.println("Objects in my List:");
        for(Object obj: myList){
            if(obj instanceof Employee){
                Employee e = (Employee)obj ;
                System.out.println(e);
            }else if (obj instanceof Dog){
                Dog d = (Dog)obj;
                System.out.println(d);
            }
        }
        
        
    }
    
}
