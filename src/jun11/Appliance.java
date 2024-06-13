package jun11;

public class Appliance {

	private String brandName;
	private int price;
	
	
	public void mainFunction() {
		System.out.println("Appliance amke life easy");
	}
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int i) {
		this.price = i;
	}
	
	public Appliance(String brandName, int price) {
		super();
		this.brandName = brandName;
		this.price = price;
	}
	
	public Appliance() {};
	
	
	public String toString() {
		return "Appliance [ brandName= "+brandName+" ,price= "+price+" ]";
	}
	
	
}
