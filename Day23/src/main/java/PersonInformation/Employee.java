package PersonInformation;

public class Employee {

	Details db;
	 void EmployeePrintSalary() {
		 System.out.println("------------------------------");
		 	System.out.println("Employee Info");
			System.out.println("---------------------------------");
			db= new Details("Muthu",23,963258741,20000,"chennai","Programmer","React");
			db.printEmployeeDetails();
	 }
}
