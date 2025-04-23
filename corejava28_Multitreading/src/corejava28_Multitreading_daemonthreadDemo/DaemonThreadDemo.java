package corejava28_Multitreading_daemonthreadDemo;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythread t1=new Mythread("t1");
		Mythread t2=new Mythread("t2");
		Mythread t3=new Mythread("t3");

		t1.setDaemon(true);
		t1.start();
        
		t2.start();
		
		//t2.start();   -->if we start thread already we cant start it again by using start().means we cant use start() two times for same thread.
        
        t3.setDaemon(true);
        t3.start();
       // t3.setDaemon(true); -->if we set nature of thread after start thread then also we can get illegal thread exception.
        //(mhanje ithe apan t3.start() kelyananter t3.t3.setDaemon(true); ne thread cha nature change karatoy . tyamule exception yeil.
	}

}
