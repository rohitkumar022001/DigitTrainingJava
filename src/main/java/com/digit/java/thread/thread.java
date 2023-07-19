package com.digit.java.thread;

import java.util.Scanner;

public class thread {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("banking operation");
		System.out.println("enter account");
		int acc=sc.nextInt();
		System.out.println("enter pin");
		int pin=sc.nextInt();
		System.out.println("bANKING COMPLETED");
		System.out.println("printing operation");
		for(int i=0;i<6;i++) {
			System.out.println("hii rohit");
			Thread.sleep(3000);
		}
		System.out.println("printing completed");
		System.out.println("adding operation");
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int res=a+b;
		System.out.println("result = "+res);
		}

}
