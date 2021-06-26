package BillGeneration;

import java.util.Scanner;



public class BillGeneration {
public static void main(String[] args) {
		
		System.out.println( "\t\t\t Bill Generation");
		System.out.println("--------------------------------------------------------------------");
		int i;
		System.out.println(" 1.Domestic \t 2.Comercial"); 
		Scanner c = new Scanner(System.in);  
		System.out.println("\t\t\t  Enter Your Option");
		i= c.nextInt();
		
		if(i==1) {
			Domesic pro = new Domesic();
			pro.domesticdetails();
		
			
		}
		
		if(i==2) {
			Comercial ap = new Comercial();
			ap.comercialdetails();
			
		}
}
}
