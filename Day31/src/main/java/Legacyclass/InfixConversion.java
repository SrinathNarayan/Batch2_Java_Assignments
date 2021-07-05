package Legacyclass;

import java.util.Stack;

public class InfixConversion {
	public static int precedence(char ch)
	{
	 if(ch=='+' || ch=='-')
	 return 1;
	 
	 else if(ch=='*' || ch=='/')
	 return 2;                       
	 
	  return 0;
	}
	 
	public static String convertToPostfix(String exp)
	{
	 Stack<Character> operators = new Stack<Character>();
	 Stack<String> postFix = new Stack<String>();
	 
	 for(int i=0;i<exp.length();i++)
	 {
	  char ch=exp.charAt(i);         
	 
	  if(ch=='(')
	   operators.push(ch);
	 
	  else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
	   postFix.push(ch+"");
	 
	  else if(ch==')')
	  {
	   while(operators.peek()!= '(')
	   {
	    // STEP 5 of Algorithm.    
	    char op = operators.pop();
	 
	    String first = postFix.pop();         
	    String second = postFix.pop();
	 
	    String new_postFix = second+first+op;  
	 
	    postFix.push(new_postFix);    
	   }
	 
	   operators.pop();     
	  }
	 
	      
	 
	  else if(ch=='+' || ch=='-' || ch== '*' || ch== '/')
	  {
	  
	   while(operators.size()>0 && operators.peek()!='(' && precedence(ch) <= precedence(operators.peek()))
	   {
	   char op = operators.pop();
	 
	   String first = postFix.pop();
	   String second = postFix.pop();
	 
	   String new_postFix = second+first+op;
	 
	   postFix.push(new_postFix);
	   }
	 
	  operators.push(ch);
	  }
	 }
	 
	 
	 while(operators.size()>0)
	 {
	  char op = operators.pop();
	 
	  String first = postFix.pop();
	  String second = postFix.pop();
	 
	  String new_postFix = second+first+op;
	 
	  postFix.push(new_postFix);
	  }
	 
	  return postFix.pop();  
	}
	 
	public static void main(String args[])
	{

	  String infixExpression = "A*(B-C)/D+E";
	  System.out.println("The Infix Expression is: "+infixExpression);
	  String result = convertToPostfix(infixExpression);
	  System.out.println("The Postfix of the given Infix Expression is: "+result);
	  System.out.println();
	  infixExpression = "a*(b-c+d)/e";
	  System.out.println("The Infix Expression is: "+infixExpression);
	  result = convertToPostfix(infixExpression);
	  System.out.println("The Postfix of the given Infix Expression is: "+result);
	 
	}
}
