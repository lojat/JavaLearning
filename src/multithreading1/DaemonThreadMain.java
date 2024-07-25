package multithreading1;


//Demon Thread are the thread that running background on the main thread
class DaemonThread extends Thread{
	
	public void run() {
		//checking thread is daemon or not
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName()+": Daemon thread");
		}
		else
			System.out.println(Thread.currentThread().getName()+": Not a daemon thread");
	}
}

public class DaemonThreadMain {

	public static void main(String[] args) {
		
		DaemonThread thread1= new DaemonThread();
		DaemonThread thread2= new DaemonThread();
		DaemonThread thread3= new DaemonThread();
		
		//making thread2 as a daemon thread
		thread2.setDaemon(true);
		
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}
