package com.jerry.s1.lang.wrapper.ex;

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

	public void init() { // 리턴 타입 모르면 일단 void를 쓸 것
		// sb에 있는 것을 문자열 변수에 담아서 출력
		String info = sb.toString();
		System.out.println(info);
		info = info.replace(",", "-");
		String[] infos = info.split("-"); // - 를 기준으로 분류하여 배열에 담는다.

		int j = 0;
		WeatherDTO[] weatherDTOs = new WeatherDTO[infos.length];
		for (int i = 0; i < infos.length; i = i + 4) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(infos[i].trim());
			weatherDTO.setGion(Double.parseDouble(infos[i + 1].trim()));
			weatherDTO.setStatus(infos[i + 2].trim());
			weatherDTO.setHumidity(Integer.parseInt(infos[i + 3].trim()));
			weatherDTOs[j] = weatherDTO;
			j++;
		}

		for (int i = 0; i < weatherDTOs.length; i++) {
			WeatherDTO dto = weatherDTOs[i];
			System.out.print(weatherDTOs[i].getCity() + "\t");
			System.out.print(weatherDTOs[i].getGion() + "\t");
			System.out.print(weatherDTOs[i].getStatus() + "\t");
			System.out.println(weatherDTOs[i].getHumidity() + "\t");
		}

	}

}
