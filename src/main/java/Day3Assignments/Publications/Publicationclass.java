package Day3Assignments.Publications;

import java.util.Scanner;



public class Publicationclass {
public static void main(String[] args) {
		
		System.out.println( "\t\t\tMYStore");
		System.out.println("--------------------------------------------------------------------");
		int i,j;
		System.out.println("1.Book\n2.Cd"); 
		Scanner c = new Scanner(System.in);  
		System.out.println(" Enter Your Option");
		i= c.nextInt();
		
		if(i==1) {
			Details pro = new Details();
			pro.Bookdetails();
			
		}
		
		if(i==2) {
			Details ap = new Details();
			ap.cddetails();
			
		}
}
}
