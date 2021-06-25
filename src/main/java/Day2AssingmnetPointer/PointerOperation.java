package Day2AssingmnetPointer;

public class PointerOperation {
	private int x;
	private int y;
	
	public PointerOperation() {
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Sum of Point ["+ (x + y )+ "]";
	}
}
