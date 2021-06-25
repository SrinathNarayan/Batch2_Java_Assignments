package Day3Assignments.PayslipGeneration;

import java.util.Scanner;

public class PayslipGeneration {
public static void main(String[] args) {
		
		System.out.println( "\t\t\t Payslip Generation");
		System.out.println("--------------------------------------------------------------------");
		int i,j,k,l;
		System.out.println(" 1.PROGRAMMER \t 2.ASSISTANT PROFESSOR \t 3.ASSOCIATE PROFESSOR \t 4.PROFESSOR "); 
		Scanner c = new Scanner(System.in);  
		System.out.println("\t\t\t  Enter Your Option");
		i= c.nextInt();
		
		if(i==1) {
			Programmer pro = new Programmer();
			pro.getdata();
			pro.getprogrammerdetails();
			pro.display();
			pro.calculateprogrammerpayslip();
		}
		
		if(i==2) {
			AssistantProfessor ap = new AssistantProfessor();
			ap.getdata();
			ap.getassociatedeatils();
			ap.display();
			ap.calculateassociateplaylip();
		}
		if(i==3) {
			AssociateProfessor ap = new AssociateProfessor();
			ap.getdata();
			ap.getassociatedeatils();
			ap.display();
			ap.calculateassociatepayslip();
		}
		if(i==4) {
			Professor ap = new Professor();
			ap.getdata();
			ap.getprofessordetails();
			ap.display();
			ap.calculateprofessorPaySlip();
		}
		
		
	}
}
