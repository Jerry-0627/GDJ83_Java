package com.jerry.study3_1.ex3;

public class ExMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.color = "Red";
		car.brand = "카니발";
		car.company = "기아";

		Car car2 = new Car();
		car2.color = "Black";
		car2.brand = "A7";
		car2.company = "Audi";

//		System.out.println(car);
//		car.info();
//
//		System.out.println(car2);
//		car2.info();

		Cal cal = new Cal();
		cal.hap(2, 3L);

	}

}
