package com.exe;

public class ArrayElements {

	static int[] arr;

	public ArrayElements(int[] arr) {
		super();
		this.arr = arr;
	}

	/* void sumOfElements() {
		int sum = 0;
		synchronized(this) {
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(arr[i]);
		}
		System.out.println("Sum="+sum);
	}
		  synchronized void sumOfElements() {
				int sum = 0;
				
				for (int i = 0; i < arr.length; i++) {
					sum += arr[i];
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					System.out.println(arr[i]);
				}
				System.out.println("Sum="+sum);
			}*/
	 synchronized static void sumOfElements() {
			int sum = 0;
			
			for (int i = 0; i <arr.length; i++) {
				sum += arr[i];
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println(arr[i]);
			}
			System.out.println("Sum="+sum);
		}
	
  }


