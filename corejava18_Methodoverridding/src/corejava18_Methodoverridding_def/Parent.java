package corejava18_Methodoverridding_def;

public class Parent {
	
	public void property() {
		System.out.println("cash+gold+land");
	}
	public void marriage() {
		System.out.println("rajalaxmi");
	}
}	
	class Child extends Parent{
//In case of method overrididng name, argument, everything must be matched. returntype also should match
		@Override
		public void marriage() {
			System.out.println("priya");  //-->here we used same method as parent but we implemented diffrently.
		}
		
		
	}
  class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p=new Parent();  //-->rajalaxmi
		Child c=new Child();    //-->priya  
		Parent p1=new Child();  //-->priya   here p1 is reffrence of parent but, we are seeing child method called.beacuse in case of overriding 
		                        //execution takes place by JVM. JVM will check first is there any method overrriding. if method overrididng is there based on runing object jVM will execute child class method
		                        //hence method over loading is called dydnamic or runtime polymorphisam.
		p.marriage();
        c.marriage();
        p1.marriage();
	}

}
