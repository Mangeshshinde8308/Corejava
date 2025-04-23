package corejava34_StringClass_StringClassmethods;

public class StringDemo {

	public static void main(String[] args) {
		
		
		
		//String(){}
		String s1=new String();//--> create object with empty string  ==>String s="";-this is empty string  String s=null --> this is not empty object
		System.out.println(s1);
		
		
		//String(String literal) -->create object with provided String literal
		String s2=new String("mangu");
		System.out.println(s2);
		
		
		//String( StringBuffer sb) --> create object with provided StringBuffer object
		StringBuffer sb=new StringBuffer("StringBuffuer");
		String s3=new String(sb);
		System.out.println(s3);
		
		
		//String(char [] ch){}  -->>create object with provided char array
		char[] ch= {'a','b','c','d'};
		String s4=new String(ch);
		System.out.println(s4);
		
		
		//String(byte[] arr){} -->create object with provided byte array
		byte [] arr= {97,98,99,100};
		String s5=new String(arr);
		System.out.println(s5);
		
//O|P -->>		
//		
//mangu
//StringBuffuer
//abcd
//abcd
		
		


		
//Some important method of String Class
		
		//public String concat(String s)
		String a="Mangu";
		String b="Bhai";
		System.out.println(a.concat("dada"));    
		System.out.println(a.concat(b));
		String c=a+a.concat("sir");
		c +="Da";
		System.out.println(c);
		
		
		//public char charAt(int index)-->return character at given index
		String d="RAM";
		System.out.println(d.charAt(1));  //O|P-->
		
		//public String equalsIgnoreCase(String s) -->compare string without considering upper and lower case.
		                                           //This method mostaly used to validate username
		String e="Mangu";
		System.out.println(e.equalsIgnoreCase("mangu"));  //--O|P -->true
		
		
		//public String subString(int begin) -->return substring from provided index char to last char
		//public String subString(int begin, int last)  -->return String from provided from begin index to end -1 index char
		 String f="ABCDDEF";
		 System.out.println(f.substring(3));  //-->DDEF
		 System.out.println(f.substring(3,6));//-->DDE
		// System.out.println(f.substring(15));   //-->RE --Exception in thread "main" java.lang.StringIndexOutOfBoundsException:
		// System.out.println(f.substring(3,15));//-->RE --Exception in thread "main" java.lang.StringIndexOutOfBoundsException:
		 
		 
		 
		 //public int lenght()  -->return lenght of String.
		 String g="Mangu";
		 System.out.println(g.length());  //-->5
		 //System.out.println(g.lenght);  //this lenght method is for to determine arrays lengt.
		 
		 //public String replace(char oldchar, new char)--> replce old char with new provided char
		 String h="AABABAA";
		 System.out.println(h.replace('A', 'B'));  //-->BBBBBBB
		 
		 
		 //public String toLowerCase(String s) --> convert all string into lowercase
		 //public String toUpperCase(String s) -->convert all string into uppercase
		 String j="ManGu";
		 System.out.println(j.toLowerCase());//-->mangu
		 System.out.println(j.toUpperCase());//-->MANGU
		 
		 
		 
		 //public String trim(String)  -->To remove blank spaces in begining and end of string but not from middle of string
		 String m="  MAN  GU";
		 System.out.println(m.trim()); //-->MAN  GU -->not trimmed spaces between middle.
		 
		 
		 
		 //public int indexOf(char c)  --> return index of provided String
		 //public int lastIndexOf(char c)--> if string contaning repeated char then return index of same char occur last
		 
		 String n="MANGUU";
		 System.out.println(n.indexOf("N"));  //-->2
		 System.out.println(n.lastIndexOf("U")); //-->5
		 System.out.println(n.indexOf("x"));   //--> If character not present in String means return -1.
		
		
		
		
		
		
		
		

	}

}
