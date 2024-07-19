package multiThreading;


//class with inherit Thread class
class ThreadA extends Thread{
	//override run method
	public void run(){
		for(int i=1;i<=10;i++) {
			System.out.println("Thraed A: "+i);
		}
		System.out.println("Thread A End!");
	}
}

class ThreadB extends Thread{
	public void run(){
		for(int i=21;i<=30;i++) {
			System.out.println("Thraed B: "+i);
		}
		System.out.println("Thread B End!");
	}
}

class ThreadC extends Thread{
	public void run(){
		for(int i=31;i<=40;i++) {
			System.out.println("Thraed C: "+i);
		}
		System.out.println("Thread C End!");
	}
}


public class App {

	public static void main(String[] args) {
		
		ThreadA  threadA =new ThreadA();
		ThreadB  threadB =new ThreadB();
		ThreadC  threadC =new ThreadC();
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		for(int i=101;i<110;i++) {
			System.out.println("Main :"+i);
		}
		System.out.println("Main End!");
	}

}
