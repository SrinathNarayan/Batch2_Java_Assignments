package TreeMapOperation;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Employee {

	   public static void main(String args[]) {
		   Scanner sc=new Scanner(System.in);
	TreeMap tmap =  new TreeMap();
	tmap.put(1,new Empdetails(2234, "Ravi", "Programmer"));
	tmap.put(2,new Empdetails(3241, "Sham", "Team Lead"));
	tmap.put(3,new Empdetails(1894, "Ram", "Tester"));
	tmap.put(4,new Empdetails(6541, "Kishore", "Manager"));
	tmap.put(5,new Empdetails(3698, "Mota", "Programmer"));
	tmap.put(6,new Empdetails(1598, "Lokesh", "Programmer"));
	
	Set set = tmap.entrySet();
    Iterator iterator = set.iterator();
    while(iterator.hasNext()) {
    	Map.Entry mentry = (Map.Entry)iterator.next();
     
       System.out.println(mentry.getValue());
    }
    System.out.println("Enter the Element: ");
    int s =sc.nextInt();
    System.out.println("Element Searched : "+tmap.containsValue(s)); 
	
	
	
	
	   }
}
