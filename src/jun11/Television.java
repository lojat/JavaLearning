package jun11;

public class Television extends Appliance{
	
	private String loudness;
	private int size;
	
	public void changeChannel() {
		System.out.println("Channel Changed ");
	}
	
	public String getLoudness() {
		return loudness;
	}
	public void setLoudness(String loudness) {
		this.loudness = loudness;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public Television() {};
	
	public Television(String loudness, int size) {
		this.loudness = loudness;
		this.size = size;
	}
	public Television(String brandName, int price, String loudness, int size) {
		super(brandName, price);
		this.loudness = loudness;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Television [loudness=" + loudness + ", size=" + size + ", getBrandName()=" + getBrandName()
				+ ", getPrice()=" + getPrice() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
	

}
