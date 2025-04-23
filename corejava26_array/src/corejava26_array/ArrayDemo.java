package corejava26_array;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		sum(new int[] {1,2,3,4,5});  // this is called anonomous array. for instance use only we created this array. for 
		                              //one time usage perpose only we can use this.
		
	}

	private static void sum(int[] a) {
		// TODO Auto-generated method stub
		int total=0;
		for(int sum: a) {
			total+=sum;
			
		}
		System.out.println(total);
	}

}
