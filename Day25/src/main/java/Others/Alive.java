package Others;

public class Alive extends Thread{
	public void run()
	{
		System.out.println("Thread 1 is Running");
		try {
        		Thread.sleep(500);
    		}
    	catch(InterruptedException ie) 
    	{ 
    
    	}
       	System.out.println("Thread 2 is Running");
  	}
	public static void main(String[] args)
	{
		Alive t1=new Alive();
		Alive t2=new Alive();
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}
