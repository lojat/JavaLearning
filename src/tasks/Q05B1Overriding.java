package tasks;
//
//Create an interface Drawable with a  interface Drawable.
//Design classes Shape (from Problem 2) and Text that implement the Drawable interface.
//Override the draw() method in each class to define how the shape or text would be drawn (e.g., print specific characters for shapes, display the text).
//In your main method, create objects of Shape and Text and call their draw() methods through the Drawable interface reference.

//interface Drawable
interface Drawable{
//	 interface Drawable
	void draw();
}

//subCalss Shape
class Shape1 implements Drawable{
	// Override method 
	@Override
	public void draw() {
		System.out.println("Shape");
	}
	
}
//subCalss Text
class Text implements Drawable{

	// Override method 
	@Override
	public void draw() {
		System.out.println("Text");	
	}
	
}

public class Q05B1Overriding {

	public static void main(String[] args) {
		// obj of Shape and Text Class
		Shape1 shape = new Shape1();
		Text text = new Text();
		
		//calling draw method by respective objects
		shape.draw();
		text.draw();
	}

}
