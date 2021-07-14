package Assignmnets;

public class SplitMethodExample {
	 public static void main(String args[]) 
	    { 
	        String str = "We're, Ridiculously Committed! Welcome to JAVA.Hello"; 
	        String[] arrOfStr = str.split("[, .!]+"); 
	        
	         System.out.println("Number of substrings: "+arrOfStr.length);
	         System.out.println("--------------------------------------");	         
	         for(int i=0; i< arrOfStr.length; i++)
	         {
	             System.out.println("str["+i+"] : "+arrOfStr[i]);
	         }
	 
	    } 
}
