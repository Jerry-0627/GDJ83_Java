package com.jerry.s4;

public abstract class Brid {
	// abstract가 붙은 class는 미완성된 클래스다 라는 의미이다
	//
	// 이렇게 되면 Bird bird = new Bird();로 객체를 만들지 못한다.
	// 이 클래스를 상속 받아서 사용하라는 의미이다.

	int age;

	public abstract void fly();
	// 미완성인 메서든데, 내용은 상속 받아서 쓰시오 라는 뜻.
	// 선언부만 있고 바디가 없는 미완성 구조이다. 만약 바디가 있으면 오류가 난다. 이것은 미완성이기 때문에 상속 받아서 사용해야 한다.

	public class Animal {
		int age;
		String name;

		public void sleep() {

		}

	}

}
