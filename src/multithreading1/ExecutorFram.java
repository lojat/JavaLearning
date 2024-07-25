package multithreading1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Class to find given number even or not with multi thread
class Even extends Thread{
	int num;
	
	public Even(int num) {
		this.num=num;
	}
	
	@Override
	public void run() {
		synchronized(this) {
			if(num%2==0)
				System.out.println(num+": Even");
			else
				System.out.println(num+": Not Even");
			
			for(int i=0;i<5;i++)
				System.out.println(num+" & "+Thread.currentThread().getName());
		}
	}
}

public class ExecutorFram {

	public static void main(String[] args) {
		 
		Even arr[] = {
				new Even(5),
				new Even(89),
				new Even(90),
				new Even(1),
				new Even(24),
				new Even(0)
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(Even num : arr) {
			service.submit(num);
		}
		
		service.shutdown();

	}

}
