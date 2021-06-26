package MultiThread;

public class Threadmain {
	public static void main(String[] args) {
		RandomNumber rn=new RandomNumber();
		rn.start();
		System.out.println("Thread : "+rn.isAlive());
	}
}
