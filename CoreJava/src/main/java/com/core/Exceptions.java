package com.core;

public class Exceptions {

	private int addNumbers(int firstNumber, int secondNumber)
	{
		if(firstNumber>40)
		{
			throw new IllegalArgumentException("First number must be small");
		}
		
		return firstNumber+secondNumber;
	}
	
	public void testChainedException()
	{
		int total = 0;
		try{
			
			total = addNumbers(50, 60);
			System.out.println("Total: "+total);
		}
		catch(IllegalArgumentException e)
		{
			throw new IllegalStateException("can not add numbers", e);
		}
		
	}
}
