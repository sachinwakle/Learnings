package com.winter.season.Testmart.Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Product")
@XmlType(propOrder={"price","name","sku"})
public class Product {

	private String name;
	private String sku;
	private float price;
	
	@Override
	public String toString() {
		return name+"|"+sku+"|"+price;
	}
	
	public Product()
	{
		
	}
	public Product(String name, String sku, float price)
	{
		this.name = name;
		this.sku=sku;
		this.price=price;
	}

	@XmlElement(name="ProductName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	@XmlElement(name="ProductPrice")
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
