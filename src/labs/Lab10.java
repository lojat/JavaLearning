package labs;

//create a common class  in which there is fun1() this is taking a parameter of String name and  printing welcome and after this fun1() will Thread.sleep(3000) 
//and in the last this will print the name  
//
//there are two class which are same ThreadA and ThreadB extending the Thread class 
//
//these class  have parameter of common  c and String s  and run method this method is calling fun1 of  common class and this is passing 
//as parameter string s  in fun1 
//
//now create a common class and pass into these thread class  and call start() method  on both thread and observe the output 
//

class Common {

	// fun1() this is taking a parameter of String name and printing welcome and
	// after this fun1() will Thread.sleep(3000)
	// and in the last this will print the name
	public void fun1(String name) {
		System.out.print("Welcome ");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(name);
	}
}

// ThreadA extending the Thread class
class ThreadA extends Thread {
	
	Common common;
	String s;

	public ThreadA(Common common, String s) {
		this.common = common;
		this.s = s;
	}

	// run method this method is calling fun1 of common class and this is passing
	// as parameter string s in fun1

	@Override
	public void run() {
		common.fun1(s);
	}
}

// ThreadB extending the Thread class
class ThreadB extends Thread {
	
	Common common;
	String s;

	public ThreadB(Common common, String s) {
		this.common = common;
		this.s = s;
	}

	// run method this method is calling fun1 of common class and this is passing
	// as parameter string s in fun1

	@Override
	public void run() {
		common.fun1(s);
	}
}

public class Lab10 {

	public static void main(String[] args) {
		
		// create common class object and names and pass in both threads
		Common common = new Common();
		String name1 = "Akash", name2 = "Ashish";

		//create both threads class object and with parameters 
		ThreadA threadA = new ThreadA(common, name1);
		ThreadB threadb = new ThreadB(common, name2);

		//calling start methods
		threadA.start();
		threadb.start();

	}

}


/* Observation: In the above code the we run ThreadA and ThreadB  */ 