package com.example;

import java.util.Scanner;

public class WhileDemo {
  
	public void  starPattern() {
		
	System.out.println("enter row number");
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	
	while(row>0) {
		System.out.println("*");
		int i=0;
		while(i<row) {
			System.out.println(" *");
			++i;
		}
		row=--row;
		
	}
		
		
	}

}
