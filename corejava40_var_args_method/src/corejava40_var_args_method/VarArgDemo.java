package corejava40_var_args_method;

public class VarArgDemo {

	public static void main(String[] args) {
		// before 1.4 version of java if we want to perform same operation but for
		// diffrent argument, we need to define separate method for
		// each time. eg
       
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
	}

	//for each argument we need to defirne new method.
//	private static void sum(int i, int j, int k, int l) {
//		System.out.println(i+j+k+l);
//
//	}
//
//	private static void sum() {
//		System.out.println("zero arg");
//
//	}
//
//	private static void sum(int i, int j) {
//	     System.out.println(i+j);
//
//	}
//
//	private static void sum(int i, int j, int k) {
//		System.out.println(i+j+k);
//
//	}
     
	
	static void sum(int ...a) {
		int total=0;
		System.out.println("no of args pass "+a.length);  //-->to get no of arg pass
		System.out.println("first arg passed ="+a[0]);    //to get arg pass at perticular index
		for(int a1:a) {
			total=total+a1;
		}
		System.out.println("sum = "+total);
	}
}
