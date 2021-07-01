package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Employee {
	public static void main(String args[]) {
		List<EmpDetails> Emp=new LinkedList<EmpDetails>();
		
		Emp.add(new EmpDetails(1, "Ravi", "Programmer"));
		Emp.add(new EmpDetails(2, "loki", "IT"));
		Emp.add(new EmpDetails(3, "loki", "Sales"));
		Emp.add(new EmpDetails(4, "loki", "Marketing"));
		Emp.add(new EmpDetails(5, "loki", "Developer"));
		Emp.add(new EmpDetails(6, "loki", "Tester"));
		Emp.add(new EmpDetails(7, "loki", "Manager"));
		
		 Iterator<EmpDetails> iterate = Emp.iterator();
		  while(iterate.hasNext()){
	          System.out.println(iterate.next());
	         
	        }
//		for(EmpDetails e:Emp)
//		{
//			System.out.println(e.toString());
//		}
	}
}

