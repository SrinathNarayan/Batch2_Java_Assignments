package Setoperations;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Hashtables {
	 public static void main(String[] args)
	    {
	 
		 Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	        ht.put(1, "Ram");
	        ht.put(2, "Shyam");
	        ht.put(3, "Bijay");
	        ht.put(4, "Hritik");
	        ht.put(5, "Piyush");
	        Set entrySet = ht.entrySet();
	        Iterator it = entrySet.iterator();
	    System.out.println("Hashtable entries : ");
	    while(it.hasNext())
	    System.out.println(it.next());
	        
	         
	      }
}
