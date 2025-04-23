package corejava32_StringClass_imutableconcept_Stringbuffer_String_Diffrence;

public class Test {

	public static void main(String[] args) {
		String s1=new String("Mangu");
		s1.concat("dada");
		System.out.println(s1);
		//O|P -->Mangu  -->we perform concate operation on string object. but no change occure in string object. new object create for mangudada have no reffrnce which eligible for garbage collection.
		                  //this behaviour call imutability of string means no change in object.
		//String s2=s1.concat("dada"); -->> now we will not received any error because chage occure in  s1 so new object cerated and we stored assigned to new reffrence.
		
		
		StringBuffer sb=new StringBuffer("Mangu");
		sb.append("Dada");
		System.out.println(sb);   
		//O|P -->ManguDada  -->here we perform operation on Stringbuffer append with Dada. so change happen in the same object and we got output as "ManguDada".  

	}

}
