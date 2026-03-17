package com.winter.lang.ex2;

public class WeatherDTO {
	
	private String cityName;
	private int gion;
	private double humidity;

	public int getGion() {
		return gion;
	}

	public void setGion(int gion) {
		this.gion = gion;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println(this.getCityName());
		return "";
	}
	
	

}
