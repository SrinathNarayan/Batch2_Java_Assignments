package Basics;

import java.util.Scanner;

public class SimpleMessage {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);       
        System.out.println("--------------------------------");
        System.out.println(" Enter the message");
        System.out.println("--------------------------------");
        String Message = sc.nextLine();
        System.out.println("--------------------------------");
        System.out.println( "Your Message: " + Message);
        System.out.println("--------------------------------");
        sc.close();
    }
}
