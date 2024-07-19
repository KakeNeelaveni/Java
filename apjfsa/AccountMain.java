package com.apjfsa;

public class AccountMain {

	
	    public static void main(String[] args) {
	        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000, 5);
	        CheckingAccount checkingAccount = new CheckingAccount("CA001", 2000, 500);

	        savingsAccount.deposit(500);
	        savingsAccount.addInterest();

	        checkingAccount.withdraw(1500);
	        checkingAccount.withdraw(2000);
	    }
	}