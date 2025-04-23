package com.example2;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		long ans=factorial(sc.nextInt());
		System.out.println("factorial of your provided number is ="+ans);
		
	}
	
	public static long factorial(int num) {
		
		if(num<=1) {
			return 1;
		}
		int i=1;
		long fact=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		return fact;
		
		
		
		
	}
	
	

}
