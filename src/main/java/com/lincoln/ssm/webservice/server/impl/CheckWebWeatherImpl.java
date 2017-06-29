package com.lincoln.ssm.webservice.server.impl;

import com.lincoln.ssm.entity.Weather;
import com.lincoln.ssm.webservice.server.IWebWeather;

public class CheckWebWeatherImpl implements IWebWeather {

	@Override
	public Weather checkWeather(int date) {
		// TODO Auto-generated method stub
		return new Weather("23.4",5);
	}

}
