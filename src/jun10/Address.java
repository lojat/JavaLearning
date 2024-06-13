package jun10;

public class Address {
	
	private String city;
	private String dist;
	private String state;
	private int pin;
	
	public Address() {};
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Address(String city, String dist, String state, int pin) {
		super();
		this.city = city;
		this.dist = dist;
		this.state = state;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", dist=" + dist + ", state=" + state + ", pin=" + pin + "]";
	}
	
	
	
}
