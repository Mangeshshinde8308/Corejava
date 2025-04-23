package com.inhertance.demo1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inheritance is also known as IS-A releationship
		//main purpose of inheritance is code reusability.
		
	//Case 1 --> Parent Class reffrence and parent Class object
		Parent p= new Parent();         // by using parent class reff we can acessa all memmber(variable and methods only from parent)
		p.parentinstancevar=10;
		p.m1();
		//p.m2();                       //m2 is child class method. we cant acess with parent class reffrence.
   
		
	//Case 2 --> Child class Reffrence and Child class object
		Child c=new Child();
		c.childinstancevar=10;
		c.parentinstancevar=100;
		c.m1();
		c.m2();
		
	//Case 3 --> Parent class Reffrence and Child class object
		
		Parent p1=new Child();
		p1.parentinstancevar=10;
		p1.m1();
		//p1.childinstancevar --CE   --> compiler will not consider runtime object. it will check parent class reffrence and able to call parent class mebmebr
		//p1.m2    --CE
		
		
	// Case4 -->	Child class refference and parent class object
		//Child c1=new Parent();  -->>CE    we cannot use Child class reffrence to hold parent class object. 
	}

}
