package com.exceptionhandling.throw_keyword.case2;

public class Test2 extends RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         throw new Test2();    //-->here we exetends Test 2 with RE. after that only we can able throw Test as exception.
	}                         //means we need to extend with our class with subclass of throwable then only we can throe our class Test.6

}
