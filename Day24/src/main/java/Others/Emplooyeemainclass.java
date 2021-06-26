package Others;

import java.util.Scanner;

public class Emplooyeemainclass {
	public static void main(String[] args) throws OutOfBoundExceptions
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Portal");
		System.out.println("--------------------------------------");
        System.out.println("Enter The Employee No:");
        int empNo = sc.nextInt(); 
        System.out.println("Enter The Employee Name:");
        String name = sc.next();
        System.out.println("Basic Pay");
        int bp= sc.nextInt();
        Employeeclass e = new Employeeclass(empNo, name, bp);
        System.out.println("--------------------------------------");
        if(e.ValidateBpay(bp))
        {
        	System.out.println("You Are Eligible");
        	 System.out.println("--------------------------------------");
        	System.out.println(e.toString());
        }else
        {
        	System.out.println("You Are Not Eligible");
        	 System.out.println("--------------------------------------");
        	System.out.println(e.toString());
        }
	}
}
