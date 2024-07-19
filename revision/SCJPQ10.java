package com.revision;

class SCJPQ10 {

public static void main(String args[]) {

SCJPQ10 scjp = new SCJPQ10();

scjp.method1();

}

public void method1() {

ThreadAsc tasc = new ThreadAsc("OneThread");

tasc.start();

}

}

class ThreadAsc extends Thread {

private String str1 = " ";

ThreadAsc(String s) {

str1 = s;

}

public void run() {

methodWait();

System.out.println("Thread Completed");

}

public void methodWait() {

while (true) {

try {

System.out.println("Waiting Thread");

wait();

} catch (InterruptedException e) {

}

System.out.println(str1);

}

}

}