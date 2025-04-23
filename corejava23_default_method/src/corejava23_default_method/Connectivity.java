package corejava23_default_method;

//as we know in interface we need implement all defined method in implements classs of interface.
//suppose if there is any method in which is not required to implement in all implemented class, then we need to make that method default.
public interface Connectivity {
	
	 void dataConnect();
	 default void sqlConnection() {
		  System.out.println("this is default method present in Interface");
	}}
