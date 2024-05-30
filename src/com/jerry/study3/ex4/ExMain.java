package com.jerry.study3.ex4;

public class ExMain {
	public static void main(String[] args) {

		// new 생성자호출
		Car car = new Car(); // 생성자
		car.info();

		Car car2 = new Car();
		car2.info();

		// Bike bike = new Bike();로 하면 에러가 뜨는데, 매개 변수가 없는 생성자를 호출하겠다는 뜻이다. 그런데
//		public Bike(String color, int price) {// 기본 생성자. public 쓰고 바로 클래스명
//			this.color = color;
//			this.price = price;
		// 가 입렫되어 있으면 매개변수가 있는 생성자가 이미 있기 때문에 컴파일러는 기본 생성자를 자동으로 만들어주지 않는다.
		// 만약 기본 생성자를 만들고 싶으면 Bike 클래스의 위 코드를 지워주면 자동으로 생성된다.
		Bike bike = new Bike("", 4);

	}
}
