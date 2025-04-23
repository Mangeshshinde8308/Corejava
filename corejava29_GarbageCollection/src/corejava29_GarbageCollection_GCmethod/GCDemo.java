package corejava29_GarbageCollection_GCmethod;

import java.util.Date;

public class GCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();  // --->we can use Runtime siglton  class method gc() to request JVM to process GC.
		System.out.println(r.totalMemory());  //-->method of Runtime class to check total memory
		System.out.println(r.freeMemory());   // -->method of Runtime class to check available memory in JVM

		for (int i = 0; i < 1000; i++) {

			Date d = new Date();       // --> we created object. but we need to make object eligible for GC
			d = null;                  //1) by nullifying refference variable we can nullyfy make eligible to object for GC.
			                          //2)by assigning reff variable to onather object also we can make object eligible for GC
        }
		System.out.println(r.freeMemory());
		r.gc();    //-->requesting JVM to process GC. it just request. not necessary after invoking gc() method immediataly JVM run GC. mostly case run immediataly but not neccessary always.
		//System.gc();--> System class have also gc() method. gc() method of System class internally calleed to Runtime.getRuntime().gc() method. so use of Runtime.getRuntime().gc() recomanded than System.gc()..... 
		System.out.println(r.freeMemory());

	}

}
