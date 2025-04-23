package corejava18_Methodoverridding_rule;


abstract class Parent{     //-->if class contain any abstarct method we need to define class as abstarct
//ruel 1--if parent contain abstract we can override and implement that method
	
	public abstract void m1();   //-->we can override and implement abstract method in child

//Rule 2 --> we can override non abstract method as bastarct method
	
	 public void m2()
	 {
		 System.out.println("non abstarct m2 method");
	 }
	

//Rule 3-->we can not override static method
	 
	 public static void m3() {
		 System.out.println("static m3 method");
		 
	 } 
//Rule 4 -->we cannot override non- static method as static in child
		 
	public void m4() {
		System.out.println("non-static m4method");	
	}

	
//Rule 5 -->we can not reduce scope of method while overriding	
	
	public void m5() {
		System.out.println("");
	}
	
//Rule 6 -->no concept of variable overriding. wrt to reffrence instance variable will be invoke	
	String s= "parent String";
		
}
	

abstract class Child extends Parent
{

	@Override
	public void m1() {       //--.we can override abstarct method
		System.out.println("override and implement m1 in child");
		
	}
	
	
	public abstract void m2();  // -->overide non  abstarct method as abstract in child
	
//	 public void m3() {
//     System.out.println("cannot overrid static method");   -->static methos are calss level method. we can not override them
//		 } 
//	
	
	
//	public static void m4()
//	       {
//		System.out.println("non-static m4method");    -->can not override non static method as static in child 
//			}

	
//  private void m5() {
//	  System.out.println("cannot reduce scope of method while overriding");
//  }
    
	String s="child String";
	

}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

			
			
		

		}

}
