package corejava24_objectcasting.Downcasting;

public class Parent {
	   
	    String name;   
	    
	    // A method which prints the data of the parent class   
	    void showMessage()   
	    {   
	        System.out.println("Parent method is called");   
	    }   
	}   
	    
	// Child class   
	class Child extends Parent {   
	    int age;   
	    
	    // Performing overriding  
	    @Override  
	    void showMessage()   
	    {   
	        System.out.println("Child method is called");   
	    }   
	}   
	    
	 class Downcasting{  
	    
	    public static void main(String[] args)   
	    {   
	        Parent p = new Child();  
	         Child c = (Child)p;   //-->>like A a=(C) d  -->The reference of the parent class object is passed to the child class.
	                                                    //-->All the methods and variables of both classes can be accessed by performing downcasting.
	         
	      // Performing Downcasting Implicitly   
		   //Child c = new Parent(); // it gives compile-time error   -->clild class reff cant holt parent class obj.
		          
		   // Performing Downcasting Explicitly   
	         
	        c.name="Mangu"; 
	        c.age = 18;   
	        System.out.println(c.name);   //-->>Now can able to access parent class variable using child calss c reffrence.
	        System.out.println(c.age);   
	        c.showMessage();   
	    }   
	}  


