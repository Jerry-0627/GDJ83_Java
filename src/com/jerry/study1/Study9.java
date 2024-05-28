package com.jerry.study1;

import java.util.Scanner;

public class Study9 {
	public static void main(String[] args) {

		// 로그인 검증
		// id=1234. pw=5678

		// 로그인 시도 전에 1. 로그인, 2. 종료 선택
		// 사용자의 id와 pw를 입력 받아서 로그인 시도를 N번 시도
		// 틀리면 로그인 실패 출력
		// 로그인 성공하면 '로그인 성공'출력 반복문 종료

		// 반복문 종료 후 종료를 선택 했다면 프로그램을 종료
		// 로그인이 성공 후 반복문이 종료 되었다면 게임을 시작하자

		// MMORPG :
		// 시작 레벨은 1로 시작해서 15가 만랩
		// Gold : 0으로 시작
		// 1랩에서 2랩으로 가려면 3마리를 사냥
		// 2랩에서 3랩으로 가려면 6마리를 사냥
		// 3랩에서 4랩으로 가려면 9마리를 사냥
		// ...
		// 14랩에서 15랩으로 가려면 42마리 사냥
		// 5레벨 달성 시 1000골드 지급
		// 10레벨 달성 시 2000골드 지급
		// 15레벨 달성 시 3000골드 지급

		// 마지막에 현재 레벨과 현재 골드를 출력하고 종료.

		// 레벨업을 하면 사냥하러 갈 것인지, 종료할 것인지 정하기.

		// 로그인 while문
		boolean T = false;
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 로그인 할 것인지에 대한 여부.
			System.out.println("1.로그인 2.종료");
			int Fir = sc.nextInt();
			if (Fir == 1) {
				// 로그인 시 ID와 PW를 알맞게 입력 했는지에 대한 여부.
				System.out.println("로그인을 하기 위해 ID를 입력하시오.");
				int ID = sc.nextInt();
				System.out.println("로그인을 하기 위해 PW를 입력하시오.");
				int PW = sc.nextInt();
				if (ID == 1234 && PW == 5678) {
					System.out.println("로그인에 성공 하였습니다.");
					System.out.println("게임을 시작합니다.");
					T = true;
					break;
				} else {
					System.out.println("로그인에 실패 하였습니다.");
				}
			} else if (Fir == 2) {
				System.out.println("종료 하였습니다.");
				break;
			}
		}
		;

		// 로그인 성공 후 게임을 시작.
		int lev = 1;
		int gol = 0;
		while (T) {
			System.out.println("1.사냥 2.종료");
			int Fir = sc.nextInt();

			// 사냥 시작 및 사냥 완료 문구.
			if (Fir == 1) {
				System.out.println("사냥을 시작합니다.");
				System.out.println("몬스터를 " + lev * 3 + "마리 사냥 하였습니다.");
				// 레벨업 문구
				for (int l = 1; l < lev; l++) {
					System.out.print("꧁");
				}
				System.out.print("레벨업");
				for (int l = 1; l < lev; l++) {
					System.out.print("꧂");
				}
				System.out.println("");
				lev++;
				// 레벨이 5의 배수일 때 보너스 주기.
				// 레벨이 5의 배수일 때 특정한 이벤트가 반복되기 떄문에 for문으로도 쓸 수 있다.
				if (lev == 5) {
					System.out.println(lev + "레벨을 달성하여 1000골드를 획득합니다.");
					gol = gol + 1000;
				} else if (lev == 10) {
					System.out.println(lev + "레벨을 달성하여 2000골드를 획득합니다.");
					gol = gol + 2000;
				} else if (lev == 15) {
					System.out.println(lev + "레벨을 달성하여 3000골드를 획득합니다.");
					gol = gol + 3000;
					System.out.println("현재 레벨 : " + lev);
					System.out.println("현재 골드 : " + gol);
					System.out.println("만렙을 달성하여 게임을 종료합니다.");
					break;
				}
				// 현재 레벨과 골드 출력하기
				System.out.println("현재 레벨 : " + lev);
				System.out.println("현재 골드 : " + gol);
				// 사냥을 종료
			} else if (Fir == 2) {
				System.out.println("현재 레벨 : " + lev);
				System.out.println("현재 골드 : " + gol);
				System.out.println("게임을 종료합니다.");
				break;
				// 다른 번호를 입력하였을 시 경고 문구.
			} else {
				System.out.println("⚠올바른 번호를 선택하시오.⚠");
			}
		}

//기본 중괄호	
	}
}
