package multithreading1;

//Thread class 
class Newthread implements Runnable{
	static int count=0;
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			count++;
			System.out.println(count+" "+Thread.currentThread().getName());
		}
	}
}

public class MultiThreadSingleObject {

	public static void main(String[] args) {

		//creating object for new thread class and running two thread on same objects
		Newthread threadA = new Newthread();
		Thread thread1 = new Thread(threadA);
		Thread thread2 = new  Thread(threadA);
		
		thread1.setName("Thread1");
		thread2.setName("Thread2");
		
		thread1.start();
		thread2.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println(i+ " "+Thread.currentThread().getName());
		}

	}

}
