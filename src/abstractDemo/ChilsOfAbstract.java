package abstractDemo;

public class ChilsOfAbstract extends DemoAbstract {

	@Override
	public void saveCustomerDetails() {
		 System.out.println("From Save Customer Details Abstrac method");
		
	}
 
	@Override
	public void takeLoan() {
		System.out.println("From StakeLoan Abstrac method");
	}
}
