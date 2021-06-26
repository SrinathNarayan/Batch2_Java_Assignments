package Others;

import java.util.Scanner;

public class StudentMainClass {
	public static void main(String args[])throws OutOfBoundExceptions
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student  Portal");
		System.out.println("--------------------------------------");
        System.out.println("Enter The Student No");
        int rollNo = sc.nextInt(); 
        System.out.println("Enter The Student Name");
        String name = sc.next();
        System.out.println("Enter The Marks");
        int marks= sc.nextInt();
        StudentDetails s = new StudentDetails(rollNo, name, marks);
        
        if(s.ValidateMarks(marks) == true)
        {
        	System.out.println("You Have Passed");
        	System.out.println(s.toString());
        }else
        {
        	System.out.println("You Have Failed");
        	System.out.println(s.toString());
        }
}
}
