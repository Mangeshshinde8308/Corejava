
package com.example.array.reverse;

import com.array.inputarray.ArrayUtility;

public class ReverseArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=ArrayUtility.inputArray();
		int[] ansRev=reversOfArray(arr);
		System.out.println("reverse of your provided array is ");
		for(int i=0;i<ansRev.length;i++) {
			System.out.println(ansRev[i]);

		}
		
		boolean palindron=isPalindrom(ansRev,arr);
		if(palindron==true) {
			System.out.println("ohhh this is palindrom series");
		}else
		{
			System.out.println("And this is not palindrom series");
		}
		

	}

	

	private static int[] reversOfArray(int[] arr) {
		int[] newArr=new int[arr.length]; 
		int i=0;
		while(i<arr.length/2) {
			int swap=arr[i];
			newArr[i]=arr[(arr.length-1)-i];
			newArr[((arr.length-1)-i)]=swap;
			i++;
		}
		
		return newArr;
	}
	
	private static boolean isPalindrom(int[] ansRev, int[] arr) {
		 
		 for(int i=0;i<arr.length;i++)
		    {
			 System.out.println(arr[i]+" " +ansRev[i]);
			 if(arr[i]!=ansRev[i]) {
				
			  return false;
			 }
			 }
	
		return true;
		
	}	
}	


