package com.exe;

public class SynchronizedDemo extends Thread {

	ArrayElements ae;

	public SynchronizedDemo(ArrayElements ae) {
		super();
		this.ae = ae;
	}

	public void run() {
		ae.sumOfElements();

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		ArrayElements arre = new ArrayElements(arr);
		ArrayElements arre1=new ArrayElements(arr);

		SynchronizedDemo sch = new SynchronizedDemo(arre);
		sch.start();

		SynchronizedDemo sch1 = new SynchronizedDemo(arre1);
		sch1.start();

		SynchronizedDemo sch2 = new SynchronizedDemo(arre);
		sch2.start();

	}

}
