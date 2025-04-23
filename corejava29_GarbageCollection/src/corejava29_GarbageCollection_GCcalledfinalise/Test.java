package corejava29_GarbageCollection_GCcalledfinalise;

public class Test {
      public static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10000000;i++) {    
			Test t=new Test();
			t=null;
		}
		
	}
	public void finalize() {
		System.out.println("calling finalize methos "+ ++count +" times");
	}

	}


