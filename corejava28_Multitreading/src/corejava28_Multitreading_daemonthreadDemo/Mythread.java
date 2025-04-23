package corejava28_Multitreading_daemonthreadDemo;

public class Mythread extends Thread{
	Mythread(String name){  //giving name to thread
		super(name);
	}
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+"- is Deamon Thread");
		}
		else
		{
			System.out.println(getName()+"- is user thread ");
		}
	}

}
