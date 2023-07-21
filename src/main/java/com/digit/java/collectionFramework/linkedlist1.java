/**
 * 
 */
package com.digit.java.collectionFramework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

import javax.print.attribute.HashAttributeSet;

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
		PriorityQueue q=new PriorityQueue();
		q.add(200);
		q.add(100);
		q.add(50);
		System.out.println(q);
		TreeSet t=new TreeSet();
		t.add(100);
		t.add(300);
		t.add(20);
		t.add(1);
		System.out.println(t);
		System.out.println(t.descendingSet());
		System.out.println(t);
		HashSet h=new HashSet();
		h.add(100);
		h.add(200);
		h.add(500);
		h.add(25);
		h.add(50);
		h.add(75);
		h.add(125);
		h.add(1);
		System.out.println(h);
		LinkedHashSet lh=new LinkedHashSet();
		lh.add(100);
		lh.add(200);
		lh.add(500);
		lh.add(25);
	    lh.add(50);
		lh.add(75);
		lh.add(125);
		lh.add(1);
		
		System.out.println(lh);
	}

}
