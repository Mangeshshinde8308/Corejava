package com.example1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("entere your number");
		//multipicationTable(sc.nextInt());
		int oddsum=oddNumberSum(sc.nextInt());
		System.out.println(oddsum);

	}

	
	  public static void multipicationTable(int num) {
		  int i=1;
		  while(i<=10) {
			  System.out.println(num +"*" +i +"=" +num*i);
			  i++;
		  }
		  
	  }
	  public static int oddNumberSum(int num) {//10
			 int i=0;
			 int sum=0;
			 while(i<=num) {         //
				 if(i%2!=0) {
				
				sum=sum+i;
				 }
				 i++;
			 }
return sum;
		 }
}
