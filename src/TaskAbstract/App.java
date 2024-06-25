package TaskAbstract;

public class App {

	public static void main(String[] args) {
	 
		SavingAccount s = new SavingAccount();
		
		CheckingAccount c = new CheckingAccount();
		
		s.calculateInterest();
		c.calculateInterest();

	}

}
