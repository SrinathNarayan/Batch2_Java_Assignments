package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ListiteratorAndIterator {
public static void main(String args[]) {
        
        ArrayList<String> list = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
   
        System.out.println("Enter number of elements");
        int n = in.nextInt();
        System.out.println("Enter " + n + " elements");
        for(int i=0 ; i <= n; i++) {
        	String data = in.next();
            list.add(data);
        }
        
        Iterator<String> iterate = list.iterator();
        System.out.println("-------------------------------------------------"); 
        System.out.println("Using Iterator:");
        System.out.print("ArrayList: ");
        while(iterate.hasNext()){
          System.out.print(iterate.next());
          System.out.print(", ");
        }
     
      
       
     
        ListIterator itrr = list.listIterator();
    	   
        System.out.println( "Using ListIterator");
        System.out.println("-----------------------------------------------------");
         System.out.println("Iterating in forward direction");
         System.out.println("-----------------------------------------------------");
         while(itrr.hasNext()) {
          System.out.println(itrr.next());
         }
     
         System.out.println("-----------------------------------------------------");
          System.out.println("Iterating in backward direction");
          System.out.println("-----------------------------------------------------");
        while(itrr.hasPrevious())
          System.out.println(itrr.previous());
         }
        
        
}

