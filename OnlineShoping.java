//Write a program to order an item by completing the payment using Inter Thread Communication
package com.exe;
class Shopping {
	String product_Status;// status of the product

	synchronized void productAdd(String status) throws InterruptedException {
		this.product_Status = status;
		if (product_Status.compareToIgnoreCase("PaymentSuccessful") != 0)
			wait();// Wait if payment is not successful
		System.out.println("item ordered Successfully:" + this.product_Status);
	}

	synchronized void notAdded(String status) {
		System.out.println("Item is not ordered:" + this.product_Status);
		this.product_Status = status;// Update status
		notify();// Notify waiting thread that product status has changed

	}

}

public class OnlineShoping {

	public static void main(String[] args) {

		// Create object for Shopping class
		Shopping s = new Shopping();
		// first Thread
		Thread thread1 = new Thread() {
			public void run() {
				try {
					s.productAdd("Notpaid");// status is Notpaid
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		thread1.start();// Start thread1
		// Second Thread
		Thread thread2 = new Thread() {
			public void run() {
				s.notAdded("PaymentSuccessful");// Indicates payment as successful
			}
		};
		thread2.start();// Start thread1
	}

}
