package com.winter.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class CardController {
	private Scanner sc;
	private CardService cardService;
	private CardView cardView;

	public CardController() {
		this.cardService = new CardService();
		this.cardView = new CardView();
		this.sc = new Scanner(System.in);
	}

	public void start() {
		boolean flag = true;
		ArrayList<CardDTO> ar = cardService.init();

		while (flag) {
			System.out.println("1. 명함 정보 출력");
			System.out.println("2. 이름으로 명함 정보 검색");
			System.out.println("3. 명함 정보 추가");
			System.out.println("4. 명함 정보 삭제");
			System.out.println("5. 종료");
			int select = sc.nextInt();

			if (select == 1) {
				cardView.View(ar);
			} else if (select == 2) {
				CardDTO dto = cardService.findByName(ar);
				cardView.View(dto);
			} else if (select == 3) {
				cardService.addInformation(ar);
			} else if (select == 4) {
				cardService.removeByName(ar);
			} else {
				flag = false;
			}
		}
	}
}
