package ArrayDemostration;

import java.util.Scanner;

public class ArrayClass {
	public void one() {
	      int len;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter Array length : ");
	      len = sc.nextInt();
	      int a[] = new int[len];
	      System.out.print("Enter " + len + " Element to Store in Array :\n");
	      for (int i = 0; i < len; i++) {
	         a[i] = sc.nextInt();
	      }
	      System.out.print("Elements in Array are :\n");
	      for (int i = 0; i < len; i++) {
	         System.out.print(a[i] + "  ");
	      }
	      sc.close();
	   }

	   public void two() {
	      int row, col, i, j;
	      int arr[][] = new int[10][10];
	      Scanner scan = new Scanner(System.in);

	      System.out.print("Enter row for the array (max 10) : ");
	      row = scan.nextInt();
	      System.out.print("Enter column for the array (max 10) : ");
	      col = scan.nextInt();

	      System.out.println("Enter " + (row * col) + " Array Elements : ");
	      for (i = 0; i < row; i++) {
	         for (j = 0; j < col; j++) {
	            arr[i][j] = scan.nextInt();
	         }
	      }

	      System.out.print("The Array is :\n");
	      for (i = 0; i < row; i++) {
	         for (j = 0; j < col; j++) {
	            System.out.print(arr[i][j] + "  ");
	         }
	         System.out.println();
	      }
	   }



	   public void length() {
	      int len;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter Array length : ");
	      len = sc.nextInt();
	      int a[] = new int[len];
	      System.out.println("Enter " + len + " Element to Store in Array :\n");
	      for (int i = 0; i < len; i++) {
	         a[i] = sc.nextInt();
	      }
	      System.out.println("Elements in Array are :\n");
	      for (int i = 0; i < len; i++) {
	         System.out.print(a[i] + "  ");
	      }
	      int arrayLength = a.length;
	      System.out.println("The length of the array is: " + arrayLength);
	      sc.close();
	   }
}
