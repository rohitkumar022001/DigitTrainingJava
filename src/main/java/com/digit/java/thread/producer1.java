package com.digit.java.thread;

//consumer producer problem
class P2 extends Thread {

	Queue1 a;

	public P2(Queue1 q) {

		a = q;

	}

	public void run() {

		int i = 0;

		while (true) {

			a.put(i++);

		}

	}

}

class Consumer1 extends Thread {

	Queue1 b;

	public Consumer1(Queue1 q) {

		b = q;

	}

	public void run() {

		while (true) {

			b.get();

		}

	}

}

class Queue1 {

	int x = 0;

	boolean value_of_x = false;

	synchronized public void get() {

		try {

			if (value_of_x) {

				value_of_x = false;

				System.out.println("Consumer Consumed The Value : " + x);

				notify();

			}

			else {

				wait();

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	synchronized public void put(int i) {

		try {

			if (!value_of_x) {

				x = i;

				value_of_x = true;

				System.out.println("Producer has Produced the value " + x);

				notify();

			}

			else {

				wait();

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}

public class producer1 {

	public static void main(String[] args) {

		Queue1 q = new Queue1();

		P2 p = new P2(q);

		Consumer1 c = new Consumer1(q);

		p.start();

		c.start();

	}

}