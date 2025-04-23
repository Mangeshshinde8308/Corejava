package corejava30_ObjectClass_toString;
//We can use to string method to get String reprentation of an object.
public class Student {
	int rollNo;
	String name;
	 public Student(int rollNo, String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
//	//we have override this toString() method to get read object reffrence. 
//	 public String toString1() {
//		return "name "+name+"rollNo "+rollNo;
//		 
//	 }
	 
	 public static void main(String [] args ) {
		 
		 Student s=new Student(1, "Mangu");  
		 Student s1=new Student(2, "Mangu");
		 System.out.println(s);  // whenever we print object reffrence internally to string method will call.
		 System.out.println(s.toString());  // simillar to previous one.
		 System.out.println(s1);   //OP-->corejava30_ObjectClass_toString.Student@68837a77 --> this output came like this form because 
		                           //actual implementation of to string method in Object class as below.....
		                           //if we want output in meaningful form then we need to override toString() method.
//		        public String toString() {
//		        	return getClass().getName()+"@"+Integer.toHexString(HashCode());
//		        }
//		 public String toString() {
//		        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//		    }
		 
	 }
//	@Override    // eclipse IDE override toString() method following way so we can get output like -->Student [rollNo=1, name=Mangu]
//	public String toString() {
//		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
//	}
	
	
	//System.out.println(s1);
	//System.out.println(s1.toString()); both method are equal.
	 

}
