package tasks;
 //
//Design a base class Shape with an abstract method calculateArea() that should return the area (but its implementation remains empty).
//Create subclasses like Square and Circle extending Shape.
//Implement the calculateArea() method in each subclass with the specific area calculation formulas (area of square = side * side, area of circle = pi * radius * radius).
//In your main method, create objects of Square and Circle and call their respective calculateArea() methods. Print the resulting areas
 
//Design a base class  
abstract class Shape{
//	abstract method return the area
	abstract double calculateArea(); 
}

//Create subclass Square
class Square extends Shape {

	int h=0,b=0;
	
	public Square(int h,int b){
		this.h=h;
		this.b=b;
	}
	
	//Implement the calculateArea() area of square = side * side
	@Override
	double calculateArea() {
		double res=0;
		res=h*b;
		return res;
	}
	
}

//Create subclass Circle
class Circle extends Shape {

	int r=0;
	
	public Circle(int r){
		this.r=r;
	}
	
	//Implement the calculateArea() circle = pi * radius * radius
	@Override
	double calculateArea() {
		double res=0;
		res=3.14*r*r;
		return res;
	}
	
}


public class Q05N2Overriding {

	public static void main(String[] args) {
		
//		objects of Square and Circle 
		Square square = new Square(5,9);
		Circle circle = new Circle(4);
		
//		call their respective calculateArea() methods
		System.out.println(square.calculateArea());
		System.out.println(circle.calculateArea());
	}

}
