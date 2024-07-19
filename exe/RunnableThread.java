//Write a program to create multiple Threads using:

//  b. Using  Runnable Interface
package com.exe;

//Define a class DThread that implements the Runnable interface
class DThread implements Runnable {
	// Override the run method to specify the thread's behavior
	@Override
	public void run() {
		// Print the current thread's name
		System.out.println("Thread Name:" + Thread.currentThread().getName());
		// Print the current thread's priority
		System.out.println(Thread.currentThread().getPriority());

	}

}

//class declaration
public class RunnableThread {
	// main method
	public static void main(String[] args) throws InterruptedException {
		// Print the name of the main thread
		System.out.println(Thread.currentThread().getName());
		// Create an instance of DThread
		DThread dthread = new DThread();
		// Create a new Thread object and pass the DThread instance to it, name the
		// thread "Demo One"
		Thread t = new Thread(dthread, "Demo One");
		// Start the "Demo One" thread
		t.start();
		// Make the current thread (main thread) sleep for 4000 milliseconds (4 seconds)
		t.sleep(4000);
		// Create another Thread object with the same DThread instance, name it "Demo
		// Two"
		Thread t1 = new Thread(dthread, "Demo Two");
		// Start the "Demo Two" thread
		t1.start();
		//t1.start();

	}

}
