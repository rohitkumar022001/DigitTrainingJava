/**
 * 
 */
package com.digit.java.collectionFramework;
import java.util.ArrayList;

/**
 * 
 */
public class ArrayList1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		l.add(200);
		l.add(1, 300);
		l.add("rohit");
		l.add('a');
		boolean x=l.contains(200);
		System.out.println(x);
		ArrayList l1=new ArrayList();
		l1=(ArrayList)l.clone();
		System.out.println(l);
		System.out.println(l1);
		//l.clear();
		System.out.println(l);
		System.out.println(l.get(2));
		System.out.println(l1.indexOf(new Integer(300)));
		System.out.println(l.isEmpty());
		System.out.println(l.remove(2));
		System.out.println(l.size());
		System.out.println(l.toString());
		System.out.println(l.hashCode());
		System.out.println(l1.hashCode());
		//System.out.println(l.addAll(1, l1));
		//System.out.println(l);
		l.add(200);
		l.add(-1);
		System.out.println(l);
		//l.toArray();
		System.out.println(l);
		System.out.println(l.containsAll(l1));
		System.out.println(l.hashCode()==l1.hashCode() );
		System.out.println(l.re);
		

	}

}
