package tasks;
//
//Create a class Vehicle with a private method startEngine().
//Now, design a subclass Car inheriting from Vehicle.
//Try overriding the startEngine() method in Car with public access.
//Compile your code and observe the error. Discuss why overriding with a less restrictive access modifier (private to public) is not allowed.

//Create a class Vehicle
class Vehicle{
////	private method startEngine() we can not override private method in subclass
//	 private void startEngine() {
//		System.out.println("Private method From Base Class");
//	}
	 //public method startEngine()
	 public void startEngine() {
		 System.out.println("Public method From Base class");
	 }
}

//subclass Car inheriting from Vehicle
class Car extends Vehicle {
	@Override
	public void startEngine() {
		// calling base class method startEngine
		super.startEngine();
		System.out.println("From Chield Class");
	}
}

public class Q05N3Overriding {

	public static void main(String[] args) {
		//creating object of subclass
		Car car = new Car();
		//calling override method 
		car.startEngine();
	}

}
