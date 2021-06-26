package Numbers;

import java.util.Scanner;



public class NumberClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		double n=sc.nextDouble();
		NumberOperation No=new NumberOperation();
		boolean b=No.isZero(n);
		System.out.println("IsZero: " +b );	
		boolean p=No.isPositive(n);
		System.out.println("IsPostive: " +p);
		boolean ng=No.isNegative(n);
		System.out.println("IsNegative: " +ng);
		boolean odd=No.isOdd(n);
		System.out.println("IsOdd: " +odd);
		boolean even=No.isEven(n);
		System.out.println("IsEven: " +even);
		boolean prime=No.isPrime(n);
		System.out.println("Is Prime: " +prime);
		boolean arm=No.isArmstrong(n);
		System.out.println("IsArmstrong: " +arm);
		No.getfactorial(n);
		double sq=No.getSqrt(n);
		System.out.println("SqaureRoot of "+ n + " is : "+sq);
		double square=No.getSqr(n);
		System.out.println("Sqaure of " + n + "is : " +square);
		double sumdigi=No.sumDigits(n);
		System.out.println("Sum of Digits of "+ n + "is : "+sumdigi);
		double revres=No.getReverse(n);
		System.out.println("Reverse of " +n + "is: " +revres);
		sc.close();
	}
}
