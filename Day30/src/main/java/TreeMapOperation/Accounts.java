package TreeMapOperation;

import java.util.Scanner;
import java.util.TreeMap;

public class Accounts {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer,Double> tmap=new TreeMap<Integer,Double>();
		tmap.put(123456789, 25000.00);
		tmap.put(321654987, 40789.35);
		tmap.put(147852369, 15000.20);
		tmap.put(258963147, 80000.00);
		tmap.put(123987456, 45000.00);
		
		System.out.println("Account Information ");
		System.out.println("------------------------------");
		System.out.println(tmap);
		System.out.println(" \n Enter Acc.No: ");
		int a=sc.nextInt();
		if(tmap.containsKey(a))
		{
			System.out.println(" \n Retrive Account balance("+a+"): "+tmap.get(a));
		}
		else
		{
			System.out.println("\n Enter Valid Data...");
		}
	}
}
