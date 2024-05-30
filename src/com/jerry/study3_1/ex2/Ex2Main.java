package com.jerry.study3_1.ex2;

public class Ex2Main {

	public static void main(String[] args) {

		// 호출하려면, 멤버를 사용하려면 해당 멤버에 있는 클래스의 객체를 만들어야 한다.
		Study study = new Study();
		int[] ar = { 1, 2, 3, 4, 5, 6 };

		ar = study.remove(ar);// 배개변수로 보내는 값을 인자값이라고 한다. ar에 들어갈 변수명에 집착하지 마라. 값을 보낼 뿐이다.(?)
		System.out.println(ar.length);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);

		}

	}

}
