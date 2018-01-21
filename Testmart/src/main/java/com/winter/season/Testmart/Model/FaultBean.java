package com.winter.season.Testmart.Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="FaultDetails",namespace="model.testmart.com")
public class FaultBean {

	private String faultCode;
	private String faultMessage;
	
	public FaultBean()
	{
		
	}
	
	public FaultBean(String faultCode, String message)
	{
		this.faultCode = faultCode;
		this.faultMessage = message;
	}
	
	@XmlElement(name="FaultName")
	public String getFaultCode() {
		return faultCode;
	}
	
	public void setFaultCode(String faultCode) {
		this.faultCode = faultCode;
	}

	@XmlElement(name="FaultMessage")
	public String getFaultMessage() {
		return faultMessage;
	}
	public void setFaultMessage(String faultDetails) {
		this.faultMessage = faultDetails;
	}
}
