package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class RepalcingArrayElement {
	public static void main(String args[]) {
        
        ArrayList<String> list = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
   
        System.out.println("Enter number of elements");
        int n = in.nextInt();
        System.out.println("Enter " + n + " elements");
        for(int i=0 ; i <= n; i++) {
        	String data = in.next();
            list.add(data);
        }
        System.out.println(list);
        list.set(1, "HBase");
        System.out.println(list);     
	}            
}
        

