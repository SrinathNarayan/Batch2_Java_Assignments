package Assignments;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) 
	  { 
	    Queue<Integer>Qlist = new LinkedList<Integer>(); 
	    for (int i=0; i<10; i++) 
	    	Qlist.add(i); 
	System.out.println("-------------------------------------");
	System.out.println("Elements of Queue : "+Qlist); 
	System.out.println("-------------------------------------");
	int remove= Qlist.remove(); 
	System.out.println("Removed element from the Queue : " + remove); 
	System.out.println(Qlist); 
	System.out.println("-------------------------------------");
	int head = Qlist.peek(); 
	System.out.println("head of queue=" + head); 
	System.out.println("-------------------------------------");
	int size= Qlist.size(); 
	System.out.println("Size of queue=" + size); 
	  } 
}
