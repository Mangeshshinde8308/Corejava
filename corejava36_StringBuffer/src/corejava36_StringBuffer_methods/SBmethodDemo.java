package corejava36_StringBuffer_methods;

import java.security.PublicKey;

// we can observe StringBuffer is synchronised class. all methods are also sysnchronised in stringbuffer.
public class SBmethodDemo {

	public static void main(String[] args) {
		
		
		//public synchronized StringBuffer append(String s) -->> this method used to add contain in SB object. aapend method can add any datatype contain in SB object.
       ////public synchronized StringBuffer append(int s)
		////public  synchronized StringBuffer append(double s)
		////public synchronized StringBuffer append(boolean s)
		
		StringBuffer sb=new StringBuffer();
		sb.append(false);
		sb.append("Mangu");
		sb.append(12345);
		sb.append(10L);
		System.out.println(sb);
		
		// public synchronized int length() { --> define lenght of SB object.
		System.out.println(sb.length());
		
		// public synchronized int capacity()  -->return capacity of SB object
		System.out.println(sb.capacity());  //--> 34 because object created with empty object.
		
		
		
		//public synchronized char charAt(int index) 
		System.out.println(sb.charAt(4)); //__>e
		
		
		
		//public synchronized StringBuffer insert(int offset, String str) -->insert method can add contain from provided index, while append add contain at last of existing containt.
		//public synchronized StringBuffer insert(int offset, int str)
		//public synchronized StringBuffer insert(int offset, boolean str)
		//public synchronized StringBuffer insert(int offset, float str)
		//public synchronized StringBuffer insert(int offset, double str)
		
		sb.insert(3, "adding using append  ");
		System.out.println(sb);  //--->faladding using append  seMangu1234510
		
		//public synchronized StringBuffer delete(int start, int end)  --> delete contain between provided indedx.
		sb.delete(4, 10);
		System.out.println(sb);  //-->falausing append  seMangu1234510
		
		// public synchronized StringBuffer deleteCharAt(int index) -->delete char at provided index.
		sb.deleteCharAt(5);
		System.out.println(sb);  //-->falauing append  seMangu1234510
		
		
		
		// public synchronized StringBuffer reverse()   -->>reverse the char sequence
		sb.reverse();
		System.out.println(sb);     //-->0154321ugnaMes  dneppa gniualaf
		
		// public synchronized void setLength(int newLength)  -->considering char upto provided lenght. removing remaining
		sb.setLength(10);
		System.out.println(sb);  //-->0154321ugn
		
		
		// public synchronized void trimToSize()   --> trimmed capatity upto provided char only
		StringBuffer sb1=new StringBuffer(1000);  // intially declared capacity upto 1000
		sb1.append("RAM");
		sb1.trimToSize();                          //trimmed unnecessary capacity
		System.out.println(sb1.capacity());         //-->3
		
		}

}
