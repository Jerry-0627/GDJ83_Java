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

		// 쓸 수 있지만 쓰지 말자는 신호로 가운데줄을 쳐준다.
		Integer i = new Integer("10");
		int num = 10;
		i = new Integer(num);

		// Integer.parseInt("10");
		// int n = Integer.parseInt("10"); 이런식 또는
		// Double.parseDouble("3.12");
		// Long.parseLong("10");

		// wrapper
		num = 10;
		// auto boxing
		Integer n1 = num;
		// 프리미티브 타입을 별다른 조치 없이 자동으로 다른 타입으로 감싼다는 것

		// auto unboxing
		num = n1;

		Double d1 = 3.12;

		// 굳이 3.12를 넣고 싶으면 3.12 는 더블이라는 프리미티브 타입인데, 이것을 형변환 해야함.
		n1 = (int) 3.12; // int로 형변환을 하게 되면 0.12는 버려짐

	}
}
