package com.exceptionhandling.throw_keyword;

import java.io.FileNotFoundException;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(10/0);   //-->heere the method in which exception occure is responsible for create exception object.
		                            // this exception reaised by default exception handler.
		//o/p of above exception is-->> Exception in thread "main" java.lang.ArithmeticException: / by zero at corejava25_exception_handling/com.exceptionhandling.throw_keyword.ThrowDemo.main(ThrowDemo.java:8) 
		
		
		//throw new ArithmeticException("/by zero");  //o/p-->Exception in thread "main" java.lang.ArithmeticException: /by zero at corejava25_exception_handling/com.exceptionhandling.throw_keyword.ThrowDemo.main(ThrowDemo.java:13)
		//throw new NullPointerException();          -->our created exception 
		
		//throw keyword will pass the our created exception object to JVM.
		//in defauld handler case main method was res[ponsible to pass exception object to JVM.

	}

}
