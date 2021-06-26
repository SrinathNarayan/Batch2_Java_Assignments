package Basics;

import java.util.Scanner;

public class CondtionalStatements {
	static int time;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Current Time: ");
        time = sc.nextInt();
        if (time < 12) {
            System.out.println("Good Morning:" + " The Time is " + time + "hrs");
        } else if (time < 18) {
            System.out.println("Good Afternoon:" + " The Time is : " + time +  "hrs");
        }

        else if (time > 18) {
            System.out.println("Good Evening" + " The Time is " + time + "hrs");
        }
        sc.close();

    }
}
