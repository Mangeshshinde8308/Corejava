package com.basic;
import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		
		System.out.println("Welcome to MyCalculator!!!!!!");
		int x=giveNumber();
		int y=giveNumber();
		addition(x,y);
	}
	
	
	public static int giveNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number=");
		return sc.nextInt();
		
	}
	
	public static void addition(int x,int y) {
		System.out.println("Addition of your Number : "+(x+y));
	}

}
