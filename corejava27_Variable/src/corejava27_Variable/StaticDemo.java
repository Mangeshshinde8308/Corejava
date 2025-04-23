package corejava27_Variable;

public class StaticDemo {
	 static int a=100;
	 int b=999;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo a1=new StaticDemo();
		a=1000;  //-->reassigned static variable   -->>now new value assigned to a
		a1.b=1001;  //-->reassigned instance variable
		System.out.println(a   +","+ a1.b);
		
		StaticDemo a2=new StaticDemo();
		System.out.println(a   +","+ a2.b);  //-->here we not assisgned value for instance variable. so for each object take new value.


	}

}
