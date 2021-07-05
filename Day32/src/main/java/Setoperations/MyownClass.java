package Setoperations;

public class MyownClass {

	String Name;
	int Age;
	
	
	public MyownClass(String name, int age) {
		this. Name = name;
		this.Age = age;
	}


	@Override
	public String toString() {
		return "[Name:" + Name + ", Age:" + Age + "]";
	}
	
	
}
