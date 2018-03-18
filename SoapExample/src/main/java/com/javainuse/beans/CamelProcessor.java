package com.javainuse.beans;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.javainuse.InputSOATest;
import com.javainuse.OutputSOATest;

public class CamelProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
    	
        OutputSOATest out = new OutputSOATest();
        
        //Get input from exchange
        List soaList = exchange.getIn().getBody(List.class);
        InputSOATest inputSOATest = (InputSOATest) soaList.get(0);
        out.setResult("Welcome " + inputSOATest.getTest().toString());
        //set output in exchange
        exchange.getOut().setBody(out);
    }

}
