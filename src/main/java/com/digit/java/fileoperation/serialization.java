package com.digit.java.fileoperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serialization {

	public static void main(String[] args) throws Exception {

		Cricketer c1 = new Cricketer("rohit", "india", 34, 150, 20);

		c1.display();
		//serialization
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Rohit.Kumar02\\Desktop\\fileop\\cricketer.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c1);
		//de-serialization
		FileInputStream fis=new FileInputStream("C:\\Users\\Rohit.Kumar02\\Desktop\\fileop\\cricketer.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Cricketer c2=(Cricketer)ois.readObject();
		c2.display();

	}

}

class Cricketer implements Serializable {

	String name;

	transient String country;

	int age;

	int matches;

	int wickets;

	public Cricketer(String name, String country, int age, int matches, int wickets) {

		super();

		this.name = name;

		this.country = country;

		this.age = age;

		this.matches = matches;

		this.wickets = wickets;

	}

	void display() {

		System.out.println(name);

		System.out.println(country);

		System.out.println(age);

		System.out.println(matches);

		System.out.println(wickets);

	}

}
