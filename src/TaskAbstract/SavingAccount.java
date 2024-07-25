package taskabstract;

public class SavingAccount extends BankAccount{

	int amount= 2000;
	@Override
	void calculateInterest() {
		
		int interest = (amount*7)/100;	
		System.out.println("Saving Amount = "+amount+" Interset on amount= "+interest);
		
	}

}
