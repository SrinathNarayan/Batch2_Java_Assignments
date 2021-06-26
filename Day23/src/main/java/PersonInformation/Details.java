
package PersonInformation;

public class Details {
String Name;
int age;
int PhoneNo;
int salary;
String Address;
String Department;
String Specialization;

public Details(String name, int age, int phoneNo, int salary, String address, String department,
		String specialization) {
	super();
	this.Name = name;
	this.age = age;
	this.PhoneNo = phoneNo;
	this.salary = salary;
	this.Address = address;
	this.Department = department;
	this.Specialization = specialization;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getPhoneNo() {
	return PhoneNo;
}

public void setPhoneNo(int phoneNo) {
	PhoneNo = phoneNo;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public String getDepartment() {
	return Department;
}

public void setDepartment(String department) {
	Department = department;
}

public String getSpecialization() {
	return Specialization;
}

public void setSpecialization(String specialization) {
	Specialization = specialization;
}

@Override
public String toString() {
	return "Details [Name=" + Name + ", age=" + age + ", PhoneNo=" + PhoneNo + ", salary=" + salary + ", Address="
			+ Address + ", Department=" + Department + ", Specialization=" + Specialization + "]";
}



public void printMangerDetails() {
		
	System.out.println("------------------------------");
	System.out.println("\nName:" + this.Name + " "+ "\nAge" + this.age +"" + "\nPhone:" + this.PhoneNo +"\nSalary:" + this.salary + " "+ "\nAddress" + this.Address +"" + "\nDepartment:" + this.Department +" "+"\nSpecialization:" + this.Specialization );
	
	
}

 public void printEmployeeDetails() {
	 		
		System.out.println("------------------------------");
		System.out.println("\nName:" + this.Name + " "+ "\nAge" + this.age +"" + "\nPhone:" + this.PhoneNo +"\nSalary:" + this.salary + " "+ "\nAddress" + this.Address +"" + "\nDepartment:" + this.Department +" "+"\nSpecialization:" + this.Specialization );
		
		
	 
 }
	
}
