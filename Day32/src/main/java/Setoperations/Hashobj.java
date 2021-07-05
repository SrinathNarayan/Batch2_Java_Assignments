package Setoperations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashobj  {

	public static void main(String[] args)
	{
		HashSet<ArrayList> hs=new HashSet<ArrayList>();
		
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Kishore");
		arr1.add("Lokesh");
		arr1.add("Mota");
		arr1.add("Rai");
		arr1.add("Ram");
		arr1.add("Jk");
		
		
		ArrayList<MyownClass> arr2=new ArrayList<MyownClass>();
		arr2.add(new MyownClass("Kishore",24));
		arr2.add(new MyownClass("Lokesh",25));
		arr2.add(new MyownClass("Mota",22));
		arr2.add(new MyownClass("Rai",23));
		arr2.add(new MyownClass("Ram",26));
		arr2.add(new MyownClass("Jk",28));
		
		ArrayList<Integer> arr3=new ArrayList<Integer>();
		arr3.add(24);
		arr3.add(25);
		arr3.add(22);
		arr3.add(23);
		arr3.add(26);
		arr3.add(28);
		
		hs.add(arr1);
        hs.add(arr2);
        hs.add(arr3);
        
        Iterator itr = hs.iterator();
        while (itr.hasNext())
            System.out.println(itr.next() + ", ");
        System.out.println();
	}
}
