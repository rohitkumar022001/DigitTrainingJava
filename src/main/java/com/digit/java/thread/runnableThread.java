package com.digit.java.thread;

import java.util.Scanner;

class Banking implements Runnable {

	Scanner sc = new Scanner(System.in);

	public void run() {

		banking();

	}

	public void banking() {

		System.out.println("Bank Operation");

		System.out.println("Enter the acc no");

		int accno = sc.nextInt();

		System.out.println("Enter the pin");

		int pin = sc.nextInt();

		System.out.println("Banking Completed");

	}

}

class printing implements Runnable {

	public void run() {

		try {

			printing();

		} catch (InterruptedException e) {
		}

	}

	public void printing() throws InterruptedException {

		System.out.println("Printing Operation");

		for (int i = 0; i < 5; i++) {

			System.out.println("Good Morning");

			Thread.sleep(2000);

		}

		System.out.println("Print Completed");

	}

}

class add implements Runnable {

	Scanner sc = new Scanner(System.in);

	public void run() {

		add();

	}

	public void add() {

		System.out.println("Enter the amount");

		int am1 = sc.nextInt();

		System.out.println("Enter the amount ");

		int am2 = sc.nextInt();

		int res = am1 + am2;

		System.out.println("The Res = " + res);

	}

}

public class runnableThread {

	public static void main(String[] args) {

		Banking op1 = new Banking();

		printing op2 = new printing();

		add op3 = new add();

		Thread t1 = new Thread(op1);
		t1.setName("banking");
		Thread t2 = new Thread(op2);
		t2.setName("printing");
		Thread t3 = new Thread(op3);
		t3.setName("add");

		t1.start();

		t2.start();

		t3.start();
		System.out.println("main terminated");

	}

}
