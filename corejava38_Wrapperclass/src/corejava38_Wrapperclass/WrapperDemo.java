package corejava38_Wrapperclass;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //All wrapper class Constructor and possible cases
		Integer I1 =new Integer(10);
		Integer I2=new Integer("5");
		//Integer I2=new Integer(10.5);   -->CE
		//Integer I4=new Integer("five");
		
		Double D1=new Double(10.555);
		Double D2=new Double("11");
		Double D3=new Double("10.7");
		Double D4=new Double(10);
		//System.out.println(D4);
		
		
		Float F1=new Float(10);
		Float F2=new Float(10.5);
		//Float F3=new Float("ten");  //RE
		Float F4=new Float(10.5F);
		Float F5=new Float("10.5F");

		
		Long L1=new Long(50000000668L);
		//System.out.println(L1);
		//Long L2 =new Long("10.5L"); -->RE
		Long L3=new Long("500");

		
		
		Boolean B1 =new Boolean("false");
		Boolean B2= new Boolean(true);
		Boolean B6= new Boolean("True");
		Boolean B3=new Boolean("False"); //O/P-->false
		Boolean B4=new Boolean(false);
		Boolean B5=new Boolean("mangu");
		
		System.out.println(B6);

		
		//Boolean B4=new Boolean(False);  -->>CE
       
		

	}

}
