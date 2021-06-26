package BillGeneration;



public class BillOperations  extends BillDetails {
	

	
		void Domestic(String typeof_connection,int units) {
				if(units<=100) {
					bill=bill+(units*1);
				}else if((units>=101) && (units <=200)) {
					bill=bill+(units*2.5);
				}else if ((units>=201)&& (units<=500)) {
					bill=bill+(units*4.0);
				}else if(units>=501) {
					bill=bill+(units*6.0);
				}
		}
			
		void comercial(String typeof_connection,int units) {
				if(units<=100) {
					bill=bill+(units*2);
				}else if((units>=101) && (units <=200)) {
					bill=bill+(units*4.50);
				}else if ((units>=201)&& (units<=500)) {
					bill=bill+(units*6);
				}else if(units>=501) {
					bill=bill+(units*7);
				}
		}

		 void comercialdiaplay (int consumer_no,String consumer_name,int units,String typeof_connection,double bill) {
					System.out.println("Consumer Number : " + consumer_no + "Consumer Name: " + consumer_name + "Total Units: "
							+ units + "Bill Amount : "+ bill);
					}
		 
		 void domesticdiaplay (int consumer_no,String consumer_name,int units,String typeof_connection,double bill) {
				System.out.println("Consumer Number : " + consumer_no + "Consumer Name: " + consumer_name + "Total Units: "
						+ units  + "Bill Amount : "+ bill);
				}
		}
		

