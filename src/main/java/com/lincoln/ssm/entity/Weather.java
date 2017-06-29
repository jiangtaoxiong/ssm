package com.lincoln.ssm.entity;

import java.io.Serializable;

public class Weather implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String temprature;
	private Integer windx;
	public Weather() {
		super();
	}
	public Weather(String temprature, Integer windx) {
		super();
		this.temprature = temprature;
		this.windx = windx;
	}
	public String getTemprature() {
		return temprature;
	}
	public void setTemprature(String temprature) {
		this.temprature = temprature;
	}
	public Integer getWindx() {
		return windx;
	}
	public void setWindx(Integer windx) {
		this.windx = windx;
	}
}
