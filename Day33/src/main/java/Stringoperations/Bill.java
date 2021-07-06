package Stringoperations;

	public class Bill {
	  int Billno;
	    String Name;
	    String Phono;
	    int Amount;
	   

	    public String getInfo() {
	    	System.out.println("Bill Info");
	    	System.out.println("--------------------------------");
	        return ("Bill No: "+Billno+"\nName:"+Name+" \nPhone:"+Phono+" \nBill Amount: "+Amount);
	    }
	    

	    public static void main(String[] args) {
	        Bill info = new Bill();
	        info.Billno=369852;
	        info.Name="Kishore";
	        info.Phono="369852147";
	        info.Amount=9600;
	        System.out.println(info.getInfo());
	    }
	}


