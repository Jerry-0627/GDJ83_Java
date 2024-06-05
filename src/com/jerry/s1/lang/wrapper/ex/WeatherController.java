package com.jerry.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherController {

	// 메서드명 start
	// dots의 초기화는 WeatherController의 생성자 내에서 초기화
	// 1. 날씨 전체 정보를 출력
	// 2. 종료

	// 변수 선언 (이제 변수를 생성자 내에서 초기화 해야함)
	private WeatherDTO[] dtos;
	private WeatherService weatherService;
	private WeatherView weatherView;
	private Scanner sc;

	public WeatherController() {
		this.weatherView = new WeatherView();
		this.weatherService = new WeatherService();
		this.dtos = this.weatherService.init();
		this.sc = new Scanner(System.in);
	}

	public void start() {
		boolean flag = true;
		while (flag) {

			System.out.println("1. 날씨 정보 전체 출력");
			System.out.println("2. 날씨 정보 하나 출력");
			System.out.println("3. 종료");

			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("날씨 정보를 전체 출력하겠습니다.");
				this.weatherView.view(dtos);
			} else if (num == 2) {
				System.out.println("해당 도시의 날씨 정보를 출력하겠습니다.");
				this.weatherService.findBycity();
			} else if (num == 3) {
				System.out.println("종료하겠습니다.");
				flag = false;
				// return;
				// break;
			}
		}
	}

}
