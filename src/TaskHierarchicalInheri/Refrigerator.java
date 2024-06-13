package TaskHierarchicalInheri;

public class Refrigerator extends Appliance{

	private int cap; //capacity

	public int setCap(int cap) {
		return this.cap=cap;
	}
	
	public void display() {
		super.display();
		System.out.println("Temperature= "+cap);
	}
}
