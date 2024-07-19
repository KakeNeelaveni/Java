package com.exe;

public class DemoTraficSignal {

	public static void main(String[] args) {
		
		Signals sig=new Signals();
		
		Thread thread=new Thread() {
			public void run() {
				try {
					sig.green("green");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		thread.start();
		
		Thread thread1=new Thread() {
			public void run() {
				sig.red("red");
			}
		};
		thread1.start();
	}

}
