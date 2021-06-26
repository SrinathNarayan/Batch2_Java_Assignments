package Basics;

import java.util.Scanner;



public class CalculationOPerations {
	static int frist;
    static int second;

        public void add() {
            System.out.println("Addition");
            System.out.println("--------------------------------");
            System.out.println("Frist Number:" + frist);
            System.out.println("Second Number:" + second);
            int result = frist + second;
            System.out.println("--------------------------------");
            System.out.println("Th Result:" + result);
            System.out.println("--------------------------------");
        }

        public void sub() {
            System.out.println("Subtraction");
            System.out.println("--------------------------------");
            System.out.println("Frist Number:" + frist);
            System.out.println("Second Number:" + second);
            int result = frist - second;
            System.out.println("--------------------------------");
            System.out.println("Th Result:" + result);
            System.out.println("--------------------------------");
        }

        public void multiply() {
            System.out.println("Multiplication");
            System.out.println("--------------------------------");
            System.out.println("Frist Number:" + frist);
            System.out.println("Second Number:" + second);
            int result = frist * second;
            System.out.println("--------------------------------");
            System.out.println("Th Result:" + result);
            System.out.println("--------------------------------");
        }

        public void Divide() {
            System.out.println("Division");
            System.out.println("--------------------------------");
            System.out.println("Frist Number:" + frist);
            System.out.println("Second Number:" + second);
            int result = frist / second;
            System.out.println("--------------------------------");
            System.out.println("Th Result:" + result);
            System.out.println("--------------------------------");
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner cc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println(" Enter the 1st Number  ");
        System.out.println("--------------------------------");
        frist = sc.nextInt();
        System.out.println(" Enter the 2st Number  ");
        System.out.println("--------------------------------");
        second = cc.nextInt();
        int i;
        System.out.println("\t\t\t\t\t    1.Addition \n \t\t\t\t\t    2.Subtraction \n \t\t\t\t\t    3.Multiplication  \n \t\t\t\t\t    4.Division  ");
        System.out.println("\t\t\t\t\t  Enter your option");
         i = sc.nextInt();
         
        if (i==1) {
            new CalculationOPerations().add();
        }
        if (i==2) {
            new CalculationOPerations().sub();
        }
        if (i==3) {
            new CalculationOPerations().multiply();
        }
        if (i==4) {
            new CalculationOPerations().Divide();
        }

        sc.close();
        cc.close();
    }
}
