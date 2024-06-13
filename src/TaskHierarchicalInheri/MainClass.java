package TaskHierarchicalInheri;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Refrigerator r1= new Refrigerator();
		
		r1.setBrand("Sony");
		r1.setPowerConp("HIgh");
		r1.setCap(8);
		
		r1.display();
		
		Oven v1= new Oven();
		
		v1.setBrand("Sony");
		v1.setPowerConp("HIgh");
		v1.setCap(8);
		
		v1.display();

	}

}
