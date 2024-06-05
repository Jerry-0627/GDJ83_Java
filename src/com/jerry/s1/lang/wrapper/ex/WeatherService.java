package com.jerry.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherService {
	// Controller Layer
	// Business Layer
	// DAO LAyer

	private StringBuffer sb; // 변수 선언만 되어 있음.

	public WeatherService() { // 기본 생성자 클래스와 메서드는 동일한 이름
		this.sb = new StringBuffer();
		this.sb.append("서울 , 29.3 - 맑음 - 60");
		this.sb.append("-부산 , 33.6 - 흐림 - 90");
		this.sb.append("-제주 , 26.5 - 눈 - 30");
		this.sb.append("-광주 , 10.6 - 태풍 - 80");
	}

	public WeatherDTO[] init() { // 리턴 타입 모르면 일단 void를 쓸 것
		// sb에 있는 것을 문자열 변수에 담아서 출력
		String info = sb.toString();
		info = info.replace(",", "-");

		WeatherDTO[] dtos = this.getWeatherDTOs(info);

		return dtos;
	}

	private WeatherDTO[] getWeatherDTOs(String info) {
		String[] infos = info.split("-"); // - 를 기준으로 분류하여 배열에 담는다.
		WeatherDTO[] weatherDTOs = new WeatherDTO[infos.length / 4];
		int j = 0;
		for (int i = 0; i < infos.length; i = i + 4) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(infos[i].trim());
			weatherDTO.setGion(Double.parseDouble(infos[i + 1].trim()));
			weatherDTO.setStatus(infos[i + 2].trim());
			weatherDTO.setHumidity(Integer.parseInt(infos[i + 3].trim()));
			weatherDTOs[j] = weatherDTO;
			j++;
		}

		return weatherDTOs;

	}

	// 날씨정보를 도시명으로 검색 해당 날씨정보를 리턴

	// findByCity
	public WeatherDTO findByCity

	public void findByCity() {
		Scanner sc = new Scanner(System.in);
		String city = sc.next();

	}

	// 날씨정보 추가
	// 매서드명 addWeather
	// 도시명 기온, 습도, 상태 입력 받아서 기존의 날씨 정보들에 추가하기

	// removeWeather
	// 기본 배욜에서 하나를 삭제
	// 도시명을 입력 받아서 일치하느 날씨정보삭제

}
