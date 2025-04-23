package corejava19_methodhiding;

//method hididng similar to method overriding but both method in child and parent should be static.
//Method hiding can be defined as, "if a subclass defines a static method with the same signature as a static method in the super class,
//in such a case, the method in the subclass hides the one in the superclass." The mechanism is known as method hiding. 
//It happens because static methods are resolved at compile time.
class Parent {

	public static void m1() {
		System.out.println("static m1 method in parent");
	}

	public void m2() {
		System.out.println("non stat m2 method in parent ");
	}

}

class Child extends Parent {

	public static void m1() {
		System.out.println("static m1 method in child");
	}

	public void m2() {
		System.out.println("non stat m2 method child");
	}

}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p=new Child();
		p.m1();   //O/P-->static m1 method in parent  -->static polymorphysam
		p.m2();   //O/P-->non stat m2 method child  -->runtimepolymorhism
 // In above example when we called static method which is override. but it invoke parent class method. here compile time polymorphysm happning. nnot like other method overriding runtime object class method invoked.that is we hide subclass method and invoke super calss method that is method hiding
		//but in m2 it invoke child class method . method overriding happen here. runtime polymorphysam happen in m2. consider runtime object

	}

}
