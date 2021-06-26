 package PersonInformation;

public class Manager  {
  Details db;
	 void ManagerPrintSalary() {
		 	System.out.println("Manager Info");
			System.out.println("---------------------------------");
			db= new Details("Shiva",32,963258741,50000,"chennai","IT","Angular");
			db.printMangerDetails();
	 }

}
