package Stringoperations;

import java.util.Scanner;

public class ReplacingString {
	public static void main(String args[]){ 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter String:");
		 String old = input.nextLine();
		 System.out.println(old);
		 System.out.println("Enter Word to replace From String:");
		 String nw = input.nextLine();
		 System.out.println("Enter Word to replace In String:");
		 String nws = input.nextLine();
		String replaceString=old.replace(nw,nws); 
		System.out.println("Replaced String:");
		System.out.println(replaceString);  
		}
	} 

