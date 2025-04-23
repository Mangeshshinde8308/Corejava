package com.methodsignaturedemo;


//In java method signature consist of method name followed by method argument type. and no of argument
//Imp--> if we used same method signature in same clas sthen compiler will gave us immediately compile time error.
public class MethodSignatureDemo {
	
	public int m1(int a) {
		return 10;
	}
	
//	public int m1(int a) {
//		return 10;             --> if we used same method signature in same class then compiler give us error.
//	}
	
	public double m1(double a) {
		return 10.5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MethodSignatureDemo m= new MethodSignatureDemo();
         m.m1(10);      //-->here we used same method name but argument is diffrent. if used same name and same kind of argument then comipler will gave error to you.
         m.m1(10.5);
         }

}
