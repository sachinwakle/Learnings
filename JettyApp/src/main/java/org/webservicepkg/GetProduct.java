package org.webservicepkg;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

@WebService(targetNamespace="clientservice.org")
public class GetProduct {

	public List<String> getProductList()
	{
		List<String> catagories = new ArrayList<String>();
		catagories.add("Computer");
		catagories.add("Mobile");
		catagories.add("Jeans");
		catagories.add("Shoes");
	
		return catagories;
		
	}
}
