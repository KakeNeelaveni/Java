//Write a program to create multiple Threads using:

// a. Using Thread class
package com.exe;

//Defining a thread by extending the Thread class
class DemoThread extends Thread {
	String threadName;

	// Constructor to initialize the thread name
	public DemoThread(String threadName) {
		super(threadName);
		this.threadName = threadName;
	}

	// Method that runs when the thread is started
	public void run() {
		// Print the name of the thread
		System.out.println("Name:" + this.getName());
		// Print the priority of the thread
		System.out.println("Prioroty:" + this.getPriority());

		try {
			// Make the thread sleep for 2000 milliseconds (2 seconds)
			this.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Print the ID of the thread
		System.out.println("ID:" + this.getId());
	}

}

//class declaration
public class MultiThreadingExample {
	// main method
	public static void main(String[] args) throws InterruptedException {
		// 1. Creating a new thread
		DemoThread demo = new DemoThread("demo thread");
		// 2. Making the thread runnable by starting it
        System.out.println("State:"+demo.getState());
		demo.start();
		 System.out.println("State:"+demo.getState());
		// 1. Creating another new thread
		DemoThread demo1 = new DemoThread("demo1 thread");
		// 2. Making the thread runnable by starting it
		demo1.start();
		// Setting the priority of the thread to 10 (highest priority)
		demo1.setPriority(10);
		// 1. Creating another new thread

		DemoThread demo2 = new DemoThread("demo2 thread");
		// 2. Making the thread runnable by starting it
		demo2.start();
		demo.join();
		 System.out.println("State:"+demo.getState());
	}

}
