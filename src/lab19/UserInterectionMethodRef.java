package lab19;

public class UserInterectionMethodRef {

	private int num;
	
	// method to set nym
	public void setInt(int num) {
		this.num = num;
	}
	
	// method to get num
	public int getInt() {
		return num;
	}
	
	//method to perform square with method reference
	public int square(int num) {
	
		MethodRefInterface obj = MethodRefClass::methodRef;// getting method ref in interface object
	
		int res = obj.square(num);// calling interface method
	
		return res;
	}
	
}
