package abstractDemo;

public class App {

	public static void main(String[] args) {
		 
		ChilsOfAbstract coa = new ChilsOfAbstract();
		
		ChildOfInterface coi = new ChildOfInterface();
		
		coa.saveCustomerDetails();
		coa.takeLoan();
		
		coi.updateCustomer();
//		coi.showCustomer();
		DemoInterface.showCustomer();

	}

}
