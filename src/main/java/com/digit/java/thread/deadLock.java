package com.digit.java.thread;

public class deadLock {
	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		w1.setName("Karna");
		Warrior w2 = new Warrior();
		w2.setName("Arjuna");
		w1.start();
		w2.start();
	}
}

class Warrior extends Thread {
	String res1 = "Bhramastra";
	String res2 = "Sarpastra";
	String res3 = "Pashupatastra";

	public void run() {
		if (Thread.currentThread().getName().equals("Arjuna")) {
			arjunaAcq();
		} else {
			karnaAcq();
		}
	}

	void karnaAcq() {
		try {
			synchronized (res1) {
				System.out.println("Karna Acquired " + res1);
				Thread.sleep(3000);
				synchronized (res2) {
					System.out.println("Karna Acquired " + res2);
					Thread.sleep(3000);
					synchronized (res3) {
						System.out.println("Karna Acquired " + res3);
						Thread.sleep(3000);
					}
				}

			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	void arjunaAcq() {
		try {
			synchronized (res1) {
				System.out.println("Arjuna Acquired " + res3);
				Thread.sleep(3000);
				synchronized (res2) {
					System.out.println("Arjuna Acquired " + res2);
					Thread.sleep(3000);
					synchronized (res3) {
						System.out.println("Arjuna Acquired " + res1);
						Thread.sleep(3000);
					}
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
