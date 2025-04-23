package com.exceptionhandling.throws_keyword;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        dostuff();
	}

	private static void dostuff() throws InterruptedException  {  //-->if we not used in caller throws keyword to caller method then also it will give error while compiling.
		domorestuff();
		
	}

	private static void domorestuff() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
	}

}
