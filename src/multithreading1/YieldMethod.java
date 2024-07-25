package multithreading1;

//yield method sleep the current thread for some millisecond 
class Thread81 extends Thread{

	@Override
	public void run(){
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+ i);
			Thread.yield();
		}
		System.out.println(Thread.currentThread().getName()+": End!");
	}
	
}

public class YieldMethod {

	public static void main(String[] args) {
		
		Thread81 thread1 = new Thread81();
		Thread81 thread2 = new Thread81();
		Thread81 thread3 = new Thread81();
		
		thread2.setName("two");
		
//		System.out.println(thread1.getPriority()+" "+thread2.getPriority()+" "+thread3.getPriority());

		thread1.start();
		thread2.start();
		thread3.start();
		
		for(int i=0;i<10;i++)
		System.out.println("main");
	}

}
