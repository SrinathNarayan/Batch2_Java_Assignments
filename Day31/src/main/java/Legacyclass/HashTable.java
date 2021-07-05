package Legacyclass;

import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(1, "JaVa");
		ht.put(2, "Angular");
		ht.put(3, "React");
		ht.put(4, "JavaScript");
		ht.put(5, "Android");
		ht.put(6, "Sql");

		System.out.println("Displaying entries in hash table: ");
		System.out.println("------------------------------------------");
		System.out.println(ht);
		System.out.println("------------------------------------------");
		int size = ht.size();
		System.out.println("Size of hash table: " + size);
		System.out.println("------------------------------------------");
		String removeE = ht.remove(6);
		System.out.println("Removed entry: " + removeE);
		System.out.println("Updated entries in hash table: " + ht);
	
		String getValue = ht.get(4);
		System.out.println("------------------------------------------");
		System.out.println("Getting the value of 4: " + getValue);
		System.out.println("Getting the value of 2: " + ht.get(2));
	}
}
