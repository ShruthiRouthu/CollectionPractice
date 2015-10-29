package collectionpractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author Shruthi Routhu
 */
public class CollectionPractice {
    
    public static void main(String[] args) {
    
    //-----------------Class 18 -------------------     
      //  ArrayList groceryList = new ArrayList();
      //  List groceryList =   new Vector(); 
      // Collection groceryList = new HashSet();
//        List<String> groceryList = new ArrayList<>();
//        groceryList.add("Beer");
//        groceryList.add("Chips");
//        groceryList.add("Chicken Wings");
//        groceryList.add("Beer");
//       // groceryList.add(5); primitives are automatically converted to objects from JDK 5
//        
//        for(String item : groceryList){  
//            System.out.println(item);   
//        }
        
    //-----------------Class 19 ------------------- 
        
        List <String> names = new ArrayList<>();
        names.add("john");
        names.add("sally");
        names.add("pete");
        names.add("john");
        
        Set<String> noDupes = new LinkedHashSet<>(names);
        names = new ArrayList<>(noDupes);
        System.out.println(names.get(0));
        
        
    }
    
}
