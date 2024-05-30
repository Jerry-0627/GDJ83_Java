package com.jerry.study3_1.ex3;

public class Car {
	String color;
	String brand;
	String company;

	// 참조 변수 this
	// 객체 생성 시 값이 대입되는 변수
	// this는
	// this는 각각의 객체 내에서만 사용 가능
	// this는 만들어진 자기 자신의 객체의 주소를 담고 있다.
	// this는 생략이 가능하다.

	public void info() { // car는 매개변수고, 레퍼런스 타입, 중괄호 안에 선언된 지역변수, 참조 변수이다.
		System.out.println("info");
		System.out.println(this);
		System.out.println(this.color);
		System.out.println(brand);
		this.go();
	}

	public void go() {
		System.out.println(this.company);

	}

}
