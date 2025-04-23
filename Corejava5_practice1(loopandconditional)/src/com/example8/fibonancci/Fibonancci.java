package com.example8.fibonancci;

import java.util.Scanner;

public class Fibonancci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		printfibonancci(sc.nextInt());

	}
    public static void printfibonancci(int num) {
    	 if (num<0)return;   //If entered number less than zero return void /empty series
    	 if (num==0) {
    		 System.out.println("1");
    		 
    	 }
    	 int first=0,second=1;     //fibonacci series start from 0 and 1 eg:011235813
    	 while(first+second <= num) {
    		 int third=first+second;
    		 System.out.print(third+" ");      //first pahila zero asel tyat one add hoil.donhi chi sum tisara asel. tyananter 
    		 first=second;
    		 second=third;
    	 }
    }
}
