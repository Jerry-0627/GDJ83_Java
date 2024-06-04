package com.jerry.s1.lang.wrapper.ex;

public class WeatherDTO {

	// DTO의 모든 멤버 변수는 private로 설정한다.
	// Getters/Setters 필요
	// 생성자는 여러개 만들어도 상관 없지만 기본 생성자는 필수

	// 도시명
	private String city;
	// 기온
	private String status;
	// 습도
	private double gion;
	// 날씨
	private int humidity;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getGion() {
		return gion;
	}

	public void setGion(double gion) {
		this.gion = gion;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

}
