package com.lincoln.ssm.webservice.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lincoln.ssm.webservice.server.IWebWeather;

public class WebServiceClient2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"webServiceClient.xml"});
		
		IWebWeather iWeather = (IWebWeather)context.getBean("client");
		System.out.println(iWeather.checkWeather(9).getTemprature());
	}
}
