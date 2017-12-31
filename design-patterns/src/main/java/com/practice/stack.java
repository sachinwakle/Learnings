package com.practice;

import java.util.LinkedList;
import java.util.List;

public class stack {
	private final List<Integer> values;
	
	public static void main(String[] args) {
		stack s1 = new stack();
		s1.push(2);
		s1.push(6);
		s1.push(8);
		s1.push(1);
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println(s1);
	}
	public stack(){
		values = new LinkedList<Integer>();
	}

	public void push(int element)
	{
		values.add(0, element);
	}
	
	public Integer pop()
	{
		if(values.size()== 0)
			return null;
		
		return values.remove(0);
	}
	
	@Override
	public String toString() {
		return values.toString();
	}
}
