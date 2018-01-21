package com.client.app;

import javax.xml.ws.Endpoint;

import com.winter.season.Testmart.ProducCatalogService;

public class Publisher {

	public static void main(String[] args) {
		
		final String URI = "http://localhost:8888/rs"; 

		Endpoint.publish(URI, new ProducCatalogService());
		System.out.println("Web Serice published at: "+URI+"?wsdl");
	}

}
