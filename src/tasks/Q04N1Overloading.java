package tasks;


class BankAccount{

	private double amount=0;
	
	//Deposit a fixed amount of money into the account.
	public void deposit(int i) {
		 
		amount += i;
		
	}

	//Deposit a variable amount of money into the account, with an 
	//optional description of the transaction.
	public void deposit(int i, String string) {
		 
		amount += i;
		System.out.println("Deposited 50.0 "+string);
		
	}

	//Deposit money into the account from another account, with
	//the account number and amount to transfer.
	public void deposit(BankAccount account, int i) {
		 
		amount += account.getAmount()-i;
		account.setAmount(i);
		System.out.println("Transferred 50.0 from "+account);
		
	}

	// Debit transfer amount from account
	private void setAmount(int i) {
		 
		amount -= i;
		
	}

	//get balance in account 
	public double getAmount() {
		return amount;
	}
	
	 
	
}

public class Q04N1Overloading {

	public static void main(String[] args) {
		
		//Create Obj of bankAccount
		BankAccount account1 = new BankAccount();
		//Deposit $100 in account 01
		account1.deposit(100);	
		
		//Deposit salary $50 in account 01
		account1.deposit(50,"Salary");
		
		//Create second Obj of bankAccount
		BankAccount account2 = new BankAccount();
		//Create third Obj of bankAccount
		BankAccount account3 = new BankAccount(); 
		//Deposit $100 in Account 2
		account2.deposit(100); 
		//Transfer $100 from account2 to account3
		account3.deposit(account2, 50);
		
		//Displaying balance in all accounts
		System.out.println("\nBalance: "+"\naccount1: "+account1.getAmount()+"\naccount2: "+account2.getAmount()+"\naccount3: "+account3.getAmount());
	}

}
