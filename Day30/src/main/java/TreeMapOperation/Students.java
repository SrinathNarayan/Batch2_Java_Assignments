package TreeMapOperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;



public class Students   {
	
	String Name;
	int Age;
	String Dept;
	
	
	 public Students(String name, int age, String dept) {
		super();
		this.Name = name;
		this.Age = age;
		this.Dept  = dept;
	}

	
	
	@Override
	public String toString() {
		return " [Name:" + Name + ", Age:" + Age + ", Dept:s" + Dept + "]";
	}



	public static class SortbyAge implements Comparator<Students> {
	        public int compare(Students o1, Students o2) {
	            return o1.Age - o2.Age;
	        }
	    }

	public static void main(String[] args) {
        ArrayList<Students> al = new ArrayList<Students>();
        al.add(new Students( "Rohit",24,"Mca"));
        al.add(new Students( "Ram",22,"Bba"));
        al.add(new Students( "Ravi",28,"Mba"));
        al.add(new Students( "Kishore",25,"LLb"));
        al.add(new Students( "Lokesh",21,"Bcom"));
        al.add(new Students( "Mota",20,"Bca"));
        System.out.println("StudentList");
        System.out.println("------------------------------------");
        Collections.sort(al, new SortbyAge());
        
        
        Iterator<Students> iterate = al.iterator();
		  while(iterate.hasNext()){
	          System.out.println(iterate.next());
	         
//        for (int i = 0; i < al.size(); i++) {
//            System.out.println(al.get(i).Name + " " + al.get(i).Age + " "+ al.get(i).Dept);
//        }
    }
	}
}
