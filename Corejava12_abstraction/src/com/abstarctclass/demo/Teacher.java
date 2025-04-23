package com.abstarctclass.demo;

public class Teacher extends Person{
	
	int salary;
	int exp;
	public Teacher(String name, int age, int salary, int exp) {
		super(name, age);
		this.salary = salary;
		this.exp = exp;
	}
	

}
