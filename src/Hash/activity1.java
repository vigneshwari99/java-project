package Hash;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class activity1 {

	static void check() throws ArithmeticException 
	{ 
	System.out.println("Inside check function"); 
	throw new ArithmeticException("demo"); 
	} 

	public static void main(String args[]) 
	{ 
	try 
	{ 
	check(); 
	} 
	catch(ArithmeticException e) 
	{ 
	System.out.println("caught" + e); 
	} 
	} 


}
