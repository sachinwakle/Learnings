package com.tech.intelizin;

import java.util.TreeMap;

public class Magelian {

	public static void main(String[] args) {

		TreeMap<String, String> myMap = new TreeMap<String, String>();
		myMap.put("a", "apple");
		myMap.put("d", "date");
		myMap.put("p", "pear");
		myMap.put("f", "fig");
		
		System.out.println(myMap.higherKey("f"));
		System.out.println(myMap.ceilingKey("f"));
		System.out.println(myMap.floorKey("f"));
	}

}
