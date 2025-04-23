package corejava20_Object_casting_demo;

public class Test {

	public static void main(String[] args) {
		
		Object o=new String("durga");
		 StringBuffer sb=(StringBuffer) o;
//		A              b= (C)           d;
// above is syntax of Object casting
//		 A=Class/interface name;
//		b=reffrence variable name;
//		C=Class/Interface name;
//		d=reffrence variable name;

//Rule 1) The Object type "d" and "C" must have some relation.either they have parent-child or child-parent relation 
//Rule 2)"C" must be same or derived type of "A" otherwise we will get compiletime Error.
//Rule 3) runtime object type of "d" must be same of derived type of "C";--->this is runtime exception. code will compile but when we run program we get exception.
		 
//In the above example runtime object type of "o" is string type. and "C" is StrinBuffer. 
//there is no relation between Stringbuffer and String. so this code will compile succesfully but while running we get runtime exception.
		 
	}

}
