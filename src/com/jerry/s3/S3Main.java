package com.jerry.s3;

import com.jerry.s5.AirPlane;

public class S3Main {

	public static void main(String[] args) {
		// 배열 선언 공식
		// 타입

		Tiger tiger = new Tiger();
		tiger.age = 5;
		tiger.name = "호돌이";
		tiger.power = 500;

		Penguin penguin = new Penguin();
		penguin.age = 3;
		penguin.name = "팽수";
		penguin.wing = 2;

		Animal animal = tiger;
		// 위가 is a 관계이다. 타이거 타입은(is a) 애니멀 타입이다.
		animal = penguin;
		// animal 안에 타이거와 팽귄을 넣겠다.
		System.out.println(animal.name);
		// System.out.println(animal.power);는 안된다. 부모에서 power를 알지 못하기 때문에. 접근을 하지 못한다.

		// tiger = animal;는 안된다.
		tiger = (Tiger) animal;

		// Tiger[] dropship = new Tiger[8];
		// 위 배열은 타이거를 모으려하는 배열이기 때문에 다른 애들은 태우지 못한다.
		// 그럼 다른 애들을 태우기 위해서는 어떻게 해야하나?
		Animal[] dropship = new Animal[8];

		// 타입을 변경하는 방법 형변환(프리미티브 타입 끼리만 가능 불리언 빼고), 폴리모프(레퍼러슨끼리 형변환)
		dropship[0] = tiger;
		dropship[1] = penguin;

		Tiger ani = (Tiger) dropship[0];
		// 다른 클래스에서 있는 것을 가지고 올 떄 멤버변수를 쓰든 상속을 쓰든 해야하는데
		// A is a B 가 말이 되면 멤버변수
		// A has a B가 말이 되면 상속.

		Eagle eagle = new Eagle();
		AirPlane airPlane = new AirPlane();

		Fly fly = eagle;
		fly = airPlane;

	}
}
