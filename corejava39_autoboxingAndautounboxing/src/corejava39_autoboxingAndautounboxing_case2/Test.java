package corejava39_autoboxingAndautounboxing_case2;

public class Test {
     static Integer I=0; //-->we can assign zero to wrapper class. it will behave normally.
     
     static Integer M;   //if we can not give value to static variable it will zero. but here M is wrapper so JVM assigne null to M. ie. M=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=I;
		System.out.println(i);  //-->O|P==0
		
		int m=M;       //we have not give value means  -->int i=M.intValue()  -->in backgrounf as null assigned to M. 
		                                                  //compiler will try to convert null to int. so return null point exception.
		System.out.println(m);   //-->Exception in thread "main" java.lang.NullPointerException:
		

	}

}
