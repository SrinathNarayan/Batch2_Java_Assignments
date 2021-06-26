package Pen;

  abstract  class Pen {
	public static  void write(){
		System.out.println("-------------------------------");
		System.out.println("Ball Pen");
		System.out.println("A ballpoint pen has a thick oil-based dye ink and an alcohol carrier.");
		System.out.println("-------------------------------");
	}
	 public static void writes(){
		System.out.println("-------------------------------");
		System.out.println("Gel Pen");
		System.out.println("A gel pen has water-based gel ink that is not as thick as a ballpoint pen.");
		System.out.println("-------------------------------");
	}
	
	public static void refill() {
		System.out.println("-------------------------------");
		System.out.println("Gel Pen");
		System.out.println("A gel pen has water-based gel ink that why it needs refill.");
		System.out.println("-------------------------------");
	}
 
}
  class FountainPen {
		
		public void change_Nib(){
			System.out.println("-------------------------------");
			System.out.println("Fountain Pen");
			System.out.println("Fountain pens are regarded as the smoothest writing pen, and the Lamy Safari is no exception.");
			System.out.println("-------------------------------");
			  
			}

}