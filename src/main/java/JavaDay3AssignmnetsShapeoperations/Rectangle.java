package JavaDay3AssignmnetsShapeoperations;

public class Rectangle {
int length = 20;
int breadth = 25;


Rectangle(){
	this.length=length;
	this.breadth=breadth;
}


void areaCalc() {
	int result=length*breadth;
	System.out.println("Area:  "+result);
}

void PerimeterCal() {
	int peri=2*(length+breadth);
	System.out.println("Perimeter:  "+peri);
}
}
