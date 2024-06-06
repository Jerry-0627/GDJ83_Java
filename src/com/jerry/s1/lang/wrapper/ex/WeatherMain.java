package com.jerry.s1.lang.wrapper.ex;
public class WeatherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DTO (Data Transfer Object)
		// VO (Value Object)
//		// 호출하려면 객체부터 만들고
//		WeatherView wv = new WeatherView();
//		// 멤버 메소드 사용하려면 참조변수.메서드명(매개변수)
//		wv.view(dtos);
		WeatherController wc = new WeatherController();
		//WeatherConroller 타입의 wc 변수에 WeatherController 생성자 생성
		wc.start();
	}

}