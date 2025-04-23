package corejava36_StringBuffer_methodChaining;

public class SBdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wed can call method on result of previous method with returntype. this is known as method chaining
		StringBuffer sb=new StringBuffer();
		sb.append("Mangu").append(true).insert(5, "  RAM  RAM   ").delete(0, 34).append("new SB");
		System.out.println(sb);
	}

}
