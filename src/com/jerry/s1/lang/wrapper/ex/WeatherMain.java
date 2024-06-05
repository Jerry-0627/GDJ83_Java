package com.jerry.s1.lang.wrapper.ex;

public class WeatherMain {
	public static void main(String[] args) {
		// DTO(Data Transfer Object) : 데이터를 담고 있는 객체
		// VO(Value Object) :

//		WeatherDTO[] dtos = new WeatherService().init();
//
//		// 호출하려면 객체부터 만들고
//		WeatherView wv = new WeatherView();
//		// 멤버 메소드 사용하려면 참조변수.메서드명(매개변수)
//		wv.view(dtos);

		WeatherController wc = new WeatherController();
		wc.start();

//기본
	}
}
