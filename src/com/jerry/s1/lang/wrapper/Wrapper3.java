package com.jerry.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		String jumin = sc.next();

		// 000627-1234567
		// 1. 성별을 검증하자. (1, 3은 남자 2, 4는 여자 5, 6은 외국인)
		char ch = jumin.charAt(7);
		if (ch == '1' || ch == '3') {
			System.out.println("남자입니다.");
		} else if (ch == '2' || ch == '4') {
			System.out.println("여자입니다.");
		} else if (ch == '5' || ch == '7') {
			System.out.println("외국인 남자입니다.");
		} else if (ch == '6' || ch == '8') {
			System.out.println("외국인 여자입니다.");
		}

		// 2. 나이를 계산, 나이 : 2024년 - 출생년으로 계산

		int age = 1900;
		String SBirth = jumin.substring(0, 2);
		int IBirth = Integer.parseInt(SBirth);

		if (ch == '1' || ch == '2' || ch == '5' || ch == '6') {
			System.out.println(2024 - (age + IBirth) + "살입니다.");
		} else if (ch == '3' || ch == '4' || ch == '7' || ch == '8') {
			age = 2000;
			System.out.println(2024 - (age + IBirth) + "살입니다.");
		}

		// 3. 주민번호 유효성 검증
		// 9 5 1 2 2 6 - 1 2 3 4 5 6 7(검증용 숫자)
		// *2 *3 *4 *5 *6 *7 - *8 *9 *2 *3 *4 *5
		// 18 15 4 10 12 42 8 18 6 12 20 30
		// 총합을 11로 나눈 나머지를 구하기
		// 122%11 = 1
		// 나머지를 11로 뺀 결과값을 검증용 숫자와 같은지 비교
		// 11-1 == 10
		//
		// *2 *3 *4 *5 *6 *7 *8 *9 *2 *3 *4 *5
		// 0 0 0 30 12 49 24 0 10 21 4 5
		// 155%11 = 1 //n
		// 11-1 == 10 //n2
		// 10%10 = 0 검증용 숫자와 일치한다.

		jumin = jumin.replace("-", "");
		int sum = 0;
		int j = 2;
		for (int i = 0; i < 12; i++) {
			int Ich = Integer.parseInt(String.valueOf(jumin.charAt(i)));
//			int Ich = jumin.charAt(i) - '0';
			if (j > 9) {
				j = 2;
			}
			sum = sum + Ich * j;
			j++;
		}

		int n = 11 - sum % 11;
		int Ich = Integer.parseInt(String.valueOf(jumin.charAt(12)));
//		int Ich = jumin.charAt(12) - '0';
		if (n % 10 == Ich || n == Ich) {
			System.out.println("검증용 숫자와 일치합니다.");
		} else {
			System.out.println("검증용 숫자와 일치하지 않습니다.");
		}

//기본
	}
}
