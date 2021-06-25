package JavaDay3AssignmnetsShapeoperations;

public class Shapemain {
	public static void main(String[] args) {
		Rectangle re=new Rectangle();
		Square sq=new Square(25);
		System.out.println("Area of SQUARE:");
		System.out.println("------------------------------");
		sq.sqr();
		System.out.println("\nArea of RECTANGLE:");
		System.out.println("------------------------------");
		re.areaCalc();
		System.out.println("\nPerimeter of RECTANGLE:");
		System.out.println("------------------------------");
		re.PerimeterCal();


	}
}
