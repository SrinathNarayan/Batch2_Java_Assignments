package Others;

public class join  extends Thread{
    public void run()
    {
        System.out.println("Thread 1 Running ");
        try {
            Thread.sleep(300);
        }
        catch (InterruptedException ie) {
        }
        System.out.println("Thread 2 Running ");
    }
    public static void main(String[] args)
    {
        join c1 = new join();
        join c2 = new join();
        c1.start();
  
        try {
            c1.join();
        }
        catch (InterruptedException ie) {
        }
  
        c2.start();
    }
}
