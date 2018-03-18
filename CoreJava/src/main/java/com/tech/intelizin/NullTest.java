package com.tech.intelizin;

public class NullTest {
	static void test()
	{
		try
		{
			String x = null;
			System.out.println(x.toString()+" ");
		}
		finally {
			System.out.println("finally");
		}
	}
	
	public static void main(String[] args) {
		try
		{
			test();
		}
		catch(Exception ex)
		{
			System.out.println("Exception");
		}
	}

}
