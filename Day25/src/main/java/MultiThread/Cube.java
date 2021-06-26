package MultiThread;

public class Cube extends Thread {
	int num;
	Cube(int n){
		num=n;
	}
	public void run() {
		int cube=num*num*num;
		System.out.println("Result "+num+ " is : "+ cube);
	}

}
