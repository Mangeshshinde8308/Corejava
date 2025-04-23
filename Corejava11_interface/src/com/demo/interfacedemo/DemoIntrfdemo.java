package com.demo.interfacedemo;


//by using implements we can implements all method from interface. we need to compulasary implements all method. 
//we define this class as abstract beacuse we not gave completely implemention.
//remaning methods we need to implement by using extending parent class.
public abstract class DemoIntrfdemo implements DemoIntrf  {    

	@Override
	public void m1() {    //if we changed scope as private it will show CE. we cant reduce scope while implementing methods.
    System.out.println();		
	}

//	@Override
//	public void m2() {
//		// TODO Auto-generated method stub
//		
//	}
	
	//if we dont want to implement all method in same class we need to extend parent class and in child class we can implement 
	//remaning method. and we haev not implement all method so we need to define such class as abstract

}
