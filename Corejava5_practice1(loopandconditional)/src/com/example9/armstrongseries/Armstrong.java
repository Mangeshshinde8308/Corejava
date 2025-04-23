package com.example9.armstrongseries;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		boolean ans=isArmstrong(sc.nextInt());
	
		
		 if(ans) {
	     System.out.println("This is Armstrong number");
		 }
		 else
		 {
		 System.out.println("This is not Armstrong number");
		 }

	}

	private static boolean isArmstrong(int num) {
	     
		int temp=num;                                                  //153    //armstrong means 153=1*1*1     5*5*5     3*3*3
		int rem;
		int sum=0;
		
		while(num>0) {
			rem=num%10;
			num=num/10;
			sum=sum + rem*rem*rem;
			System.out.println(sum); 
			                                  //if having its own return statment
			
		}
		if(temp==sum) {
			
			return true;
		}
		else {
			

			return false;
		}
		
	}
	
}
