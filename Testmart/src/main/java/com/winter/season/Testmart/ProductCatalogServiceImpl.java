package com.winter.season.Testmart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.winter.season.Testmart.Model.FaultBean;
import com.winter.season.Testmart.Model.Product;

public class ProductCatalogServiceImpl {
	
	public static final Logger logger = Logger.getLogger(ProductCatalogServiceImpl.class.getName());

	private  final List<String> bookList = new ArrayList<>();
	private  final List<String> movieList = new ArrayList<>();
	private  final List<String> musicList = new ArrayList<>();
	
	public ProductCatalogServiceImpl()
	{
		bookList.add("Game of thrones");
		bookList.add("Eat That Frog");
		bookList.add("Magic of Thinking Big");
		
		movieList.add("Persuit of happiness");
		movieList.add("The Walk");
		movieList.add("Avenger");
		
		musicList.add("Chip Thrill");
		musicList.add("chain smoker");
		musicList.add("Let me love you");
		
	}
	
	public List<String> getProductCatalog()
	{
		List<String> catagories = new ArrayList<>();
		catagories.add("Book");
		catagories.add("Music");
		catagories.add("Movies");
		
		return catagories;
	}
	
	public List<String> getProduct(String catagory) throws BaseException
	{
		if(catagory != null && !catagory.isEmpty())
		{
			switch(catagory.toLowerCase())
			{
			   case "book":
				   return bookList;
			   case "music":
				   return musicList;
			   case "movies":
				   return movieList;
			   default:
				   return null;
			}
			
		}
		
		FaultBean faultInfo = new FaultBean();
		faultInfo.setFaultCode("Empty or Null Category");
		faultInfo.setFaultMessage("product category should not be null.");
		
		logger.log(Level.ALL, "***exception occured***");
		throw new BaseException("Can Not Proceed.", faultInfo);
	}
	
	public boolean addProduct(String catagory, String product) throws BaseException
	{
		if(catagory != null && !catagory.isEmpty() && product != null && !product.isEmpty())
		{
			switch (catagory.toLowerCase()) {
			case "book":
				return bookList.add(product);
			case "music":
				return musicList.add(product);
			case "movies":
				return movieList.add(product);
			default:
				try {
					throw new IOException();
				} catch (IOException e) {
					
					FaultBean fb = new FaultBean();
					fb.setFaultCode("UNAVAILABLE CATEGORY");
					fb.setFaultMessage("Category is not available");
					
					throw new BaseException(e.getMessage(), e.getCause(), fb);
				}
			}
		}
		throw new BaseException("Category or Product null or Empty", new NullPointerException(), new FaultBean("Null Parameter Fault", "please provide valid category and product."));
	}

	
	public List<Product> getProductV2(String catagory) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Head First Java", "abc", 496.3f));
		productList.add(new Product("Design Pattern", "cvb", 303.3f));
		return productList;
	}
}
