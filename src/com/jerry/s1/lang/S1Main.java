package com.jerry.s1.lang;

import java.util.Scanner;

public class S1Main {
	public static void main(String[] args) {
//		Object obj = new Object(); //기본 생성자가 있어서 이렇게 가능
//		Scanner sc = new Scanner(System.in);
//		//import 안해도 되는 것
//		// 같은 패키지 내에 있는 것.
//		// Object라는 클래스는 java.lang 패키지에 있음
//		// import를 생략할 수 있는 것.
//		// 1. 같은 패키지 내에 있는 클래스
//		// 2. java.lang 패키지 내의 클래스를 사용할 때
//		StringBuffer sb = new StringBuffer();
//		// StringBuffer는 import를 하지 않아도됨. java.lang에 있기 때문이다.
		Scanner sc = new Scanner(System.in);

		Object obj = new Object();
		Object obj2 = new Object();
		String n = new String("winter");
		String n2 = "winter";
		// new String("winter");과 "winter";는 같다.

		System.out.println(obj.toString());
		// 모든 클래스는 object 타입, 참조변수를 찍으면 내부적으로 toString매서드가 자동으로 호출된다.
		System.out.println(n == n2);

		// 맴버에 접근하는 방법 : 참조변수명.맴버들
		// 참조변수 (주소를 담고 있는 변수, String 클래스)
		char ch = n.charAt(0); // 문자열에서 한글자를 빼오니까 string 타입이 아니라 char 타입.
		System.out.println(ch);

		int l = n.length();
		System.out.println(l);

		System.out.println("문자열 입력");
		n = sc.next();

		for (int i = 0; i < n.length(); i++) {
			char ch2 = n.charAt(i);
			System.out.println(ch2);

		}
		System.out.println(n.length() * 1000 + "원 입니다.");
	}

}
