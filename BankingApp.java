/*Develop a Banking Application using Custom Exception
  - Insufficient Fund when Amount is not available to withdraw.
 */
package com.exe;

//Custom exception class for handling insufficient balance
class InsufficientBalanceException extends Exception {

	String msg;

	public InsufficientBalanceException(String msg) {
		super(msg);
		this.msg = msg;
	}

}

//class declaration
public class BankingApp {
	int balance;// Stores the current balance
	int accountNo;// Stores the account number
	// Constructor to initialize balance and account number

	public BankingApp(int balance, int accountNo) {
		super();
		this.balance = balance;
		this.accountNo = accountNo;
	}

	// Method to deposit money into the account
	void deposit(int amt) {
		balance += amt;
		System.out.println("Balance=" + balance);
	}

	// Method to withdraw money from the account
	void withdraw(int amt) throws InsufficientBalanceException {
		// Check if there is sufficient balance to withdraw including a minimum balance
		// of 1000
		if (balance >= amt + 1000) {
			balance -= amt;
			System.out.println("Amount withdrawn sucessfully " + amt + "\nNew Balance=" + balance);
		} else
			// Throw exception if there is insufficient balance
			throw new InsufficientBalanceException("Insufficient balance");
	}
	// main method

	public static void main(String[] args) {
		// Create an instance of BankingApp

		BankingApp banking = new BankingApp(30000, 129845);
		// Deposit 5000 into the account
		banking.deposit(5000);

		try {
			// Attempt to withdraw 35000 from the account
			banking.withdraw(35000);
		} catch (InsufficientBalanceException e) {
			// Catch the InsufficientBalanceException and print the error message
			System.out.println(e);

		}

	}

}
