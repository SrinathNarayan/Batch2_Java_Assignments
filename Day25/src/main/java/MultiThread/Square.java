package MultiThread;

public class Square extends Thread {
	int num;
	public Square(int rint) {
		num=rint;
	}
	
	public void run() {
		int sqr=num*num;
		System.out.println("Sqaure of "+num+ " is : "+ sqr);
	}
}
