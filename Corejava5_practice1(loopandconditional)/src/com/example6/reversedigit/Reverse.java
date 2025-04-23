package com.example6.reversedigit;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter your number");
    Scanner sc=new Scanner(System.in);
    int ans=reverseNumber(sc.nextInt());
    System.out.println("reverse of your provided number is "+ans);
	}
	
	public static int reverseNumber(int num) {
		int reverse=0;
		
		while(num>0) {                   //123            
			int digit=num%10;
			reverse =reverse*10+digit;
			num=num/10;
		}
		
		return reverse;
		
	}

}
