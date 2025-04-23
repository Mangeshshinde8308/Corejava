package com.array.sort;

import com.array.inputarray.ArrayUtility;

public class SortArrayDemo {

	public static void main(String[] args) {
		
		int[] arr=ArrayUtility.inputArray();
		
	boolean isDec=isDecreasingArray(arr);
	boolean isInc=isIncreasingArray(arr);
	if(isDec || isInc)
	{
		System.out.println("your array is sorted");
	}else
        System.out.println("your array not sorted");

	}



	private static boolean isIncreasingArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1]) 
			{
				return false;
			}
		}
		return true;
	}



	private static boolean isDecreasingArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[i-1]) 
			{
				return false;
			}
		}
		return true;
		
	}
	
	//private static void sortArrayByInc{
		
	//}

}
