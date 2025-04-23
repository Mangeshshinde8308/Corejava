package com.constructor;

public class Student {
	int rollNo;
	String name;
	String branch;
	
	
	
	
	Student(){
		rollNo=1;
		name="ram";
		branch="civil";    //we can intialized instance variable directly inside constrocter as well.
	System.out.println(rollNo+name+branch);
	}
	
	
	
	
	Student(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
		System.out.println("calling this constructor by giving only rollNo and name");
		System.out.println(rollNo+name);
	}
	Student(String branch){
		this( 1, "mangu");  //here we not written double element. we just called constructor using this keyword. and give only three paramenter.
		this.branch=branch;
		System.out.println("used this keyword and called two parameterised constructor");
		System.out.println(rollNo+name+branch);
	}
	
	public static void main(String[] args) {
		Student s1=new Student (1,"Mangu");
		Student s2=new Student("Mech");  // 
		Student s3=new Student();  //we gave value directly inside contructor for this object. when we will create new object and assigne value in constructor. 
		                             // so that value will be consider for that variable for that object.
		
	}
}
