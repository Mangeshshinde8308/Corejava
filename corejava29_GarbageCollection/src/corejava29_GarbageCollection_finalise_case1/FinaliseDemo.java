package corejava29_GarbageCollection_finalise_case1;


//Note:--> even object eligible for GC many time but finalise method called only once for an object from GC
public class FinaliseDemo {
	static FinaliseDemo s;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FinaliseDemo f=new FinaliseDemo();  //-->assigning reff variable to object
		System.out.println(f.hashCode());
		f=null;                             //-->Nullyfying object 
		System.gc();                       //calling gc() method 
		Thread.sleep(5000);                //sleeping main thread to give time to GC(Deamon thread) to call finalize() method.
		System.out.println(s.hashCode());
		s=null;                            //nullyfying FinaliseDemo again
		System.gc();                       //calling gc() so GC will call finallize.
		Thread.sleep(10000);               //---> cant finalize method call again even through object is eligible for Garbage collection.
		System.out.println("end of main method");
		
		

	}
	public void finalize() {     //originally method is protected but we can take public, cant make private .because we cant reduce scope of override method
		System.out.println("finalize method call");
		s=this;                  //again assigning 
	}

}
