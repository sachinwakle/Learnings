package com.client.app;

import com.winter.season.Testmart.Model.Product;

public class TestString {

	public static void display(Product pro)
	{
		System.out.println("pro: "+pro);
		Product p2 = pro;
		System.out.println("p2: "+p2);
		String p3 = pro.toString();
		System.out.println("p3: "+p3);
		
	}
	public static void main(String[] args) {

		Product pro1 = new Product("sherlock Holmes", "awa", 32f);
		
/*		System.out.println("Product: "+pro1);
		String pro2 = pro1.toString();
		System.out.println(" "+pro2);*/
		
		display(pro1);
	}

}
