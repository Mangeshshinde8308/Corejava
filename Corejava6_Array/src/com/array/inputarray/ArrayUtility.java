package com.array.inputarray;

import java.util.Scanner;

public class ArrayUtility {
	
	public static int[] inputArray() {
		System.out.println("please enter your array");
		System.out.println("please give your array size");
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[sc.nextInt()];
		System.out.println("enter your array element");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" index element is ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("your provided array is ");
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
		
		return arr;
		
	}

}
