package com.methodoverloading.case2;

public class Test {
	 public void m1(String s) {
		 System.out.println("string-version");
	 }
	 public void m1(StringBuffer sb) {
		 System.out.println("StringBuffer version");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Test t=new Test();
       t.m1("mangu");
       t.m1(new StringBuffer("mangu"));
      // t.m1(null);  -->here null can be passed to both m1 method. but here no child-parent relationship
      //so compiler will confuse in such case and give error.
	}

}
