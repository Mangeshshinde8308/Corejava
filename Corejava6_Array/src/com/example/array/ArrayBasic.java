package com.example.array;

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a;     //Array declaration-->in this way we can declare array
		// int[6] b;   -->>while declaration array we can not specified size of array.
		
		
		int[] b=new int[3];  //in this way we creat array    --..we need to specify size of array while creation array
		//int [] b=new int[];   -->>this will give us compile time error.because we havent specified size of array.
		
		int [][] c=new int[2][3];   //-->this way we can define multidimensional array
		
		int [] zerosizearray=new int[0];  //-->zero size of array is legal 
		
		//int[] d=new int[-9];    -->>Exception in thread "main" java.lang.NegativeArraySizeException: -9. cannot used negative size array
		
		System.out.println(args.length);   //-->the size of array passed string type array is zero.its legal in java with zero size.
		
		
		//max size of array
		
		int[] max= new int[2147483647];
		//int[] max= new int[2147483648];  -->>The literal 2147483648 of type int is out of range 


	}

}
