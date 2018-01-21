package com.winter.season.Testmart;

import java.util.List;

import javax.jws.WebService;

import com.winter.season.Testmart.Model.Product;

@WebService(endpointInterface="com.winter.season.Testmart.ProductCatalog",name="TestMartCatalog",serviceName="TestMartCatalogServices"
,portName="MartCatalog")
public class ProducCatalogService implements ProductCatalog {

	ProductCatalogServiceImpl productCatalogService = new ProductCatalogServiceImpl();
	
	@Override
	public List<String> getProductCatalog()
	{
		return productCatalogService.getProductCatalog();
	}


	@Override
	public List<String> getProduct(String catagory) throws BaseException
	{
		return productCatalogService.getProduct(catagory);
	}
	
	@Override
	public boolean addProduct(String catagory, String product) throws BaseException
	{
		return productCatalogService.addProduct(catagory, product);
	}
	
	
	@Override
	public List<Product> getProductV2(String catagory)
	{
		return productCatalogService.getProductV2(catagory);
	}
}
