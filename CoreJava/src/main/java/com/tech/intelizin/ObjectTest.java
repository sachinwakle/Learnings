package com.tech.intelizin;

public class ObjectTest {

	public static void main(String[] args) {
		
		System.out.println(makinString());
	}
	public static String makinString()
	{
		String s = "null";
		s = s+"47";
		s= s.substring(2, 5);
		s= s.toUpperCase();
		return s.toString();
	}
}
