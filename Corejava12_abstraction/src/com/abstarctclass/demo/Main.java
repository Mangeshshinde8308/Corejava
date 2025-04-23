package com.abstarctclass.demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Person p=new Person();  -->>cannot create object of abstract class
		Student s=new Student("Mangu",26,100,100);  //-->>to initiate instance variable which requred to child class we need constaructor for abstarct class.
	}

}
