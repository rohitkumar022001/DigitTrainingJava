package com.digit.project.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		} catch (ArithmeticException e1) {
			System.out.println("ArithmeticException");

		}/* catch (NegativeArraySizeException e2) {
			System.out.println("NegativeArraySizeException");

		}*/ catch (ArrayIndexOutOfBoundsException|NegativeArraySizeException e1) {
			//System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Array related Exception");

		} catch (InputMismatchException e1) {
			System.out.println("InputMismatchException");

		} catch (NullPointerException e1) {
			System.out.println("NullPointerException");

		} catch (Exception e1) {
			System.out.println("Exception");

		}

	}

}
