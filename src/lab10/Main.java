package lab10;

public class Main {
	public static void main(String[] args) {

		// create common class object and names and pass in both threads
		Common common = new Common();
		String name1 = "Akash", name2 = "Ashish";

		// create both threads class object and with parameters
		ThreadA threadA = new ThreadA(common, name1);
		ThreadB threadb = new ThreadB(common, name2);

		// calling start methods
		threadA.start();
		threadb.start();
	}
}
