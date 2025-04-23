package corejava30_ObjectClass_toString_case1;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public String toString() {
		return "Test";
	}

	public static void main(String[] args) {
		
		//In all wrapper classes, collection classes,String, StringBuilder, stringBuffer Class have already overridden toString method.
		//so we no need to override again print object reffrent to get Object refference in meaningful form
		
		
		String s=new String("mangu");
		System.out.println(s);   //O|P :-mangu
		
		Integer I=new Integer(100);
		System.out.println(I);  //O|P  :-100
		
		Boolean B=new Boolean(false);
		System.out.println(B); //O|P   :-false
		
		List l=new ArrayList();
		l.add("obj1");
		l.add("Obj2");
		System.out.println(l);  //O|P :-[obj1, Obj2]
		
		Test t=new Test();
		System.out.println(t);  //O|P :-corejava30_ObjectClass_toString_case1.Test@2d554825
		
		//In this case our derived class we havent override toSting method and modify to get meaningful output. thereofre we get above output. 
		//If we need to meanningful output then we need to override method. like below
		
		//	public String toString() {
        //	return "Test";
        //	}

	}

}
