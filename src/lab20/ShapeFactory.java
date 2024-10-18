package lab20;

public class ShapeFactory {
	
	// method to return corresponding class object depend on shape 
	public Shape createShape(String shape) {
		
		if(shape.strip().equalsIgnoreCase("circle")) 
			return new Circle();
		
		else if(shape.strip().equalsIgnoreCase("square"))
			return new Square();
		
		else if(shape.strip().equalsIgnoreCase("triangle"))
			return new Triangle();
		
		else
			return null;
		
	}
	
}
