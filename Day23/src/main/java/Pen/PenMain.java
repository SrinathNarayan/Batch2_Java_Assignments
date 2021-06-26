package Pen;



public class PenMain extends Pen{
	public static void main(String[] args) {
		
		System.out.println(" Abstract class Methods: ");
		write();
		refill();
		
		System.out.println("Concrete class Methods: ");
		
		new FountainPen().change_Nib();
	
	}

	
}
