package com.inheritance.typeofinheritance.multilevel;

public class A {

	int a;

	public void m1() {
		System.out.println("calling from A");
	}
}

class B extends A {

	int b;

	public void m2() {
		System.out.println("calling from B");
	}
	

}

class C extends B {
	int c;

	public void m3() {
		System.out.println("calling from C");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c1 = new C();    //we can access calss A and Class B member. because Class A extends Class B and B extends Class C

		c1.a=10;
		c1.b=20;
		c1.c=30;
		c1.m1();
		c1.m2();
		c1.m3();
	}

}
