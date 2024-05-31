package com.jerry.s4;

public class S4Main {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.brand = "Samsung";
		tv.price = 500;
		tv.point = 50;
		tv.size = 100;

		Computer com = new Computer();
		com.brand = "Apple";
		com.price = 300;
		com.point = 30;
		com.cpu = "M3";

		Phone phone = new Phone();
		phone.brand = "LG";
		phone.price = 150;
		phone.point = 15;
		phone.color = "Pink";

		Customer customer = new Customer();
		customer.don = 1000;
		customer.point = 0;

		customer.buy(com);
	}

}
