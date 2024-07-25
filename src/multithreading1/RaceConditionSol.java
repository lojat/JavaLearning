package multithreading1;

/*the solution of race problem object level make method Synchronized

	Expected output- Welcome Lokesh
					welcome Ashish

*/

//Common class with function fun
class Common1{
	synchronized public void fun(String name) {
		System.out.print("Welcome ");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(name);
	}
}

//thread01 class that extend class thread and calling fun method of common class
class Thread001 extends Thread{
	
	Common1 common;
	String name;
	
	public Thread001(Common1 common,String name) {
		this.common=common;
		this.name=name;
	}
	
	@Override
	public void run() {
		common.fun(name);
	}
}

//thread02 class extend thread class and also calling fun method in run method 
class Thread002 extends Thread{
	
	Common1 common;
	String name;
	
	public Thread002(Common1 common, String name) {
		this.common=common;
		this.name=name;
	}
	
	@Override 
	public void run() {
		common.fun(name);
	}
}

public class RaceConditionSol {

	public static void main(String[] args) {
		
		Common1 common= new Common1();
		
		Thread001 thread01 = new Thread001(common, "Lokesh");
		Thread002 thread02 = new Thread002(common,"Ashish");
	
		thread01.start();
		thread02.start();
		
	}

}
 