package com.digit.java.thread;

//consumer producer problem
class p1 extends Thread {

	Queue a;

	public p1(Queue q) {

		a = q;

	}

	public void run() {

		int i = 0;

		while (true) {
			a.put(i++);

		}

	}

}

class Consumer extends Thread {

	Queue b;

	public Consumer(Queue q) {

		b = q;

	}

	public void run() {

		while (true) {

			b.get();

		}

	}

}

class Queue {

	int x =0;
	boolean value_x=false;
	synchronized void get() {

		System.out.println("Consumer Consumed The Value : " + x);

	}

	synchronized void put(int i) {

		x = i;

		System.out.println("Producer has Produced the value " + x);

	}

}

public class producer {

	public static void main(String[] args) {

		Queue q = new Queue();

		p1 p = new p1(q);

		Consumer c = new Consumer(q);

		p.start();

		c.start();

	}

}
