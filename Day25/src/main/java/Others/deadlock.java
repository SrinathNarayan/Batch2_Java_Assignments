package Others;

public class deadlock {
	 public static void main(String[] args){
		   final String r1 = "Thread1";
		   final String r2 = "Thread2";
		 
		   Thread t1 = new Thread() {
		     public void run(){
		       synchronized(r1){
		        System.out.println("Thread 1: Locked r1");
		        try{ 
		        	Thread.sleep(200);
		        	} 
		        catch(Exception e) {
		        	e.printStackTrace();
		        }
		      synchronized(r2){
		        System.out.println("Thread 1: Locked r2");
		        }
		     }
		  }
		}; 
		t1.start();
		}

}
