package Day1Assignments;

import java.util.Scanner;



public class ArrayDemonstrationMainclass   {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("--------------------------------");
	        System.out.println("Array Demonstration ");
	        System.out.println("--------------------------------");
	      
	        System.out.println("\t\t\t\t\t    1.One dimensional \n \t\t\t\t\t    2. Two Dimentional \n \t\t\t\t\t   3. Length of3 array     ");
	        System.out.println("\t\t\t\t\t  Enter your option");
	          int i = sc.nextInt();

	          ArrayDemonstration array= new ArrayDemonstration();
	          if(i==1){
	              array.one();
	          }
	          if(i==2){
	              array.two();

	          }
	          if(i==3){
	            array.length();

	        }
	          sc.close();
	    }
}
