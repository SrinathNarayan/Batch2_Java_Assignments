package Assignmnets;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JavaReflectionExample {
	
	 private String s; 
	    public JavaReflectionExample()  {  s = "srinath"; } 

	    public void strmeth()  { 
	        System.out.println("The string is " + s); 
	    }  
	    public void nummeth(int n)  { 
	        System.out.println("The number is " + n); 
	    } 

	    private void pvtmeth() { 
	        System.out.println("Private method invoked"); 
	    } 
	 
	  
	 
	    public static void main(String args[]) throws Exception 
	    { 
	    	JavaReflectionExample obj = new JavaReflectionExample(); 
	        Class cls = obj.getClass(); 
	        System.out.println("The name of class is " + 
	                            cls.getName()); 

	        Constructor constructor = cls.getConstructor(); 
	        System.out.println("The name of constructor is " + 
	                            constructor.getName()); 
	  
	        System.out.println("The public methods of class are : "); 
	  
	        Method[] methods = cls.getMethods(); 
	  
	        for (Method method:methods) 
	            System.out.println(method.getName()); 

	        Method methodcall1 = cls.getDeclaredMethod("nummeth",int.class); 
	        methodcall1.invoke(obj,25 ); 
	  
	        Field field = cls.getDeclaredField("s"); 
	        field.setAccessible(true); 
	  

	        field.set(obj, "Srinath"); 
	        Method methodcall2 = cls.getDeclaredMethod("strmeth"); 
	  
	        methodcall2.invoke(obj); 
	  
	        Method methodcall3 = cls.getDeclaredMethod("pvtmeth"); 
	  
	        methodcall3.setAccessible(true); 
	  
	        methodcall3.invoke(obj); 
	    } 
	

}
