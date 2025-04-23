package com.exceptionhandling.method_to_print_EX_details;

public class Test {

	public static void main(String[] args) {
	    
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
		// printStackTrace print trace details,description and exeception name
	   System.out.println("exeception details using  printStackTrace method : ");		
		e.printStackTrace();  //--> O/P -->java.lang.ArithmeticException: / by zero
		                           //at corejava25_exception_handling/com.exceptionhandling.method_to_print_EX_details.Test.main(Test.java:8)
		
		
		//getMessage() method will only gave description
		System.out.println("exeception details using  getMessage method ");		
        System.out.println(e.getMessage()); //--> / by zero                    
        
        //toString() and Object of exception i.e e will gave discription and exception name. 
		System.out.println("exeception details using  SOP method ");		
		System.out.println(e);              //-->O/P=java.lang.ArithmeticException: / by zero
		
		System.out.println("exeception details using toString() method");		
		System.out.println(e.toString());    //-->O/P =java.lang.ArithmeticException: / by zero
		}

	}

}
