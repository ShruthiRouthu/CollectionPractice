package collectionpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Shruthi Routhu
 */
public class Lab1 {

    public static void main(String[] args) {
        
         List books =  new Vector();
         books.add("Emma");
         books.add("Pride and Prejudice");
         books.add("Mansfield Park");
         
         System.out.println("\nMy favourite Books ");
         for(int i=0; i < books.size(); i++){
             String book = (String)books.get(i);
             System.out.println(book);
         }
         
         books.add("Persuasion");
         books.add("Sense and Sensibility");
         
         System.out.println("\nAdded some more Books ");
         for(Object obj : books){
             String book = (String)obj;
             System.out.println(book);
         }
         
         books.remove(0);
         books.remove(3);
        
         System.out.println("\nDeleted some  Books");
         for(Object obj : books){
             String book = (String)obj;
             System.out.println(book);
         }
        
    }
    
    
    
}
