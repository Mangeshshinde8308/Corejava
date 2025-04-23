package corejava28_Multitreading_daemonthreadDemo_threadterminate;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythread t=new Mythread();
		t.setDaemon(true);
		t.start();
		System.out.println("main execution complete");

	}
       //O/P -->main execution complete
	   //       child thread
	   //here JVM thread schedular first allow main thread. once main(non-Deamon Thread) thread execute. once all non deamon thread compelete
	   //deamon thread will also complete.

}
