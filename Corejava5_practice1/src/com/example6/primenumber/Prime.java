package com.example6.primenumber;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		boolean ans = isPrime(sc.nextInt());
		if(ans)
		{
			System.out.println("this is prime number");
		}else
		{
			System.out.println("this is not prime number");
		}

	}

	private static boolean isPrime(int num) {

		int i = 2;
		while (i < num) 
		{                                // num=4 ->4<2--4%2
			if (num % i == 0)
			{
				return false;
				//return false;
				
			}
			i++;
		}
		return true;

	}

}