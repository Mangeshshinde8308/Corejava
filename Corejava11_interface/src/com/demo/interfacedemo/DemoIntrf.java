package com.demo.interfacedemo;



//every method inside abstract class is bydefault abstract and public. if we define or not. it is bydefault abstract and public.
//All method inside interfce is bydefault abstract, so we an not cerate object of interface.
public interface DemoIntrf {   
	
	 int m=10;    //every variable present inside interface is always public,static, and final, whether we are declare it or not
	              //every interface variable should be initiallized while at time of delaration. here when we declare m we inintiallized it imediately.
	            //due to this there is no chance of instance variable( object nusar badalat janare varaiable)
	               //constructor concept also not applicable for interface.
	void m1();   //  here we havent defined aceesss moidifier but bydefault it is public and abstract
	void m2();
	  
	

}
