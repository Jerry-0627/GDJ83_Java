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
		
		while(flag) {
			ArrayList<CardDTO> ar = cardService.init();
			System.out.println("1. 명함 정보 출력");
			System.out.println("2. 이름으로 명함 정보 검색");
			System.out.println("3. 명함 정보 추가");
			System.out.println("4. 명함 정보 삭제");
			System.out.println("5. 종료");
			int select = sc.nextInt();
			
			if(select == 1) {
				cardView.View(ar);
			}else if (select == 2) {
				System.out.println("찾고자 하는 명함 정보에 해당하는 이름을 입력하시오.");
				String name = sc.next();
				CardDTO dto = cardService.findByName(ar, name);
				cardView.View(dto);
			}else if (select == 3) {
				cardService.addInformation(ar);
			}else if (select ==4) {
				CardDTO dto = new CardDTO();
				System.out.println("삭제하고 하는 명함에 해당하는 이름을 입력하시오.");
				String name = sc.next();
				
			}else {
				flag = false;
			}
		}
	}
}
