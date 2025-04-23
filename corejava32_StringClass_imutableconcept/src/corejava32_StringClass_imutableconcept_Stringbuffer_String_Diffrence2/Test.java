package corejava32_StringClass_imutableconcept_Stringbuffer_String_Diffrence2;

public class Test {

	public static void main(String[] args) {
		String s1=new String("Mangu");
		String s2=new String("mangu");
		String s3=s1;
		System.out.println(s1==s2);             //O|P -->False  -->Double equal operator compare object reffrence only.
		System.out.println(s3==s1);             //O|P -->False
		System.out.println(s1.equals(s2));      //O|P -->False   -->>in case of string class .equals() method overriden and modified such way
                                                                    //So it compare contains inside object 
		
		
		StringBuffer sb1=new StringBuffer("mangu");
		StringBuffer sb2=new StringBuffer("mangu");
		StringBuffer sb3=sb1;
		System.out.println(sb1==sb3);
		System.out.println(sb1==sb2);         //O|P-->false -->both object reffrence different
		System.out.println(sb1.equals(sb2));  //O|P-->fals-->in StringBuffer class .equals() method not overriden. so here Object class implemented
		                                      // method will call which compare object reffrence. if we want to Stringbuffer obhect contain comparison
		                                      //with equla smethod we need to overriden explicitaly so it will compare object inside object.
	}

}
