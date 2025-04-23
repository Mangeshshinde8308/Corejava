package com.exceptionhandling.rethrowingException;

public class RethrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(10/0);   // raising AE but we are throwing Null [pointer exception. we can throw our customised exception as well.
		}
		catch(ArithmeticException e) {
			throw new NullPointerException("rethrowing exception");
		}
		
			
	

	}

}
