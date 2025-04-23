package com.demo.This.use1;

public class Car {
	int fuel=4;
	
	public void driving()
	{
		System.out.println("car is driving");
	}
	
	public Car start() {
		if (fuel !=0) {
			System.out.println("starting a car");
		}
		else 
		{
			System.out.println("add fuel");
		}
		return this;
	}
}
