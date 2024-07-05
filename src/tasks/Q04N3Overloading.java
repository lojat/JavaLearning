package tasks;

//Create a Shape class with a method calculateArea() that takes different parameters to calculate the area of different shapes.
//Calculate the area of a rectangle with length and width as parameters.
//Calculate the area of a circle with radius as a parameter.
//Calculate the area of a triangle with base and height as parameters.
//Expected Output:
//Shape.calculateArea(5, 3) should return 15.0 (area of rectangle)
//Shape.calculateArea(4) should return 16.0 (area of circle)
//Shape.calculateArea(3, 4) should return 6.0 (area of triangle)

class Shape {
	// Calculate Area of Rectangular length*width
	static public double calculateArea(int a, int b) {
		double res = a * b;
		return res;
	}

	// Calculate Area of circle pi*radius^2
	static public double calculateArea(int a) {
		double res = 3.14 * a * a;
		return res;
	}

	// Calculate Area of circle (base*height)/2
	static public double calculateArea(double a, int b) {
		double res = (a * b)/2;
		return res;
	}

}

public class Q04N3Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Shape.calculateArea(5, 3) should return 15.0 (area of rectangle)
		System.out.println(Shape.calculateArea(5, 3));
		//Shape.calculateArea(4) should return 50.24 (area of circle)
		System.out.println(Shape.calculateArea(4));
		//Shape.calculateArea(3, 4) should return 6.0 (area of triangle)
		System.out.println(Shape.calculateArea(3.0, 4));
	}

}
