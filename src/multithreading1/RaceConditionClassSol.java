package multithreading1;

//The solution of Race condition class level make method
//static synchronized 

//Common class with function fun
class Common04{
	static synchronized public void fun(String name) {
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
class Thread21 extends Thread{
	
	Common04 common;
	String name;
	
	public Thread21(Common04 common,String name) {
		this.common=common;
		this.name=name;
	}
	
	@Override
	public void run() {
		Common04.fun(name);
	}
}

//thread02 class extend thread class and also calling fun method in run method 
class Thread22 extends Thread{
	
	Common04 common;
	String name;
	
	public Thread22(Common04 common, String name) {
		this.common=common;
		this.name=name;
	}
	
	@Override 
	public void run() {
		Common04.fun(name);
	}
}

public class RaceConditionClassSol {

	public static void main(String[] args) {
		
		Common04 common1= new Common04();
		Common04 common2= new Common04();
		
		Thread21 thread21 = new Thread21(common1, "Lokesh");
		Thread22 thread22 = new Thread22(common2,"Ashish");
	
		thread21.start();
		thread22.start();
		
	}

} 