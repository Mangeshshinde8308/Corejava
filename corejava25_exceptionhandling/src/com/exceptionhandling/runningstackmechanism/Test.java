package com.exceptionhandling.runningstackmechanism;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main method");   //-->this will execute.
        dostuff();                                   //--> this will execute
		System.out.println("main method after excption");   //-->dostuff method will return exception object to main method. main method will also terminate abanormally.


	}
	
	public static void dostuff() {
		 System.out.println("this is dostuff method");  //-->this will execute
         domorestuff();                                //this will execute                   
		 System.out.println(10/0);                     //this will not execute. it will gave exeception. this method will terminate abnomally. and return object of exception. 
		 
	}

	private static void domorestuff() {
		System.out.println("this is domorestuff method");  //-->this is last method. once it execute succesfully stack will terminate normally.
     
		
	}

}
