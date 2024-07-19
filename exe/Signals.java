package com.exe;

public class Signals {
	String signal;
	synchronized void green(String s) throws InterruptedException {
		this.signal=s;
		if(signal.compareToIgnoreCase("green")!=0)
			wait();
		System.out.println("The signal is green: now you can move:"+signal);
		 
	 }
	 
	synchronized void red(String s) {
		 System.out.println("The signal is red:wait for 1 min:"+signal);
		 
		 this.signal=s;
		 notify();
		 
	 }
	 
	/* void yellow(String signal) {
		 
	 }*/


}
