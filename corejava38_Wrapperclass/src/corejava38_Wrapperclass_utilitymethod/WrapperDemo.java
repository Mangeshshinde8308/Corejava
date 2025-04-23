package corejava38_Wrapperclass_utilitymethod;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// public static Integer valueOf(int/long/float/double/short i)
		Integer I1=new Integer(10);
		Integer I2=new Integer("10");
		Integer I3=Integer.valueOf("10");
		Integer I4=Integer.valueOf(15);
		Double D=Double.valueOf(12.5);
		Long L=Long.valueOf(161);
		System.out.println(I3);
		System.out.println(I4);
		
		
		//form 2 of valueOf method  --><applicable for all integral datatype(SHORT,INTEGER,LONG,BYTE) and used to create respective 
		//wrapper class object to provide radix string.
		
		Integer I7=Integer.valueOf("111", 2);
		System.out.println("valie for radix string "+I7);
	
		
		
		
		//XXXValue() -->every number type wrapper class contain(Byte,Short,Integer,Long,Float,Double) contain below xxxvalue method.
		//public double doubleValue()
		//public double intValue()
		//public double shortValue()
        //public double longValue()
		//public double byteValue()
		Integer I=new Integer(10);
		System.out.println(I.intValue());
		System.out.println(I.doubleValue());
		System.out.println(I.shortValue());
		System.out.println(I.longValue());
		System.out.println(I.byteValue());
		System.out.println(I.floatValue());
		
		
		Byte B=new Byte("127");
		System.out.println(B.intValue());
		System.out.println(B.doubleValue());
		System.out.println(B.shortValue());
		System.out.println(B.longValue());
		System.out.println(B.byteValue());
		System.out.println(B.floatValue());
		
		
		Character C=new Character('a');
		System.out.println(C.charValue());  //-->a
		
		
		
		Boolean B1=new Boolean("True");
		System.out.println(B1.booleanValue()); //-->true
		
		
		
		//ParseXXX()  -->convert wrapper class string object into primitive type. not applicable for char.
		int i=Integer.parseInt("10");
		System.out.println(i);
		
		
		/*
		 * double d=Double.parseDouble("jsjsk"); System.out.println(d);
		 */
		
//		Short s=Short.parseShort("ten");
//		System.out.println(s);
		
		//char c=Character.parseChar('C'); ParseXXX() not applicable for char method.
		
		//public static primitive parseXXX("String s",int i);  this is another form parseXX method which is aaplicable for only
		//Inegral datatype only.(Short,Long,Integer,Byte) conver specified radix into primitive type.
		int i10=Integer.parseInt("111", 2);
		System.out.println(i10);
		
		
		
		
        //toString()  -->form 1-->this method used to convert Wrapper class object into string type.
		Integer I11=new Integer(100);
		String s=I11.toString();  //-->100
		System.out.println(I11.toString()); //O|P-->wrapper to string type
		System.out.println(I11);   //I11.toString()==I11 ->both having same meaning.
		
		
		
		//toString()-->form2 --> convert wrapper class primitive value into String form.
		//Syntax-->public String toString(Primitive P)
		String s20=Integer.toString(100);
		System.out.println(s20);
		
   

		
		
		
		
		
		
}

}
