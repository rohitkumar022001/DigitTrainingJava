package com.digit.java.complexObj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cricketer2 {

	String name;

	String country;

	int cid;

	int matches;

	int wickets;
	public Cricketer2(String name, String country, int cid, int matches, int wickets) {

		super();

		this.name = name;

		this.country = country;

		this.cid = cid;

		this.matches = matches;

		this.wickets = wickets;

	}
	public String toString() {
		return cid+"-"+country+"-"+name+"-"+matches+"-"+wickets;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cricketer2> al=new ArrayList<Cricketer2>();
		Cricketer2 c4=new Cricketer2("rohit", "india", 1, 30, 20);
		Cricketer2 c5=new Cricketer2("virat", "india", 2, 30, 10);
		Cricketer2 c6=new Cricketer2("sikhar", "india", 3, 30, 70);
		al.add(c4);
		al.add(c5);
		al.add(c6);
		Alpha alpha=new Alpha();
		Collections.sort(al,alpha);
		System.out.println(al);
		

		
	}
}
	class Alpha implements Comparator{
	@Override
	public int compare(Object x,Object y) {
		// TODO Auto-generated method stub
		if(((Cricketer2)x).wickets < ((Cricketer2)y).wickets) {
			return 1;
		}
		return -1;
		
	}
	}

