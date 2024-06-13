package TaskSingleInheri;

public class Device {
	
	private String brand;
	private String model;
	
	public void display() {
		System.out.println("Device BrandName= "+brand+" Model= "+model);
	}
	
	public void status(boolean i) {
		if(i) 
			System.out.println("Device is on");
		else
			System.out.println("Device is off");
		
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public Device() {};
	
	public Device(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Device [brand=" + brand + ", model=" + model + "]";
	}
	
	

}
