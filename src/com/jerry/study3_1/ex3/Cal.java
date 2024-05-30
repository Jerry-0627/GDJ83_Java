package com.jerry.study3_1.ex3;

public class Cal {

	// Method Overloading
	// 같은 이름의 메서드를 여러개 만든는 것 (New)
	// 매개변수의 타입의 조합이나 갯수가 다르면 성립
	// 메서드의 내용은 달라도 상관없음

	public void hap(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	public void hap(int n1, long n2) {
		System.out.println(n1 * n2);
	}

	public int hap(long n1, int n2) {
		System.out.println(n1 + n2);
		return 0;
	}

	public void println(int n) {
		// 시스템 console에 출력
	}

	public void println(String n) {
		// 시스템 console에 출력
	}
}
