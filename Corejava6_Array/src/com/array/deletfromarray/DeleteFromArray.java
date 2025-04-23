package com.array.deletfromarray;

import java.util.Scanner;

import com.array.inputarray.ArrayUtility;
import com.array.occurance.OccuranceDemo;

public class DeleteFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] arr=ArrayUtility.inputArray();
 System.out.println("enter no you want to delete from array");
 Scanner sc=new Scanner(System.in);
 int num=sc.nextInt();
 int[] ans=deleteFromArray(arr,num);
 System.out.println("your final array after deleting "+num);
 for(int i=0;i<ans.length;i++) 
 {
	 
	 System.out.print(ans[i]);
 }
		
	}

	private static int[] deleteFromArray(int[] arr, int num) {
		int occ=OccuranceDemo.noOfOccurance(arr, num);
		if(occ==0)
		{
			return arr;
		}
		int newArraySize=arr.length-occ;
		int[] newArray=new int[newArraySize];
       
		for(int i=0; i<arr.length;i++) {
			if(arr[i] !=num) {
				int j=0;
				newArray[j]=arr[i];
				j++	;
				}
			}
		
		return newArray;
	}

}
