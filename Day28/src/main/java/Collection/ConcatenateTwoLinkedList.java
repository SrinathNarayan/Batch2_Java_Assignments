package Collection;

import java.util.LinkedList;

public class ConcatenateTwoLinkedList {
	public static void main(String[] args) {

		LinkedList<String> Names = new LinkedList<String>();
		Names.add("Srinath");
		Names.add("Kishore");
		Names.add("Ravi");
		Names.add("lokesh");

		LinkedList<Integer> Marks = new LinkedList<Integer>();
		Marks.add(50);
		Marks.add(60);
		Marks.add(70);
		Marks.add(80);

		LinkedList concatenated_list = new LinkedList();

		concatenated_list.addAll(Names);
		concatenated_list.addAll(Marks);

		System.out.println("Names: " + Names);
		System.out.println("Marks: " + Marks);
		System.out.println("Concatenated list: " + concatenated_list);
	}
}
