package corejava36_StringBuffer_capacity;

//If containg of string is not fixed and keep changing everytime , so recomand to use StringBuffer rather than String.
//StringBuffer can perform changes on existing object. means if we change anything in contained . no new object will create like string.
//in case of string onceobject create lenght and capacity cant change. if we changed anything means new object will create.
//but in case StringBuffer capacity will change.
//for collection and StringBuffer capacity concept applicable but for array and string lenght concept aaplicable.
//bydefault capacity of STringBuffer id 16 char.
//if we add 17 char new capacity will change (old capacity+1)*2  --> means(17*2)=34.
//if we add 35 char then new capacity will change by SB object itselt(34+1)*2=70;
//if we add 71 tha char new cap will(70+1)*2=142 like this way only capacity will increase.


public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());  //-->16
		sb.append("zxcvbnmasdf");
		System.out.println(sb.capacity());   //-->16
		sb.append("zxcvb");
		System.out.println(sb.length());    //-->16
		System.out.println(sb.capacity());  //-->16
		sb.append("A");                     //added 17 th char in Object
		System.out.println(sb.length());    //-->17
		System.out.println(sb.capacity());   //-->34 (after adding 17 char capacity change to 34)
		System.out.println(sb);
		sb.append("zxcvbnmasdfzxcvbA");
		System.out.println(sb.length()); //-->34
		System.out.println(sb.capacity());//-->34
		sb.append("Z"); 
		System.out.println(sb.capacity());//-->70 after adding 35 char new capacity will be 70
		

	}

}
