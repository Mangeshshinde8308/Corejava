package corejava34_StringClass_StringClassRuntimebehaviour;

public class StringRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("mangu");
		String s2=s1.toUpperCase();
		String s3=s1.toLowerCase();
		String s4=new String("mangu");//
		System.out.println(s1==s2);  //-->false  -->when s2 created there changed in contain .string change from mangu to MANGU so created new object so both refference are diffferent.
		System.out.println(s1==s3);  //-->true  --> in runtime if there is no change like SCP s3 will directing towards s1. no new object will create.
        System.out.println(s1==s4);  //false--> here object create with new keyword. so in runtime also cretae new object with diffrent reffrence.
	}

}
