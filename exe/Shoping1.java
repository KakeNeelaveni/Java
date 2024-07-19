package com.exe;

public class Shoping1 {
	String product_Status;

	synchronized void productAdd(String status) throws InterruptedException {
		this.product_Status = status;
		if (product_Status.compareToIgnoreCase("PaymentSuccessful") != 0)
			wait();
		System.out.println("item ordered Successfully:" +this. product_Status);
	}

	synchronized void notAdded(String status) {
		System.out.println("Item is not ordered:" + this.product_Status);
		this.product_Status = status;
		notify();

	}

}
