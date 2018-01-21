package com.winter.season.Testmart;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.winter.season.Testmart.Model.Product;

@WebService(targetNamespace="client.sei.com")
public interface ProductCatalog {

	@WebMethod(operationName="fetchCategories",action="fetching_category")
	List<String> getProductCatalog();

	@WebMethod(operationName="availableProduct")
	@WebResult(name="LookupOUTput")
	List<String> getProduct(@WebParam(name="LookupInput")String catagory) throws BaseException;

	@WebMethod
	boolean addProduct(String catagory, String product) throws BaseException;

	@WebMethod
	@WebResult(name="Product")
	List<Product> getProductV2(String catagory);

}