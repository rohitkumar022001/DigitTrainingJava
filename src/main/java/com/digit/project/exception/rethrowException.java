package com.digit.project.exception;



import java.util.Scanner;

class excep {
	void function1() throws Exception {
		try {
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
		catch(Exception e) {
			System.out.println("exception handeled");
			throw e;
		}
		finally {
			System.out.println("left function");
		}
	}

	

}

public class rethrowException {

	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub
		try {
		excep e=new excep();
		e.function1();
		}
		catch(Exception e) {
			System.out.println("handeled in main");
		}
		finally {
			System.out.println("left main");
		}

	}
}

