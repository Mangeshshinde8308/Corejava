
package com.exceptionhandling.throw_keyword.case1;

public class Test1 {
    
	static ArithmeticException ae;
	
	static ArithmeticException a=new ArithmeticException();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		//throw ae;   -->here we will get null point exception, beacause we not created object.
		//throw a;   -->here we will got AE.   
		 //  after throw keyword remaining code will unreachable.
	}

}
