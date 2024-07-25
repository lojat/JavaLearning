package multithreading;

class Thread1 implements Runnable{

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		
//		if(tName=="second") {
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		for(int i=0;i<10;i++)
			System.out.println(tName+ " ");
	}
 
}

public class PriorityAndSetGetName {
	public static void main(String[] args) {
	
		Thread1 t1= new Thread1();
		Thread x = new Thread(t1);
		Thread y = new Thread(t1);

		//getting default name and priority of threads
		System.out.println("Thread 1 Name: "+x.getName()+"Prioriy :"+x.getPriority());
		System.out.println("Thread 1 Name: "+x.getName()+"Prioriy :"+x.getPriority());
		
		//setting name to threads
		x.setName("First");
		y.setName("second");
		
		//setting priority
		x.setPriority(5);
		y.setPriority(5);
		
//		//it will delay all threads
//		try {
//			x.sleep(30000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//starting threads
		x.start();
		
		try {
			x.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		y.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("inside main thread....");
			System.out.println(i+ " main");
		}
		
	}
}
