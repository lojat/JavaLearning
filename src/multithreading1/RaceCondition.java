package multithreading1;

/*RACE CONDITION OBJECT LAVEL
 	race condition are multi-threading condition in which
 	two or more thread try to access similar resource
 	and this is give unexpected output
 	
 	   Expected Output:- Welcome Lokesh
 	   					welcome Ashish
 	
 */


// Common class with function fun
class Common{
	public void fun(String name) {
		System.out.println("Welcome ");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(name);
	}
}

//thread01 class that extend class thread and calling fun method of common class
class Thread01 extends Thread{
	
	Common common;
	String name;
	
	public Thread01(Common common,String name) {
		this.common=common;
		this.name=name;
	}
	
	@Override
	public void run() {
		common.fun(name);
	}
}

//thread02 class extend thread class and also calling fun method in run method 
class Thread02 extends Thread{
	
	Common common;
	String name;
	
	public Thread02(Common common, String name) {
		this.common=common;
		this.name=name;
	}
	
	@Override 
	public void run() {
		common.fun(name);
	}
}

public class RaceCondition {

	public static void main(String[] args) {
		
		Common common= new Common();
		
		Thread01 thread01 = new Thread01(common, "Lokesh");
		Thread02 thread02 = new Thread02(common,"Ashish");
	
		thread01.start();
		thread02.start();
		
	}

}
