package multithreading1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//callable interface is way to get multithreading with return
class myCallable implements Callable{

	int num;
	
	public myCallable(int num){
		this.num=num;
	}
	
	@Override
	public Object call() throws Exception {
		int res=0;
		
		for(int i=1;i<num;i++) {
			System.out.println(res+" "+Thread.currentThread().getName());
			res+=i;
		}
		
		return res;
	}
	
}

public class CallableMain {

	public static void main(String[] args) throws InterruptedException{
		
		myCallable[] arr= {
			new myCallable(10),	
			new myCallable(9),
			new myCallable(22),
			new myCallable(67),
			new myCallable(34),
			new myCallable(0),
			new myCallable(1),
			new myCallable(90),
		};
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		for(myCallable num:arr) {
			Future f= service.submit(num);
			
			try {
				System.out.println("sum of "+num.toString()+": "+f.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		service.shutdown();

	}

}
