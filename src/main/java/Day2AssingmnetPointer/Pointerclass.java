package Day2AssingmnetPointer;

import java.util.Scanner;

public class Pointerclass {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Point x and Y");
		int a = sc.nextInt();
		int b = sc.nextInt();
		PointerOperation p = new PointerOperation();
		p.setX(a);
		p.setY(b);
		System.out.println(p.toString());
	}
}
