package Day4Assgnments;

import java.util.Scanner;

import Day4AssignmentsCurrency.CurrencyConverter;
import Day4AssignmentsDistanceconverter.DistanceConveter;
import Day4AssignmentsTimeconveter.TimeConveter;

public class Conversion {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i =sc.nextInt();
		System.out.println("Conversion");
		System.out.println("--------------------------------------");
		System.out.println("Select The Option:");
		System.out.println(" 1.Currency \t 2.Time \t 3.Distance");
		if(i==1) {
			CurrencyConverter cur =new CurrencyConverter();
			cur.currency();
		}
		if(i==2) {
			TimeConveter time =new TimeConveter();
			time.time();
		}
		if(i==3) {
			DistanceConveter dis =new DistanceConveter();
			dis.distance();
		}
	}
}
