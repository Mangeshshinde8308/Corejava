package com.exceptionhandling.try_cathch_block;

import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("statement1"); // -->execute
			System.out.println("satatment2"); // this will also execute
			System.out.println(10 / 0); // raised exeption. respective catch block will execute.
			System.out.println("statament3"); // this statment will not be execute. once code execute catch block it
												// will not came return
												// try block to execute remaining code.
		}

//		catch(Exception ee){   -->exeption is parent class of AE. this catch block can catch aritmatic exeception.
//		                       //if excepton catch by respective catch block first. then if there is many catch block after that remains unrechable. 
//	System.out.println("handle aritmatic exeception by using parent Exception class");
//			
//		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("handled IOBExeption");// -->in above try block ArithmaticException types of exeception
														// occurs. so this is not
														// not a respective catch block .

//	     catch (IndexOutOfBoundsException e) {
//				System.out.println("handled IOBExeption");  -->cant use same exeption class inside catch block. 
//			

		} catch (ArithmeticException a) { // this catch will execute because this catching arithmatic exeception.
			System.out.println("handled Arithmatic Exception");
			try {
				System.out.println(10 / 0); // inside catch block also if exeption occure then also it is abnormal
											// terminantion.
											// we can handle exeption raised in catch blocck by using try-catch block.
			} catch (Exception e) {
				System.out.println("try block inside catch block");
			}
		}
//		catch (ArrayIndexOutOfBoundsException e) {    //this part is unreachable. compiler  will give unreachable code error.
//			// TODO: handle exception                //because once for any try block we catch exeption remaining try block will not execute.
//			System.out.println("handled Exeption");
//		}

		System.out.println("statement4");
	}

}
