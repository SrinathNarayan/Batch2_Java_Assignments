package Stringoperations;

import java.util.Scanner;

public class PalindromeCount {
	
    public static void main(String args[])
    {
        String  val = null ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number for the String");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
        	  System.out.print("Enter the String:");
              val= s.next();
              new PalindromeCount().palindromeorNot(val);
        }
      
    }
    
    public void palindromeorNot(String a)
	{	
		String b="";
	    int n = a.length();
	        for(int i = n - 1; i >= 0; i--)
	        {
	            b = b + a.charAt(i);
	        }
	        if(a.equalsIgnoreCase(b))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System.out.println("The string is not palindrome.");
	        }
	}
    }

