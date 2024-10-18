package lab20;


public class FactoryMain {

	public static void main(String[] args) {
		 
		ShapeFactory factory = new ShapeFactory();
		
		Shape s1 = factory.createShape("circle");// calling create shape method to get circle object
		Shape s2 = factory.createShape("triangle");// calling create shape method to get triangle object
		Shape s3 = factory.createShape("square");// calling create shape method to get square object
		
		// calling draw method
		s1.draw();
		s2.draw();
		s3.draw();
		

	}

}
