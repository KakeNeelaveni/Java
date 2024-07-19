package com.revision;
//InsufficientFundsException.java
 class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}
//BankAccount.java
 class BankAccount {
  private double balance;

  public BankAccount(double initialBalance) {
      this.balance = initialBalance;
  }

  public double getBalance() {
      return balance;
  }

  public void performTransaction(double amount) throws InsufficientFundsException {
      if (amount < 0 && balance + amount < 0) {
          throw new InsufficientFundsException("Insufficient funds for this transaction.");
      }
      balance += amount;
  }
}

//BankSystemDemo.java
public class BankSystemDemo {
  public static void main(String[] args) {
      BankAccount account = new BankAccount(100.00); // Initial balance of $100

      try {
          System.out.println("Initial Balance: $" + account.getBalance());
          
          // Deposit $50
          account.performTransaction(50);
          System.out.println("After depositing $50, Balance: $" + account.getBalance());

          // Withdraw $30
          account.performTransaction(-30);
          System.out.println("After withdrawing $30, Balance: $" + account.getBalance());

          // Attempt to withdraw $150 (should throw InsufficientFundsException)
          account.performTransaction(-150);
      } catch (InsufficientFundsException e) {
          System.out.println("Transaction failed: " + e.getMessage());
      }

      // Display balance after attempting the failed transaction
      System.out.println("Final Balance: $" + account.getBalance());
  }
}
