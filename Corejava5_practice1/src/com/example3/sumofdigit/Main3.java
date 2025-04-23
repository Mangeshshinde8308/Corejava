package com.example3.sumofdigit;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		
		int x=sumOfDigit(sc.nextInt());
		
		System.out.println(x);

	}
	
	public static int sumOfDigit(int num) {
		
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			//sum +=num%10
		    num=num/10;
		    //num /=10;
			}
		return sum;
		
	}

}
