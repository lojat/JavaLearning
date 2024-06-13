package TaskSingleInheri;

public class Smartphone extends Device{

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
