package com.constructor2;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
}

class Student extends Person {
	int rollNo;
	int marks;

	public Student(String name, int age, int rollNo, int marks) { // This super keyword will invoke parent class
																	// constructor
		super(name, age);
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("mangu", 25, 1, 100);    // constructor to call child class
		Person p = new Person("priya", 23);             //constructor to call only parent class
	}

}
