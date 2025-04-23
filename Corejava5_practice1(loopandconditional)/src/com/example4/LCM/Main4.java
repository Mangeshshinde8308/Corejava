package com.example4.LCM;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		System.out.println("enter your number");
		Scanner sc=new Scanner(System.in);
		
		int a=lcm(sc.nextInt(),sc.nextInt());
		System.out.println(a);
	}
	
	public static int lcm(int num1, int num2) {// LCM means least common multiple. LCM always geater or equal from large number.
		
		int lcm=(num1>num2) ? num1 : num2 ;  //conditional statment to check gretaer number
		                                    //least commen factor should greater than max num.eg 2 and 3 this two number common factor either equel to greates number or equal to that number
		                                     //  
		while(true){
			if(lcm%num1==0 && lcm%num2==0) {
				System.out.println("LCM of this two num is = "+lcm);
				return lcm;
				
			}
			++lcm;
		}
		
		
		
		
		
	
		
		
		
		
		
	}
	

}
