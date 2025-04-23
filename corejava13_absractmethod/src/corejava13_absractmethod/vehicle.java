package corejava13_absractmethod;
//In a simple abstract meant partially implemented.
//The abstract Method is used for creating blueprints for classes or interfaces. 
//Here methods are defined but these methods don’t provide the implementation. 
//Abstract Methods can only be implemented using subclasses or classes that implement the interfaces.

//To declare an abstract method, use this general form:
//abstract type method-name(parameter-list);  -->means we just declared methods. not implemented the method.


 abstract public class vehicle {      //if we declare any menthod in class as abstarct means we need to define that class abstarct as well.
	                                  //This required because if class contains any abstract method means it not giving partial implemetation.
	public abstract int getNoOfwheel();
	

}
