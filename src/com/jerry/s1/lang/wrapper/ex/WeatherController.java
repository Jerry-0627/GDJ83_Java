package com.jerry.s1.lang.wrapper.ex;
import java.util.Scanner;

public class WeatherController {
	private WeatherService weatherService;
	private WeatherView weatherView;
	private WeatherDTO[] dtos;
	private Scanner sc;

	// dtos의 초기화는 WeatherController의 생성자 내에서 초기화
	// start
	// 1. 날씨전체정보출력
	// 2. 종료
	public WeatherController() {
		this.weatherService = new WeatherService();
		this.weatherView = new WeatherView();
		this.dtos = this.weatherService.init();
		this.sc = new Scanner(System.in);
	}

	public void start() {

		boolean flag = true;
		while (flag) {
			System.out.println("1. 날씨전체정보출력");
			System.out.println("2. 날씨정보검색");
			System.out.println("3. 날씨정보추가");
			System.out.println("4. 날씨정보삭제");
			System.out.println("5. 프로그램종료");
			int select = sc.nextInt();
			if (select == 1) {
				this.weatherView.view(dtos);

			} else if (select == 2) {

				WeatherDTO weatherDTO = weatherService.findByCity(this.sc, this.dtos);
				weatherView.view(weatherDTO);

			} else if (select == 3) {
				dtos = weatherService.addWeather(sc, dtos);
			} else if (select == 4) {
				
			} else if (select == 5) {
				
				System.out.println("프로그램이 종료 됩니다");
				break;
				// return;
			}
		}

		// 추가 코드

	}

}
