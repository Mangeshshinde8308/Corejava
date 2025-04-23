package corejava41_serialization_in_inheritance_case1;

import java.io.Serializable;

public class Animal implements Serializable {
	
	int i=10;

}

 class Dog extends Animal {  //we not implement serializable interface in child then also we can serialise child object.
	 
	 int j=20;
	 
 }
