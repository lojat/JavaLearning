package multithreading1;

//we can implement multithreading in two ways by using 
//thread class and by using runnable interface.

//by thread class internally thread class implement class runnable class
//and override run method
class ThreadA extends Thread{
	@Override
	public void run() {
		for(int i=100;i<=110;i++) {
			System.out.println(i+" from Thread Class Example");
		}
		System.out.println("!end ThreadA");
	}
}

//by runnable interface
class ThreadB implements Runnable{

	@Override
	public void run() {
		for(int i=200;i<=210;i++) {
			System.out.println(i+" from Runnable interface Example");
		}
		System.out.println("!end Threadb");
	}
	
}

public class ImplementationWays {

	public static void main(String[] args) {
		 
		ThreadA threadA = new ThreadA();
		
		ThreadB threadB = new ThreadB();
		Thread	thread = new Thread(threadB);//to run runnable thread object its required to pass object in Thread constructor

		threadA.start();
		thread.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println(i+" From main thread");
		}
		System.out.println("!end Main");
	}

}
