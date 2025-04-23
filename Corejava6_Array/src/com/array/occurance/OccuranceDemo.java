package com.array.occurance;

import java.util.Scanner;

import com.array.inputarray.ArrayUtility;

public class OccuranceDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = ArrayUtility.inputArray();
		System.out.println("please enter your number");
		int num = sc.nextInt();
		int occurance= noOfOccurance(arr,num);
		System.out.println("your entred number present "+occurance+" times in your provided array");

	}

	public static int noOfOccurance(int[] arr, int num) {
		int occurance = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == num) {
				{
					occurance++;
				}
			}i++;
		}
		return occurance;

	}

}
