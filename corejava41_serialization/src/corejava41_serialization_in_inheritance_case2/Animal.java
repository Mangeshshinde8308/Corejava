package corejava41_serialization_in_inheritance_case2;

import java.io.Serializable;

public class Animal {
	int i=10;
}

class Dog extends Animal implements Serializable{
	
	int j=20;
}
