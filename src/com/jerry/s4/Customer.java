package com.jerry.s4;

public class Customer {
	int don;
	int point;

	// 매개변수 하나만 선언
	public void buy(Product t) {
		// 물건의 가격과 물건의 포인트
		// 가진 돈에서 물건의 가격을 빼야함.
		// 가진 포인트에 물건의 포인트를 더해.
		this.don = this.don - t.price;
		this.point = this.point + t.point;

		System.out.println(don);
		System.out.println(point);

	}
}
