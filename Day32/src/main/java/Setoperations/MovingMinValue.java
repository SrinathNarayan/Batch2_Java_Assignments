package Setoperations;

import java.util.ArrayList;
import java.util.Scanner;

public class MovingMinValue {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arrl=new ArrayList<Integer>();
		arrl.add(23);
		arrl.add(3);
		arrl.add(36);
		arrl.add(78);
		arrl.add(96);
		arrl.add(15);
		System.out.println("Before Re-arranging : "+arrl);
		int min=arrl.get(0);
		int mindex=0;
		for(int i=0;i<5;i++)
		{
			if(arrl.get(i)<min)
			{
				min=arrl.get(i);
				mindex=i;
			}
		}
		
		arrl.remove(mindex);
		arrl.add(0,min);
		System.out.println("After Re-arranging : "+arrl);
	}
}

