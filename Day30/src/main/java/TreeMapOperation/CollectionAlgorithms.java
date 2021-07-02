package TreeMapOperation;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionAlgorithms {
	 public static void main(String[] args)
	    {
	        ArrayList<String>  mylist = new ArrayList<String>();
	        mylist.add("Ram");
	        mylist.add("Ravi");
	        mylist.add("kishore");
	        mylist.add("Lokesh");
	        mylist.add("Mota");
	        mylist.add("jk");
	        System.out.println("Original List : \n" + mylist);	  
	        Collections.shuffle(mylist);
	        System.out.println("\nShuffled List : \n" + mylist);
	        System.out.println("Original List : \n" + mylist);
	        Collections.reverse(mylist);
	        System.out.println("Reverse List : \n" + mylist);
	        System.out.println("Before Swapping : \n" + mylist);
	        Collections.swap(mylist ,1 ,3);
	        System.out.println("After Swapping: \n" + mylist);
	        
	        
	      	        
	    }

}
