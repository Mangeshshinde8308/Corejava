package com.exceptionhandling.try_with_resourse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MulticatchBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(BufferedReader br=new BufferedReader(new FileReader("input.txt"))){
			
		} catch (FileNotFoundException | ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException |NullPointerException e) {    
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			System.out.println(10/0);
			String s=null;
			System.out.println(s.length());
		}catch(ArithmeticException | NullPointerException e) {//--> we can define two Ex object in single catch block by using | operator.
			e.printStackTrace();                              //-->but there should be no relation like parent-chile between this two class
		
		//}catch(Exception | RuntimeException e) {    -->Exception | RuntimeException having parent child direct relation. so it will gave compiletime error. 
			
		}

	}

}
