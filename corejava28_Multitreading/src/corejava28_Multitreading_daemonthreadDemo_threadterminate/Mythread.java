package corejava28_Multitreading_daemonthreadDemo_threadterminate;

public class Mythread extends Thread {

	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
