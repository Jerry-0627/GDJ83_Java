package com.jerry.s1.lang.wrapper;

public class Wrapper1 {

	public static void main(String[] args) {
		// 자바의 기본 단위는 클래스
		// int long ...도 원래는 클래스였는데 primitive 타입이됨.
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);

		System.out.println(Double.BYTES);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

	}
}
