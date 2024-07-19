package com.revision;
class ThreadTest extends Thread {

public void run() {

System.out.println("Starting thread");

try {

Thread.sleep(1000);

System.out.println("Time is up");

} catch (InterruptedException ex) {

System.out.println("Interrupted" +ex);

}

}

}

class Test

{

public static void main(String args[])

{

ThreadTest t1 = new ThreadTest();

ThreadTest t2 = new ThreadTest();

t1.start();

t2.start();

}
}