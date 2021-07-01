package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap {
	public static void main(String args[]) {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	hm.put(2000, "January");
	hm.put(2021, "March");
	hm.put(2003, "Febaury");
	hm.put(2005, "June");
	hm.put(2008, "July");
	hm.put(2020, "October");
	System.out.println("HashMap: "+hm);
	System.out.println("--------------------------------------------");
	System.out.println("Sorted By Keys");
	System.out.println("--------------------------------------------");
	Set<Integer> setKeys = hm.keySet();
	for(Integer key : setKeys){
	    System.out.println( key );
	}
	
	System.out.println("--------------------------------------------");
	System.out.println("Sorted By Values");
	System.out.println("--------------------------------------------");
	  System.out.println("Values: " + hm.values());

	
}
}