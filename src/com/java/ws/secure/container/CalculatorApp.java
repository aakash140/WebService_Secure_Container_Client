package com.java.ws.secure.container;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CalculatorApp {

	public static final String URI="File:thirdParty/calculator.wsdl";
	public static void main(String[] args) throws MalformedURLException{
		URL url=new URL(URI);
		QName qName=new QName("http://container.secure.es.java.com/", "CalculatorService");
		Service service=Service.create(url, qName);
	}

}
