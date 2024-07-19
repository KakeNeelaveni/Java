package com.revision;

public class Concur7 {

public static void main(String ar[]) throws InterruptedException {

String str1 = new String("R1");

String str2 = new String("R2");

MyThread thrd1 = new MyThread("Firsr", str1, str2);

MyThread thrd2 = new MyThread("Second", str1, str2);

thrd1.start();

thrd1.join();

thrd2.start();

}

}

class MyThread extends Thread {

private String First;

private String Second;

public MyThread(String thrdname, String one, String two) {

super(thrdname);

First = one;

Second = two;

}

public void run() {

if (getName().equals("First")) {

synchronized (First) {

try {

Thread.sleep(4000);

} catch (InterruptedException E) {

E.printStackTrace();

}

synchronized (Second) {}

}

}

else {

synchronized (Second) {

try {

Thread.sleep(4000);

} catch (InterruptedException E) {

E.printStackTrace();

}

synchronized (First) {}

}

}

}

}