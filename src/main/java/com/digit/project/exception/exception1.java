package com.digit.project.exception;

import java.util.Scanner;

class excep {
	void function1() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("division operator");
		int num, den;
		num = sc.nextInt();
		den = sc.nextInt();
		int res = num / den;
		int size = sc.nextInt();
		int[] arr = new int[size];
		int a[] = null;
		int pos = sc.nextInt();
	}

	void function2() throws Exception {
		function1();
	}

	void function3() {
		try {
		function2();
		}
		catch(Exception e) {
			System.out.println("left_fun-3");
			
		}
	}

}

public class exception1 {

	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub
		excep e=new excep();
		e.function3();

	}
}
