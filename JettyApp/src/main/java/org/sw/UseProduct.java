package org.sw;

import java.util.List;

import org.clientservice.GetProduct;
import org.clientservice.GetProductService;

public class UseProduct {

	public static void main(String[] args) {

		System.out.println("hi...");
		GetProductService getProduct = new GetProductService();
		GetProduct getP = getProduct.getGetProductPort();
		List<String> listOut = getP.getProductList();
		System.out.println(listOut);
	}

}
