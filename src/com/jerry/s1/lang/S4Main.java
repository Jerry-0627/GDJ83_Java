package com.jerry.s1.lang;

import java.util.Scanner;

public class S4Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = "computer Science";
		String result = name.substring(3);
		// puter Science
		String result2 = name.substring(3, 5);
		// pu
		System.out.println(result);
		System.out.println(result2);

		System.out.println("파일명을 입력하세요. (확장자 포함)");
		// jpg, png, gif, jpeg, jiff
		// 파일명 입력 시 이미지 파일인지 확인하기.

		name = sc.next();
		int dot = name.indexOf('.') + 1;
		String result3 = name.substring(dot);

		String[] images = { "jpg", "png", "gif", "jpeg", "jiff" };
		boolean flag = true;

		for (int i = 0; i < images.length; i++) {
			if (result3.equals(images[i])) {
				System.out.println("이미지 파일입니다.");
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("이미지 파일이 아닙니다.");
		}

//기본
	}

}
