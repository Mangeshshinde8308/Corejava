package com.example5.HCForGCD;

import java.util.Scanner;

public class Main5 {
	 public static void main(String [] args) {
		 
		 System.out.println("enter your Number");
		 Scanner sc=new Scanner(System.in);
		 int ans=hcf(sc.nextInt(),sc.nextInt());
		 System.out.println("HCF of given number is = "+ans);
		 
	 }
  public static int hcf(int num1,int num2) {
	  int gcd=1;
	for(int i=1; i<=num1 && i<=num2; i++) {
		 
		if(num1%i==0 &&num2%i==0) {
			gcd=i;
		}
	}
	return gcd;

	  
  }
}
