package corejava18_Methodoverridding_of_private;

public class Parent {
	 private void m1()      
	 {
		 System.out.println("this is parent method");
	 }
	 
	 public final void  m2()
	 {
		 System.out.println("finallize method");
	 }
	 
		 
}
class Child extends Parent{
//	 private void m1()                                    //we can not access private method outside class
//	 {                                                    // so we cant override private method
//		 System.out.println("this is parent method");
//	 }
//	 
//	 public final void  m2()                      -->we can not change in final method.
	                                             //-->we can not override final method as well
//	 {
//		 System.out.println("finallize method");
//	 }
//	
	
}


class Test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
