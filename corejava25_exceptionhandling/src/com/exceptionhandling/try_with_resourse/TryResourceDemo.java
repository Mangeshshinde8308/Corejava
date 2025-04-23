package com.exceptionhandling.try_with_resourse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TryResourceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(BufferedReader br=new BufferedReader(new FileReader("input1.txt")); FileWriter fw=new FileWriter("input2.txt");PrintWriter pw=new PrintWriter("input3.txt"))
		{
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
