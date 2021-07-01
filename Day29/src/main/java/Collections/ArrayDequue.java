package Collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayDequue {
	public static void main(String[] args) 
	{
		
		
		ArrayDeque<String> list= new ArrayDeque<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Deque: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements: ");
		
	    for(int i=0;i<n;i++)
	    { 
	    	list.add(sc.nextLine());
	    }
	    System.out.println("Deque: "+list);
	    
       
        String lastElement = list.peekLast();
        System.out.println("Last Element: " + lastElement);
        
    
        String element = list.removeLast();
        System.out.println("Removed Element: " + element);
        System.out.println("New ArrayDeque: " + list);
    }    
}
	
