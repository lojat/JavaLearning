package multithreading1;

/*
  Race Condition Class level when two different thread with different  object work on same resource then also 
  we get irregular output
  Expected Output:- Welcome Lokesh
  					Welcome Ashish
 */

//Common class with function fun
class Common03{
	synchronized public void fun(String name) {
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
class Thread10 extends Thread{
	
	Common03 common;
	String name;
	
	public Thread10(Common03 common,String name) {
		this.common=common;
		this.name=name;
	}
	
	@Override
	public void run() {
		common.fun(name);
	}
}

//thread02 class extend thread class and also calling fun method in run method 
class Thread11 extends Thread{
	
	Common03 common;
	String name;
	
	public Thread11(Common03 common, String name) {
		this.common=common;
		this.name=name;
	}
	
	@Override 
	public void run() {
		common.fun(name);
	}
}

public class RaceConditionClassLevel {

	public static void main(String[] args) {
		
		Common03 common1= new Common03();
		Common03 common2= new Common03();
		
		Thread10 thread01 = new Thread10(common1, "Lokesh");
		Thread11 thread02 = new Thread11(common2,"Ashish");
	
		thread01.start();
		thread02.start();
		
	}

}
 