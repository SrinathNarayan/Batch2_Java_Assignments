package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Treesetoperations {
	public static int recurSum(int n)
    {
        if (n <= 1)
            return n;
        return n + recurSum(n - 1);
    }
	
	public static void main(String[] args)
    {
		TreeSet<Integer> list=new TreeSet<Integer>();
		Scanner sc=new Scanner(System.in);
		 int sum=0;
		System.out.println("Enter the Size of TreeSet: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements: ");
		
	    for(int i=0;i<n;i++)
	    { 
	    	list.add(sc.nextInt());
	    }
	    System.out.println("TreeSet: "+list);
       
		for(Integer i:list) {
        	sum=sum+i;
        }
		System.out.println("Sum For Loop:" +sum);
		sum=0;
		Iterator itr=list.iterator();
        while(itr.hasNext())
        {
        	int i=(Integer) itr.next();
        	sum=sum+i;
        }
        System.out.println("Sum While Loop:" +sum);
        
        for(Integer i:list) {
        	System.out.println("Recursion Sum:"+Treesetoperations.recurSum(i));
        }
    }
	
}
