package com.digit.java.thread;

public class program8 implements Runnable {

public static void main(String[] args) {

    program8 p = new program8();

    ThreadGroup tg = new ThreadGroup("group-1");

    

    Thread t1 = new Thread(tg,p,"first-thread");

    Thread t2 = new Thread(tg,p,"second-thread");

    

    t1.start();

    t2.start();

}

public void run() {

    System.out.println(Thread.currentThread().getThreadGroup() +" "+Thread.currentThread().getThreadGroup());

}

}
