package com.jerry.s1.lang.wrapper.ex;

public class WeatherView {

	// 메서드의 이름은 view
	// 날씨들의 정보를 받아서 이쁘게 출력
	public void view(WeatherDTO weatherDTO) {
		if (weatherDTO != null) {
			System.out.print(weatherDTO.getCity() + "\t");
			System.out.print(weatherDTO.getGion() + "\t");
			System.out.print(weatherDTO.getStatus() + "\t");
			System.out.println(weatherDTO.getHumidity() + "\t");

		}
	}

	public void view(WeatherDTO[] dtos) {
		for (int i = 0; i < dtos.length; i++) {
			System.out.print(dtos[i].getCity() + "\t");
			System.out.print(dtos[i].getGion() + "\t");
			System.out.print(dtos[i].getStatus() + "\t");
			System.out.println(dtos[i].getHumidity() + "\t");
		}
	}
}