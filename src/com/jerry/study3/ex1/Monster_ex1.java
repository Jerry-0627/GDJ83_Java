package com.jerry.study3.ex1;

public class Monster_ex1 {
	public static void main(String[] args) {
		Monster A = new Monster();

		A.hp = 100;
		A.lev = 20;
		A.exp = 30;
		A.tri = "oak";
		A.name = "oak-1";

		System.out.println(A.hp);
		System.out.println(A.lev);
		System.out.println(A.exp);
		System.out.println(A.tri);
		System.out.println(A.name);

		Ax W1 = new Ax();
		W1.pow = 35;
		W1.ran = 15;
		W1.dur = 10;
		W1.enf = 5;
		W1.name = "맛있는 도끼";

		System.out.println(W1.pow);
		System.out.println(W1.ran);
		System.out.println(W1.dur);
		System.out.println(W1.enf);
		System.out.println(W1.name);

		A.weapon = W1;

		System.out.println(A.weapon.name);

		W1 = new Ax(); // 새롱ㄴ 데이터에 값을 대입
		W1.name = "황금도끼";

		System.out.println(W1.name);

		System.out.println(A.weapon.name);

		Monster A2 = new Monster();
		A2.weapon = W1;

	}
}
