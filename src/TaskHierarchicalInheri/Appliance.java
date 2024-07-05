package taskHierarchicalInheri;

public class Appliance {

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
