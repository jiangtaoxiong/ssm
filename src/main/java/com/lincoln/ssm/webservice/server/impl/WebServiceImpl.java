package com.lincoln.ssm.webservice.server.impl;

import com.lincoln.ssm.webservice.server.IWebService;

public class WebServiceImpl implements IWebService {

	@Override
	public String sayHello(String string) {
		System.out.println("Webservice server say "+string);
		return "welcome"+string;
	}

}
