package tasks;
 
class Appliance {

	private String brand;
	private String powerConp;
	
	public void display() {
		System.out.println("Brand= "+brand+" Power Consumption= "+powerConp);
	}
	
	public void powerOn() {
		System.out.println("Power On");
	}
	
	public void powerOff() {
		System.out.println("Power Off");
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPowerConp() {
		return powerConp;
	}

	public void setPowerConp(String powerConp) {
		this.powerConp = powerConp;
	}
	
}

class Refrigerator extends Appliance{

	private int cap; //capacity

	public int setCap(int cap) {
		return this.cap=cap;
	}
	
	public void display() {
		super.display();
		System.out.println("Temperature= "+cap);
	}
}

class Oven extends Appliance {
	
	private int maxTemp;//maximumTemprature
	
	public int setCap(int mt) {
		return this.maxTemp=mt;
	}
	
	public void display() {
		super.display();
		System.out.println("Temperature= "+maxTemp);
	}
}


public class Q03HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Refrigerator r1= new Refrigerator();
		
		r1.setBrand("Sony");
		r1.setPowerConp("HIgh");
		r1.setCap(8);
		
		r1.display();
		
		Oven v1= new Oven();
		
		v1.setBrand("LG");
		v1.setPowerConp("Low");
		v1.setCap(6);
		
		v1.display();
		
	}

}
