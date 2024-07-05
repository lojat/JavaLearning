package tasks;
 
//Create a base class Animal with a method makeSound() that simply prints "Generic Animal Sound".
//Now, create subclasses like Dog, Cat, and Cow that inherit from Animal.
//Override the makeSound() method in each subclass to print their specific sounds (e.g., "Woof" for Dog, "Meow" for Cat, "Moo" for Cow).
//In your main method, create objects of each subclass and call their makeSound() method. Observe the output.
 

//Create a base class Animal
class Animal{
//	method makeSound() that simply prints "Generic Animal Sound"
	 void makeSound(){
		 System.out.println("Generic Animal Sound");
	 }
}

//create subclasses
class Dog extends Animal{

	//Override the makeSound() method
	@Override
	void makeSound() {
		System.out.println("Dog: Woof");
	}
	
}

class Cat extends Animal{

	//Override the makeSound() method
	@Override
	void makeSound() {
		System.out.println("Cat: Meow");
	}
	
}

class Cow extends Animal{

	//Override the makeSound() method
	@Override
	void makeSound() {
		System.out.println("Cow: Moo");
	}
	
}

public class Q05N1Overriding {

	public static void main(String[] args) {
		 
		Animal animal = new Animal();
//		create objects of each subclass
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		
		animal.makeSound();
//		call their makeSound() method
		dog.makeSound();
		cat.makeSound();
		cow.makeSound();

	}

}
