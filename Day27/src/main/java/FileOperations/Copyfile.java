package FileOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copyfile {
	public static void main(String[] args) {

	    try {
	      FileInputStream source = new FileInputStream("C:\\Users\\Trainee\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\Day27\\src\\main\\java\\Demo.java");
	      FileOutputStream destination = new FileOutputStream("C:\\Users\\Trainee\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\Day27\\src\\main\\java\\Dup.java");
	        int b;
	        while  ((b=source.read()) != -1)
	            destination.write(b);
	     System.out.println("The Source file is copied to destination successfully...");
	      source.close();
	      destination.close();
	    }
	    catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
}