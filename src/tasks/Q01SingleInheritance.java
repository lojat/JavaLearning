package tasks;
 
class Device {
	
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


class Smartphone extends Device{

	private String operatingSystem;
	private String cameraResolution;
	
	public void display() {
		System.out.println("SmartPhone Specification BrandName= "+super.getBrand()+" Model= "+super.getModel()+" Operating System= "+operatingSystem+"Camera Resolution= "+cameraResolution);
	}
	
	public void takePhoto(boolean i) {
		if(i)
			System.out.println("Photo taken");
		else
			System.out.println("Error");
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getCameraResolution() {
		return cameraResolution;
	}

	public void setCameraResolution(String cameraResolution) {
		this.cameraResolution = cameraResolution;
	}
	
	
}



public class Q01SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//creating object of derived class
		Smartphone s1= new Smartphone();
		
		//setting data by derived class object
		s1.setBrand("Sony");
		s1.setCameraResolution("32MPx");
		s1.setModel("S23");
		s1.setOperatingSystem("G49000");
		
		//accessing methods by derived class objects
		s1.display();
		s1.takePhoto(true);
		s1.status(false);
		
		
	}

}
