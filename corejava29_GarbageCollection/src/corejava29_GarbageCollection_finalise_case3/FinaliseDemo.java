package corejava29_GarbageCollection_finalise_case3;

public class FinaliseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FinaliseDemo f=new FinaliseDemo();
		 f.finalize();   //-->in this case finalize will call like normal method.
		 f.finalize();   // -->in this case also finalize will like normal method
		 f=null;
		 System.gc();     //--> after nullyfying object and calling gc() method we make object eligible for Garbage collection.
		                  // Now only garbage collector will call finalise method to perform cleanup activity.
		                    // other two cases called like normal method not as GC finalise() method.
		 System.out.println("end of main method");
		  

	}
	
	public void finalize() {
		System.out.println("callig finalize method");
	}

}//OP-->callig finalize method
//callig finalize method
//callig finalize method
//end of main method
