package PayslipGeneration;


	class Professor extends EmployeeDetails {
		double salary, bp, da, hra, pf, club, net, gross;

		
		void getdata() 
		{ 
		 System.out.println("---------------------------");
		 System.out.println("Enter Name of the Employee"); 
		 name = get.nextLine(); 
		 System.out.println("Enter Mail id"); 
		 mailid = get.nextLine(); 
		 System.out.println("Enter Address of the Employee:"); 
		 address = get.nextLine(); 
		 System.out.println("Enter employee id "); 
		 empid = get.nextInt(); 
		 System.out.println("Enter Mobile Number"); 
		 mobile = get.nextLong(); 
		  } 
		
		void display() 
		{ 
		 System.out.println("Employee Name: "+name); 
		 System.out.println("Employee id : "+empid); 
		 System.out.println("Mail id : "+mailid); 
		 System.out.println("Address: "+address); 
		 System.out.println("Mobile Number: "+mobile); 
		 } 
		
		
		void getprofessordetails() {
			System.out.println("Enter basic pay");
			bp = get.nextDouble();
		}

		void calculateprofessorPaySlip() {
			da = (0.97 * bp);
			hra = (0.10 * bp);
			pf = (0.12 * bp);
			club = (0.1 * bp);
			gross = (bp + da + hra);
			net = (gross - pf - club);
			System.out.println("---------------------------");
			System.out.println("Salary");
			System.out.println("---------------------------");
			System.out.println("Basic Pay: Rs. " + bp);
			System.out.println("DA: Rs. " + da);
			System.out.println("HRA: Rs. " + hra);
			System.out.println("PF: Rs. " + pf);
			System.out.println("CLUB: Rs. " + club);
			System.out.println("GROSS PAY: Rs. " + gross);
			System.out.println("NET PAY: Rs. " + net);
		}
}
