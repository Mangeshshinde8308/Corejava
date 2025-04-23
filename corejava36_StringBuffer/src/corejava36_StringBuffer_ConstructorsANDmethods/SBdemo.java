package corejava36_StringBuffer_ConstructorsANDmethods;

public class SBdemo {

	public static void main(String[] args) {
		
		//StringBuffer Constructor
		
		//we can used below constructor if we dont know how should capacity of SB. by defauld capacity will remains 16 and increased by (old cap+1)*2 if needed.
		StringBuffer sb =new StringBuffer();  // only for this constructor bydefauld capacity increase.
		
		
		//If we have idea about capacity we can use below constructor. so memory wastage can be avaoid.
		StringBuffer sb1=new StringBuffer(3);
		System.out.println(sb1.capacity()); //-->3 we defined capacity
		sb1.append("asdfghjk");             //if we defined and again we add more char then capacity will equal to allchar
		System.out.println(sb1);   
		System.out.println(sb1.capacity());  //--8  now capacity is 8 not 16. because here constructore is different
		
		
		
		
		//We can pass String Object or String into SB.
		String s=new String("Durga");
		//System.out.println(s.capacity());  --> no such capacity method applicable for String and array. 
		StringBuffer sb2=new StringBuffer(s);
		System.out.println(sb2.capacity()); //==> 21  ==> if we passes the String contain/object in SB object that time capacity of SB
		StringBuffer sb3=new StringBuffer("Durgaaa");  //objecvt equals to (String obj lenght+default capacity)
		System.out.println(sb3.capacity()); //-->23
 
	}

}
