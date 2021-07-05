package Setoperations;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesClass {
	public static void main(String args[]) {
	      Properties lang = new Properties();
	      Set states;
	      String str;
	      
	      lang.put("Java", "Angular");
	      lang.put("Css", "HTML");
	      lang.put("React", "JavaScript");
	      lang.put("Php", "Sql");
	      lang.put("FireBase", ".Net");

	   
	      states = lang.keySet();  
	      Iterator itr = states.iterator();
	      
	      while(itr.hasNext()) {
	         str = (String) itr.next();
	         System.out.println("The" + " " + str + " Can be Used With " + 
	        		 lang.getProperty(str) + ".");
	      }     
	     
}
}
