/**
 * 
 */
package com.digit.java.collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * 
 */
public class hashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<String,Integer> hm=new HashMap<>();
		//LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
		TreeMap<String, Integer> hm=new TreeMap<>();
		hm.put("himanshu", 1);
		hm.put("chinu", 2);
		hm.put("reeshu", 3);
		hm.put("rohit", 5);
		hm.put("raja", 6);
		
		System.out.println(hm);
		
		

	}

}
