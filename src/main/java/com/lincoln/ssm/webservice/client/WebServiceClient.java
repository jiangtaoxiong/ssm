package com.lincoln.ssm.webservice.client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.lincoln.ssm.webservice.server.IWebService;
import com.lincoln.ssm.webservice.server.IWebWeather;

public class WebServiceClient {
	public static void main(String[] args) {
		  //创建WebService客户端代理工厂
		  JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		  //注册WebService接口
		  factory.setServiceClass(IWebWeather.class);
		  //设置WebService地址
		  factory.setAddress("http://localhost:8080/ssm/ws/checkWeather");
		  //IWebService greetingService = (IWebService)factory.create();
		  IWebWeather iWebWeather = (IWebWeather)factory.create();
		  System.out.println("invoke webservice...");
		  //System.out.println("message context is:"+greetingService.sayHello("gary"));   
		  System.out.println("message context is:"+iWebWeather.checkWeather(5).getTemprature());   
		 }
}
