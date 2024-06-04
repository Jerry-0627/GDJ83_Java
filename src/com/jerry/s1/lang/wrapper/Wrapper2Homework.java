package com.jerry.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2Homework {
	public static void main(String[] args) {
		// HomeWork @ 6.4
		// 1. 비번길이는 최소 6자 글자 이상
		// 2. 대소문자, 숫자 1개 이상이 있어야 함. isUpperCase, isLowerCase isDigit()
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		boolean pwUp = false;
		boolean pwLo = false;
		boolean pwDi = false;

		while (flag) {
			System.out.println("pw를 입력");
			String pw = sc.next();
			if (pw.length() < 6) {
				System.out.println("비밀번호의 길이는 최소 6자 이상입니다.");
			} else {

				for (int i = 0; i < pw.length(); i++) {
					char pwOne = pw.charAt(i);
					pwUp = Character.isUpperCase(pwOne);
					if (pwUp == true) {
						break;
					}
				}
				for (int i = 0; i < pw.length(); i++) {
					char pwOne = pw.charAt(i);
					pwLo = Character.isLowerCase(pwOne);
					if (pwLo == true) {
						break;
					}
				}
				for (int i = 0; i < pw.length(); i++) {
					char pwOne = pw.charAt(i);
					pwDi = Character.isDigit(pwOne);
					if (pwDi == true) {
						break;
					}
				}
				if (pwUp == true && pwLo == true && pwDi == true) {
					System.out.println("로그인에 성공 하였습니다.");
					flag = false;
				} else {
					System.out.println("비밀번호 조건을 충족 시키십시오.");
				}
			}
		}

// 기본

	}
}
