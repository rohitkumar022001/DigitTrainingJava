/**
 * 
 */
package com.digit.java.collectionFramework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
 */
public class linkedlist1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		
		
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(700);
		System.out.println(l);
		l.add(1, 500);
		System.out.println(l);
		ArrayList a=new ArrayList();
		a.add(200);
		a.add(1, 300);
		a.add("rohit");
		a.add('a');
		l.addAll(a);
		System.out.println(l);
		l.addAll(1, a);
		System.out.println(l);
		l.addFirst(1);
		l.addLast(2);
		System.err.println(l);
		LinkedList l1=(LinkedList)l.clone();
		System.out.println("clone\n"+l1);
		
		System.out.println(l.contains(200));
		System.out.println(l.containsAll(l1));
		System.err.println(l.equals(l1));
		ArrayDeque d=new ArrayDeque();
		d.add(232);
		d.add(23);
		
		
	}

}
