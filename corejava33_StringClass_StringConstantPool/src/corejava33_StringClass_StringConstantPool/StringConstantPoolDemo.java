package corejava33_StringClass_StringConstantPool;

//A java string constant pool is place in heap memory where all the string defined literal in the program stored. 
//When we create any new string literal(String s="Mangu" ) JVM will check in SCP if that literal already present then just pointing that reffrence to that object.
//So everytime JVM no need to create objevt for same literal.
//if we created object using new keyword in that case two different object will create.
public class StringConstantPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Mangu");
		String s2=new String("Mangu");
		String s3="Mangu";
		String s4="Mangu";
		String s5="Mangu";
		String s6="mangu";
		String s7="mangu";
		System.out.println(s1==s2); //O|P -->false -->here object cerated with new keyword, so two different object created with in this case having diffrent refference 
		System.out.println(s3==s4); //O|P -->true  --> now in this case when new string object created the literal stored in SCP. so whenver wecerate any string 
		System.out.println(s3==s5); //O|P --->true     //with same literal, JVM will check this string aleady present in SCP ,so used that literal. no need to create literal again.
        System.out.println(s3==s6); //O/P -->false -->even small change in String lateral then also new object for that string literal will create.
                                    // s3 is directing to Mangu literal, while s6 directing mangu literal. due to change both string String object redirect diffrent object in SCP. 
	   System.out.println(s6==s7);  //O|P  -->true  -->same string literal so only one object will create in SCP for mangu. JVM will used that for s7
	}

}
