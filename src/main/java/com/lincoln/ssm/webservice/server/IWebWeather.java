package com.lincoln.ssm.webservice.server;

import javax.jws.WebService;

import com.lincoln.ssm.entity.Weather;

@WebService
public interface IWebWeather {

	public Weather checkWeather(int date);
}
