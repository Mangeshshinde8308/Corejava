package com.block.demo;

public class Car {
       String name;
       String brand;
       String colour;
       static int noOfCarSold;
       
       //static block
       static {
    	   noOfCarSold=0; 
    	   System.out.println("inside a static block");
    	   //static block will execute first while class loading. it will execute once only
       }
       
       
       //initialized block
       {
    	   noOfCarSold++;
    	   System.out.println("inside initialized block");
    	   System.out.println(noOfCarSold);
    	   // initialized block will execute every time whenver new object will create. 
       }

	public static void main(String[] args) {
		
		Car thar=new Car();
		Car nano=new Car();

	}

}
