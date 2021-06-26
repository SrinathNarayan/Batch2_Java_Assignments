package BillGeneration;

import java.util.Scanner;

public class Domesic {
	void domesticdetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter consumer number: ");
		int cn=sc.nextInt();
		System.out.println("Enter Consumer name : ");
		String cm=sc.next();
		System.out.println("Enter Previous Reading: ");
		int pr=sc.nextInt();
		System.out.println("Enter Current Reading: ");
		int cr=sc.nextInt();
		System.out.println("View Bill (Yes/No): ");
		String ct=sc.next();
		int units=cr-pr;
		System.out.println("Total Units: "+units);
		BillOperations eb=new BillOperations();
		eb.Domestic(ct, units);
		eb.domesticdiaplay(units, ct, units, ct, units);
		sc.close();
		}
}
