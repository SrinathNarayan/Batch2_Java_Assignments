package Stringoperations;

import java.util.Scanner;

public class Subsetoperation {
	public static void SubString(String str, int n) {
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j <= n; j++)
				System.out.println(str.substring(i, j));
	}

	public static void main(String[] args) {
	
		 Scanner s = new Scanner(System.in);
	        System.out.println("Enter The String");
	    	String str= s.nextLine();
	    	System.out.println("Subset Of the Given String:"+ str);
	    	System.out.println("---------------------------------------------");
		SubString(str, str.length());
	}
}
