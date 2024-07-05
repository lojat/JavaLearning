package tasks;
//
//Create an abstract class Vehicle with an abstract method drive() and two concrete subclasses Car and Motorcycle that implement the drive() method.
//
//Constraints:
//Define the Vehicle class with an abstract drive() method.
//Define the Car and Motorcycle classes as concrete subclasses of Vehicle.
//Implement the drive() method in Car and Motorcycle to provide specific driving instructions.

//abstract class Vehicle
abstract class Vehicle1{
//	abstract method
	abstract void drive();
}

//concrete subclass of Vehicle
class   Car1 extends Vehicle1{
	//Implement the drive() method
	void drive() {
		System.out.println("You need four wheel driving licence to drive a car");
	}
}

//concrete subclass of Vehicle
class Motorcycle1 extends Vehicle1{
	//Implement the drive() method
	@Override
	void drive() {
		System.out.println("You need two wheel driving licence to drive  a motorcycle");
	}
	
}

public class Q06Abstraction {

	public static void main(String[] args) {
		//obj of concrete classes
		Car1 car = new Car1();
		Motorcycle1 motorcycle = new Motorcycle1();
		
		//calling override method 
		car.drive();
		motorcycle.drive();
	}

}
