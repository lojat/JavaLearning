package multithreading1;

//Inter Thread Communication Example

//Thread class
class Thread41 extends Thread{
	int sum;
	int n;
	
	public Thread41(int n){
		this.n=n;
		this.sum=0;
	}
	
	@Override
	public void run() {
		//synchronized block to calculate sum of n numbers 
		synchronized(this) {
			for(int i=0;i<n;i++)
				sum+=i;
			System.out.println("Notify other thread: ");
			this.notify();// notify all threads  
		}
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		 
		int n=25;
		
		Thread41 thread = new Thread41(n);
		thread.start();
		
		synchronized(thread) {
			System.out.println("main thread call wait: ");
			
			try {
				thread.wait();// wait till other thread notify
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("sum of "+n+" numbers:"+thread.sum);
		}
	}

}
