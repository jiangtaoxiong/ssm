package com.lincoln.ssm.webservice.server;

import javax.jws.WebService;

@WebService
public interface IWebService {

	/**
	 * webservice 接口
	 * @author lincoln
	 * @param string
	 * @return String
	 * 
	 */
	public String sayHello(String string);
}
