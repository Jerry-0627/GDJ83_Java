package com.jerry.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {
	public static void main(String[] args) {
		// HomeWork @ 6.4
		// 1. 비번길이는 최소 6자 글자 이상
		// 2. 대소문자, 숫자 1개 이상이 있어야 함. isUpperCase, isLowerCase isDigit()
		Scanner sc = new Scanner(System.in);

		System.out.println("pw를 입력");
		String pw = sc.next();
		boolean b = true;

		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
//			System.out.println(ch);
//			System.out.println(Character.isUpperCase(ch));
			if (Character.isUpperCase(ch) == true) {
				System.out.println("대문자가 포함되어 있습니다.");
				b = true;
				break;
			} else {
				b = false;
			}
		}
		if (b == false) {
			System.out.println("대문자가 포함되어 있지 않습니다.");
		}
	}
}
