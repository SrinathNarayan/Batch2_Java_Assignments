package TreeMapOperation;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Phone {
	  public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	TreeMap<String,Integer> tmap =  new TreeMap<String,Integer>();
	tmap.put("Ram", 223496852);
	tmap.put("kishore", 963258741);
	tmap.put("Sham", 223698521);
	tmap.put("Ravi", 963258741);
	tmap.put("Lokesh", 369852147);
	tmap.put("Guna", 963741258);
	System.out.println("Phone Book");
	System.out.println("---------------------------------------");
	for(Map.Entry<String,Integer> t:tmap.entrySet())
	{
		System.out.println(t.getKey()+ " :"+ +t.getValue());
	}
	System.out.println("---------------------------------------");
	System.out.println("Enter the Name: ");
    String s =sc.nextLine();
    System.out.println("Element Searched : " + "Name:"+ s+" "+ "Phnono:" +tmap.get(s));
    System.out.println();

 }
	 
	
	
	  }

