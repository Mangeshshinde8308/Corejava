package com.demo.This;

public class Car {
	int noOfwheel;
	String colour;
	String brand;
	
	Car(int noOfwheel, String colour, String brand){
		
		noOfwheel=noOfwheel;    //If we not used this here. compile will confuse.this is instance variable of parametrer which we passed. 
		colour=colour;                //either we need to use diffrent parameter name than instance variable
		brand=brand;             //
		
	}
	
	public void display() {
		System.out.println(noOfwheel+colour+brand);
	}
	
	public void m1() {
		System.out.println("this is m1 method");
	}
	
	
	public void n() {
		System.out.println("calling m1 from n method");
		this.m1();  //-->this keyword also useful to invoke current class method.
	}
	

}
