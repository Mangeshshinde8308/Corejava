package corejava29_GarbageCollection_finalise_case2;


//Note:->just before destroying object by GC call finalize() method on the object which is eligible for Garbage collection.
public class FinalizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s=new String("Durga");  --> when this object eligible for GC then also finalize() method will not run
		FinalizeDemo s= new FinalizeDemo();
		s=null;
		System.gc();   
		System.out.println("end of main method");

	}
	//This finalise method will not call here. String object is eligible for GC hele but internal inplemantation of fnalize method in string is empty.
	public void finalize() {              
		System.out.println("calling finalize method");
	}

}
