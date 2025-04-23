package com.exceptionhandling.throws_keyword;

import java.io.IOException;
import java.io.PrintWriter;

public class TrowsCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      PrintWriter p=new PrintWriter("abc.txt");
		      p.println("hellw");
			//System.out.println(10/0);  -->this code is raising exception related to AE. but in catch if we take fully checked related
		                                   //exception object then this code will not compile.
		
			
		}catch(IOException e) { 
			// TODO: handle exception
			
			//whenever we use fully checked exception in catch block make sure try block should raised exception.
		}

	}

}
