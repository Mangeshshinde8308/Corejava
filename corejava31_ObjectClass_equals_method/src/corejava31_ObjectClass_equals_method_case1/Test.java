package corejava31_ObjectClass_equals_method_case1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Mangu");
		String s2=new String("Mangu");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2)); //-->for string class only .equals method is overriden to compare contain of the class. 
		                                   //other classes need to override equals() method according to compare contain.
		
		StringBuffer sb1=new StringBuffer("Mangu");
		StringBuffer sb2=new StringBuffer("Mangu");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		
		StringBuilder sb3=new StringBuilder("Mangu");
		StringBuilder sb4=new StringBuilder("Mangu");
		System.out.println(sb3==sb4);
		System.out.println(sb3.equals(sb4));


	}

}
