package com.jerry.s5.date;

public class Single {

	// SingleTone 기법임.
	// 이 어플리케이션 내에서 이 객체는 딱 한개만 있다는 것을 보장하겠다는 것.
	private static Single single;

	int num = 10;

	private Single() {

	}

	// 멤버변수를 프라이빗으로 하면 접근이 안되서 게터 세터 씀
	// static은 객체를 만들지 않고 사용 가능

	public static Single get() {
		if (single == null) {
			Single.single = new Single();
		}
		return single.single;
	}

}
