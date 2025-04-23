package com.exceptionhandling.checked_unchecked;

import java.io.PrintWriter;

public class Test {
// the exception whiche checked by compiler are called checked exception.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintWriter pw=new PrintWriter("text.txt");   //-->here compiler will check, may this file will present or not. we need to handle this 
		                                               //exception. hence this is checked exception
		pw.println("writing code in checked exeception");
		
		System.out.println(10/0);   //-->compiler will not checked this exception such exception known as unchecked exception.
		                            //-->all Runtimeexception and its child class and error all are unchecked exception.

	}

}
