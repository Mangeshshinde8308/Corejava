package corejava24_objectcasting.Upcasting;

//Upcasting is a type of object typecasting in which a child object is typecasted to a parent class object.
//By using the Upcasting, we can easily access the variables and methods of the parent class to the child class. 
//Here, we don't access all the variables and the method. We access only some specified variables and methods of the child class. 
//Upcasting is also known as Generalization and Widening.


class  Parent{  
	 
	
	   void PrintData() {  
	      System.out.println("method of parent class");  
	   }  
	}  
	  
	class Child extends Parent { 
		int x=10;
	   void PrintData() {  
	      System.out.println("method of child class");  
	   }  
	}  
	class UpcastingExample{  
	   public static void main(String args[]) {  
	        
	      Parent obj1 =(Parent) new Child();  //-->We can access some specified methods of the child class now.
	      Parent obj2 =(Parent) new Child();   //-->similar to overloading
	      obj1.PrintData();  //o/p -->method of child class
          obj2.PrintData();  ////o/p -->method of child class
          
         //here we stored we gave (Parent) to done upcasting. now reffrence of parent to able call child class method. like overloading
	   }  
	}  
