package Legacyclass;

import java.util.Vector;

public class VectorEmp {
	 public static void main(String[] args) {
	        Vector<String> mammals= new Vector<String>();
	        mammals.add("Dog");
	        mammals.add("Horse");
	        mammals.add(2, "Cat");
	        System.out.println("Vector: " + mammals);
	        Vector<String> animals = new Vector<String>();
	        animals.add("Crocodile");

	        animals.addAll(mammals);
	        System.out.println("New Vector: " + animals);
	        
	        
	        String element = animals.remove(1);
	        System.out.println("Removed Element: " + element);
	        System.out.println("New Vector: " + animals);

	       
	        animals.clear();
	        System.out.println("Vector after clear(): " + animals);
	    }
	 
}
