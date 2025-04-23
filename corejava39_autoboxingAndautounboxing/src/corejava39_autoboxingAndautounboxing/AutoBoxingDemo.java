package corejava39_autoboxingAndautounboxing;

public class AutoBoxingDemo {
	static Integer I=100;  //-->autoboxing

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=I;  //-->unboxing
		m1(i);

	}

	private static void m1(Integer K) {  //-->autoboxing
		
		int k=K;   //-->unboxing
		System.out.println(k);
		
		
	}

}
