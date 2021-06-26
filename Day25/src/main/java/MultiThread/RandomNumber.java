package MultiThread;

import java.util.Scanner;

public class RandomNumber  extends  Thread

{
	Scanner sc= new Scanner(System.in);
	public void run() {
		RandomNumber rd=new RandomNumber();
		for(int i=0;i<3;i++) {
			int rint=sc.nextInt(50);
			System.out.println("Random Integer generated is : "+rint);
			if(rint%2==0) {
				Square s=new Square(rint);
				s.start();
				System.out.println("Is Sqaure Thread Alive: "+s.isAlive());
				System.out.println();
			}
			else {
				Cube cb=new Cube(rint);
				cb.start();
				System.out.println("Is Cube Thread Alive: "+ cb.isAlive());
				System.out.println();
			}
			try {
				Thread.sleep(1000);
			}
		
			catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
		
	}
}
