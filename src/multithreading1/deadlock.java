package multithreading1;


//deadlock id condition where two or more threads waiting for log or threads without log is a deadlock

class A{
	synchronized public void funA(B b1) {
		System.out.println("FunA");
		b1.fun2();
		System.out.println("FunA End!");
	}
	
	public synchronized void fun1() {
		System.out.println("Fun1");
	}
}

class B{
	public synchronized void funB(A a1) {
		System.out.println("FunB");
		a1.fun1();
		System.out.println("FunB End!");
	}
	
	public synchronized void fun2() {
		System.out.println("Fun2");
	}
}

class Thread61 extends Thread{
	A a1;
	B b1;
	
	public Thread61(A a1,B b1) {
		this.a1=a1;
		this.b1=b1;
	}
	
	@Override
	public void run() {
		a1.funA(b1);
	}
}

class Thread62 extends Thread{
	A a1;
	B b1;
	
	public Thread62(A a1,B b1) {
		this.a1=a1;
		this.b1=b1;
	}
	
	@Override
	public void run() {
		b1.funB(a1);
	}
}


public class deadlock {

	public static void main(String[] args) {
		
		A a1= new A();
		B b1= new B();
		
		Thread61 thread1 = new Thread61(a1,b1);
		Thread62 thread2= new Thread62(a1,b1);
		
		thread1.start();
		thread2.start();
		
		System.out.println("Main");

	}

}
