package com.array.maxandmin;

import com.array.inputarray.ArrayUtility;

public class MaxAndMinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=ArrayUtility.inputArray();
	   int max=maxFromArray(arr);
		int min=minFromArray(arr);
		System.out.println("minimum number from your entred array is "+min);
		System.out.println("minimum number from your entred array is "+max);


	}

	private static int minFromArray(int[] arr) {
		if(arr.length==0)
		{
			return Integer.MIN_VALUE;
		}
		int min=arr[0];
//		int i=0;
//		while(i<arr.length) {
//			if(min>arr[i]) {
//				min=arr[i];
//			}
//		}i++;
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}

	private static int maxFromArray(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
		
	}

}
