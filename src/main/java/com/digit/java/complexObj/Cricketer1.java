package com.digit.java.complexObj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.digit.project.exception.customException;

public class Cricketer1 implements Comparable{
	String name;

	String country;

	int cid;

	int matches;

	int wickets;
	public Cricketer1(String name, String country, int cid, int matches, int wickets) {

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
		ArrayList<Cricketer1> al=new ArrayList<Cricketer1>();
		Cricketer1 c1=new Cricketer1("rohit", "india", 1, 30, 20);
		Cricketer1 c2=new Cricketer1("virat", "india", 2, 30, 10);
		Cricketer1 c3=new Cricketer1("sikhar", "india", 3, 30, 70);
		al.add(c1);
		al.add(c2);
		al.add(c3);
		Collections.sort(al);
		System.out.println(al);
		

		
	}
	@Override
	public int compareTo(Object x) {
		// TODO Auto-generated method stub
		if(this.wickets < ((Cricketer1)x).wickets) {
			return 1;
		}
		return -1;
		
	}

}
