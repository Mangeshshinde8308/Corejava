package corejava15_HAS_A_relationship;

public class Car {
	 int regNo;
	 String colour;
	 
	Engine en=new Engine();   //-->>here we used or created instance of other class. that is we created HAS-A relation ship. this is runtime binding
	                          // when we need to used or utilize all functionality from other class then we need go with IS -A (Inheritance) functionality.
	                         // when we need only specific kind of functionality then from other class then we can go with HAS_A(Association) relation.
	
	

}
