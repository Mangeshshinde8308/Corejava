package corejava35_Create_Immutable_class;

final class Test {   // if we need to make our own class also immutable then we need to declare that class as final. so we can change it in implemented class.
	private int i;
	 Test(int i){
		 this.i=i;
	 }
  
	 public Test modify(int i) {
		 if(this.i==i) {
			 return this;
		 }
		 else
		 {
			 return new Test(i);
		 }
	 }
	 
	 
	 public static void main(String[] args) {
		 Test t1=new Test(10);
		 Test t2=t1.modify(100);
		 Test t3=t1.modify(10);
		 
		 System.out.println(t1==t2);  //-->false
		 System.out.println(t1==t3);  //-->true
	 }
	 
	 //this way we can create immutable class.
}
