package com.jerry.study3.ex4;

public class Car {
	String color = "White";
	String brand;
	String company;
	int price = 1000;

	// 생성자 (Contributor)

	{
		// 인스턴스 초기화 블럭 {}만 이루어져 있다.
		price = 200;
	}

	public Car() { // 기본 생성자

		// 그냥 this는 참조변수, 괄호가 붙은 this() 매서드, 자기자신의 또 다른 생성자를 호출
		// this()는 생성자 내에서 가장 첫줄에 입력해야 한다.
		this(2500);
		System.out.println("자동차가 만들어집니다");
//		this.color = "Black";
//		this.brand = "K3";
//		this.company = "Kia";
//		this.price = 2500; 

	}

	public Car(int price) { // 이름은 같지만 매개 변수가 다르면 오버로딩이 성립한다., 이것은 생성자 오버로딩이라고 부른다.
		this(price, "black");
		// int price는 지역 변수
//		this.price = price;
//		this.color = "Black";
//		this.brand = "K3";
//		this.company = "Kia";
		// pirce는
	}

	public Car(int price, String color) {
		this(price, color, "Kia");
//		this.price = price;
//		this.color = color;
//		this.brand = "K3";
//		this.company = "Kia";
	}

	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.company = "Kia";
	}

	public void info() { // car는 매개변수고, 레퍼런스 타입, 중괄호 안에 선언된 지역변수, 참조 변수이다.
		System.out.println("info");
		// this.Car();는 안된다 생성자 Car는 new와 함께 쓰여야 한다.
		System.out.println(this.color);
		System.out.println(brand);
		System.out.println(price);
	}

	public void go() {
		System.out.println(this.company);

	}

}
