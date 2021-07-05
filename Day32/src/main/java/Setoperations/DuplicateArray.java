package Setoperations;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class DuplicateArray {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements of array: ");
		n=sc.nextInt();
		int[] arr=new int[5];
		System.out.println("Enter array elements: ");
		for (int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Array Elements: ");
		for (int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for (int i : arr) {
            if (!treeSet.add(i)) {
                System.out.println("Duplicate Entry is: " + i);
            }
        }
        System.out.println("TreeSet: " +treeSet);

	sc.close();

	}
}
