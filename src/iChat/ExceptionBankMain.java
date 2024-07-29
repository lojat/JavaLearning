package ichat;
//
//Imagine you are designing a simple banking system. Write a Java program that simulates a bank account. Implement the following:
//
//Task 1: Create a custom exception, InsufficientFundsException, that is thrown when an attempt is made to withdraw more money than the account balance.
//Task 2: Implement a method void performTransaction(double amount) that allows both deposits and withdrawals. If a withdrawal exceeds the 
//account balance, throw the InsufficientFundsException and ensure the transaction is rolled back, leaving the account balance unchanged.
//Task 3: Demonstrate the usage of your program with multiple transactions, including scenarios where exceptions are thrown and caught.


//custom exception, InsufficientFundsException, that is thrown when an attempt is made to withdraw more money than the account balance.
class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}

//account class
class Account{
	private double balance;
	
	//constructor to initialize balance
	public Account(double balance) {
		this.balance=balance;
	}
	
	//method to get balance
	public double getBalance() {
		return balance;
	}
	
	//method for deposit 
	private void deposite(double amount) {
		if(amount<=0) {
			throw new IllegalArgumentException("amount should we greater then 0 ");
		}else {
			balance+=amount;
		}
	}
	
	// method for withdraw
	private void withdraw(double amount) throws InsufficientFundsException {
		
		if(amount<=0) {
			throw new IllegalArgumentException("Amount Should we greater then 0");
		}
		else if(amount>balance){
			throw new InsufficientFundsException("Amount is greater then balance");
		}else {
			balance-=amount;
		}
	}
	
//	 method void performTransaction(double amount) that allows both deposits and withdrawals. If a withdrawal exceeds the 
	//account balance, throw the InsufficientFundsException and ensure the transaction is rolled back, leaving the account balance unchanged.
	public void performTransaction(double amount) throws InsufficientFundsException {

		try {
			if(amount>0) {
				deposite(amount);
				System.out.println("deposite amount: "+amount);
			}else {
				withdraw(-amount);
				System.out.println("Withdraw amount: "+(-amount));
			}
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}catch(InsufficientFundsException e) {
			System.out.println(e);
		}
		
	}
	
	
}

//main class
public class ExceptionBankMain {

	public static void main(String[] args) throws InsufficientFundsException {
		 Account acc = new Account(500);
		 
		 //Demonstrate the usage of your program with multiple transactions
		 acc.performTransaction(300);
		 acc.performTransaction(1000);
		 acc.performTransaction(-1500);
		 acc.performTransaction(0);
		 acc.performTransaction(2000);
		 acc.performTransaction(-9000);
		 
		 System.out.println("Balance: "+acc.getBalance());
	}

}
