package com.winter.season.Testmart;

import javax.xml.ws.WebFault;

import com.winter.season.Testmart.Model.FaultBean;

@WebFault(name="MainFault",targetNamespace="faults.testmart.client.com",messageName="Fault")
public class BaseException extends Exception {
	
	private static final long serialVersionUID = -4486664307158743558L;
	private FaultBean faultInfo;
	
	public BaseException(String details, FaultBean faultInfo) {
		super(details);
		this.faultInfo = faultInfo;
	}
	
	public BaseException(String details, Throwable cause, FaultBean faultInfo)
	{
		super(details,cause);
		this.faultInfo=faultInfo;
	}
	public FaultBean getFaultInfo()
	{
		return this.faultInfo;
	}

}
