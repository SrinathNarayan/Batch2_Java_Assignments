package Others;

import java.util.Scanner;

public class NoOfRecords {
	private static int i;
	public static void main(String[] args) {
		String[] a = { "1", "Srm", "12", "Tech", "4", "Traning" };
		int len = a.length;
		int count = 0;
		System.out.println("length of a :="+ len);
		for (int i = 0; i < a.length; i++)
			
		{

			if (a[i].matches("^[0-9]+$")) {
				count++;
			}
		}
		System.out.println("Count of Digits : " + count);
	}
}
