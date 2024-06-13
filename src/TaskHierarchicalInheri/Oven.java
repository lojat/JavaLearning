package TaskHierarchicalInheri;

public class Oven extends Appliance {
	
	private int maxTemp;//maximumTemprature
	
	public int setCap(int mt) {
		return this.maxTemp=mt;
	}
	
	public void display() {
		display();
		System.out.println("Temperature= "+maxTemp);
	}
}
