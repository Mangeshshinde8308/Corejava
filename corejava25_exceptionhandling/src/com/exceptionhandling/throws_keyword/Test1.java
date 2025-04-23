package com.exceptionhandling.throws_keyword;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
   
		PrintWriter p=new PrintWriter("abc.txt");  //-->this is checked exception we need to handle by either throws keyword or try-catch block.
		p.println("hello");
	}

}
