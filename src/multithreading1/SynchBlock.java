package multithreading1;


// class with synchronized block
class Common5{
	
	public void fun(String name) {
		
		
//		System.out.println(" Asych "+Thread.currentThread().getName()+" "+ name );
		
		//sychronized block with object level log 
		synchronized(this) {
			try {
				System.out.print("Welcome: ");
				Thread.sleep(3000);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(name+" "+ Thread.currentThread());
		}
		
		//synchronized block with class level log
////		synchronized(Common5.class) {
//			try {
//				System.out.println("Go: ");
//				Thread.sleep(3000);
//			}catch(Exception e) {
//				System.out.println(e);
//			}
//		}

	}
	
}

//new Thread class inherit Thread class
class Thread31 extends Thread{
	
	Common5 common;
	String name;
	
	public Thread31(Common5 common,String name){
		this.name= name;
		this.common = common;
	}
	
	@Override
	public void run(){
		common.fun(name);
	}
	
}


//new Thread class inherit Thread class
class Thread32 extends Thread{
	
	Common5 common;
	String name;
	
	public Thread32(Common5 common,String name){
		this.name= name;
		this.common = common;
	}
	
	@Override
	public void run(){
		common.fun(name);
	}
	
}

public class SynchBlock {

	public static void main(String[] args) {
		
		//common object
		Common5 common = new Common5();
		
		Thread31 thread1= new Thread31(common,"lokesh");
		Thread32 thread2= new Thread32(common,"Akash");
		
		thread1.start();
		thread2.start();
		
		System.out.println("Main End!");

	}

}
