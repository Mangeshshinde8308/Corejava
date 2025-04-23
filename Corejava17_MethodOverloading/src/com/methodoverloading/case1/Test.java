package com.methodoverloading.case1;

public class Test {
	
	public void m1(Object o) {
		System.out.println("object-version");
	}
	
	public void m1(String s) {
		System.out.println("string-version");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Test t=new Test();
      t.m1(new Object());
      t.m1("mangu");
      t.m1(null);  //-->here null is valid argument for both Object and string. this can be passed as parameter.
                   //Object is parent of string class. compiler will gave prefrence to child type parameter.6
	}

}
