package FinalDemo;

public final class Bike {
	
	final String brand ="Jawa";
	final int speed = 100;
	
//	speed=200; we cannot change final variable value 
	
	// be cannot override final method  
	final void run() {
		System.out.println("Bike is running");
	}
	
	void stop() {
		System.out.println("Bike stop");
	}
}
