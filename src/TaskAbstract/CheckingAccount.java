package taskAbstract;

public class CheckingAccount extends BankAccount {

	int amount =1000;
	
	@Override
	void calculateInterest() {
		 
		int interest = (amount*10)/100;	
		System.out.println("Checking Amount = "+amount+" Interset on amount= "+interest);
		
	}

}
