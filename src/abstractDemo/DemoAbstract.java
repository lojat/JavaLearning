package abstractdemo;

//abstract class
public abstract class DemoAbstract {

	//abstract Method
	public abstract void saveCustomerDetails();
	
	//concrete/non-abstract method
	public void backLogo() {
		System.out.println("Abstract class");
	}
	
	public abstract void takeLoan();
	
	public DemoAbstract() {
		this(100);
		System.out.println("abstract class default Constructor");
	}

	public DemoAbstract(int i) {
		 System.out.println("speed is: "+i);
	}
}
