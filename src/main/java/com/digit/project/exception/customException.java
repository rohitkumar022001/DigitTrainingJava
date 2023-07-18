package com.digit.project.exception;

import java.util.Scanner;

class underAgeException extends Exception{
	public String getMessage() {
		return "age is less gthan 18";
	}
}
class overAgeException extends Exception{
	public String getMessage() {
		return "over age";
	}
}
class condidate{
	int age;
	void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		age=sc.nextInt();
	}
	void verify()throws Exception{
		if(age<18) {
			underAgeException u=new underAgeException();
			System.out.println(u.getMessage());
			throw u;
			}
		else if(age>60) {
			overAgeException o=new overAgeException();
			System.out.println(o.getMessage());
			throw o;
		}
		else {
			System.out.println("eligible");
		}
	}
}
class rto{
	void grantLisence(condidate c) {
		try {
		c.getData();
		c.verify();
		}
		/*catch(Exception e3) {
			System.out.println("crossed limit");
		}*/
		catch(Exception e1) {//nested try catch block
			try {
				c.getData();
				c.verify();
				}
				catch(Exception e2) {
					try {
						c.getData();
						c.verify();
						}
						catch(Exception e3) {
							System.out.println("crossed limit");
						}
				}
		}
	}
}
public class customException {

	public static void main(String[] args) {
		condidate c=new condidate();
		rto rto=new rto();
		rto.grantLisence(c);
		// TODO Auto-generated method stub

	}

}
