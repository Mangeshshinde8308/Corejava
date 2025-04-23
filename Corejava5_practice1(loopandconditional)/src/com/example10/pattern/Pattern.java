package com.example10.pattern;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// increasingStar(getNoOfRow());
		decreaseStar(getNoOfRow());

	}

	public static int getNoOfRow() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number of row");
		return sc.nextInt();
	}

	public static void increasingStar(int row) {

		for (int i = 1; i <= row; i++) { // loop for no of row i=no of row i=1 i=2 i=3

			for (int j = 1; j <= i; j++) { // loop for colummn j=no of column j=1,* j=1 * j=2,**
				System.out.print("*");
			}
			System.out.println(); // to go next line
		}
	}

	public static void decreaseStar(int row) {

		for (int i = 1; i <= row; i++) {
			for (int j =1; j<=row; j++) {
				System.out.print("* ");
			}
		}
		System.out.println();

	}

	public static void squerPattern(int row) {

	}
}