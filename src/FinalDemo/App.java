package finalDemo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating objects
		Bike bike = new Bike();
		Yamaha yamaha = new Yamaha();
		
		//calling methods
		yamaha.stop();
		
		bike.run();
		System.out.println("Speed ="+bike.speed);
		System.out.println("Brand ="+bike.brand);
		bike.stop();
		
	}

}
