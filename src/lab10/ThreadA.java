package lab10;

//ThreadA extending the Thread class
public class ThreadA extends Thread{
	
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
