package Telephone;

public class Mainclass {
	public static void main(String[] args) {
		Telephone st=new SmartTelephone();
			System.out.println("Abstract Method Lift ");
			System.out.println("---------------------------------------------------------------------------");
			st.lift();
			
			System.out.println("Abstract Method Disconnect ");
			System.out.println("---------------------------------------------------------------------------");
			st.disconnected();
		
			

		}
}
