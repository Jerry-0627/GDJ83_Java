package com.jerry.s1.lang;

public class S5Main {
	public static void main(String[] args) {
		String name = " winter ";
		System.out.println(name.length());
		name = name.trim();

		System.out.println(name);
		System.out.println(name.length());

		name = "winter-24*서울";
		// 파싱(parsing) : 하나의 문자열을 여러개의 문자열로 나누는 작업.
		name = name.replace("*", "-");
		String[] datas = name.split("-");

		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
		// primitive 타입을 바꾸는 것
		String s = String.valueOf(10.2);
		System.out.println(s);

	}
}
