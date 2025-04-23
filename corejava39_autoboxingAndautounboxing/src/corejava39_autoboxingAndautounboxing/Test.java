package corejava39_autoboxingAndautounboxing;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//from 1.5v of jaav compiler can autoatically convert primitive type into wrapper class object this known as autoboxing.
		Integer I=10;   
		System.out.println("primitive to wrapper -->"+I);
		
		//when autoboxing happen internally compiler will run below code.
		//Integer I=Integer.valueOf(10)/("10");
		
		//also from 1.5V of java onward compiler can automatically convert Wrapper class object into primitive type, this known as autounboxing.
		 int i=I;
		 System.out.println("Wrapper class object to primitive type-->"+i);
		 
		 //when autounboxing happen compiler will run below code internally
		 //Integer I=new Integer(10);
		 //int i=I.intValue();
		 
		
		

	}

}
