package corejava28_Multitreading_daemonthreadDemo2;

public class DaemonthreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		MyThread t=new MyThread("Mythread");
		
		System.out.println(t.currentThread().getName());
		System.out.println(t.currentThread().isDaemon());
		t.setDaemon(true);
		t.start();
		System.out.println(t.isDaemon());

		

	}

}
