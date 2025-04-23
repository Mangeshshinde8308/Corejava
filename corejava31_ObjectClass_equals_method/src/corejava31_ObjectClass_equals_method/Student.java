package corejava31_ObjectClass_equals_method;

public class Student {
    int rollNo;
    String name;
    public Student(int rollNo, String name) {
    	this.rollNo=rollNo;
    	this.name=name;
    	
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1, "Mangu");
		Student s2=new Student(2,"Ram");
		Student s3=new Student(1, "Mangu");
		Student s4=s1;
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1.equals(s4)); //O|P :-->True -->Object class .equals() methods comapare adddress reff only. 
		System.out.println(s1.equals(s2)); //O|P :-->False
		System.out.println(s1.equals(s3)); //O|P :-->False -->here s1 and s3 contains same object but but add reff is diffrent.
		                                   //If we want to compare object conatin then we need to override .equal method.
		//System.out.println(s1==s3);  

	}

}
