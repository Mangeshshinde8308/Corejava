package com.methodoverloading.demo1;

//I java we can define many method with same name but different paramenter in same class such method known as overloaded method.
//returntype of that method doesnt matter
public class Test {

	public void m1() {
		System.out.println("no-args");
	}

	public void m1(int i) {
		System.out.println("int-args");
	}

	public void m1(double d) {
		System.out.println("double-args");
	}

	public String m1(String s) {
		return s;
	}
	
	public void m1(int i, float f) {
		System.out.println("int-float version");
	}
	public void m1(float f ,int i) {
		System.out.println("float-int version");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.m1();
		t.m1(10);
		t.m1(10.5); // -->In the method overloading method resolution is always taken care by
					// compiler based on reference type (ie. Test t).
		t.m1("mangu");// hence method overloading is also known as compiletime polymorphism or static
						// polymorphism
		t.m1('a'); // -->>here no such type of parameter for but asscii value of a=97.so it
					// consider it as 97 int type and execute respective method.
		t.m1(10l); // -->here we havent method m1 with long type. so conversion take place as below
					// byte->short->int->long->float->double means long types not availabe but it
					// convert to double type. so insuch case also method overloading take place.
       
		t.m1(10,10f);  //--> while method overloading sequence of parameter also important. in which sequence we passed argument respective method will call.
		t.m1(10f,10);  //-->
	   //t.m1(10,10);  -->CE  here we havent any method in which taking arg as int-int type.
	}

}
