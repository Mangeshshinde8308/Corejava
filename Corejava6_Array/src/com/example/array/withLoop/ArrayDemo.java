package com.example.array.withLoop;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;

		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array.length);

		int[] array2 = { 100, 200, 300, 400, 500, 600 };
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		System.out.println(array2[3]);
		System.out.println(array2[4]);
		System.out.println(array2[5]);

		for (int i = 0; i < array2.length; i++) {       //Print array using loop
			
			System.out.print("Array using loop");
			System.out.println(array2[i]);
		}

	}

}
