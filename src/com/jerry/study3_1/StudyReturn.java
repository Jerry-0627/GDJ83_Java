package com.jerry.study3_1;

import java.util.Random;

public class StudyReturn {

	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수선언]) {}

	// 매개변수 선언
	// 매개변수는 0개 이상 선언할 수 있다. 0개도 된다는 뜻.
	// 매개 변수를 여러개 선언할 땐 ,로 구분하며 호출 할 때 매개 변수의 개수 만큼 순서에 맞춰서 호출하여야 한다.
	public Test t5(Test t) {
		// Test라는 클래스도 매개변수로 받을 수 있다.
		System.out.println(t.level);
		t.level = 200;
		t = new Test(); // 이부분을 잘 이해하지 못했다.
		t.level = 500;

		return t;
	}

	public void t4(int sal) {
		// 월급을 받아서 3.3%를 제외한 실수령액 계산
		// 실수령액 = 월급 - 월급*0.033
		// 호출하는 쪽에서 데이터(월급)을 줘야함. 이를 매개변수로 입력 받음
		// 소수점을 받을 수 있는 타입은 float거ㅣ double인데 float을 사용하려면 0.033f 와 같은 형식으로 사용해야 한다.
		// 아래 식은 0.033이 있고 f가 없기 떄문에 double 타입이다
		double result = sal - sal * 0.033;
		System.out.println(result);

		sal = 100;
	}

	// 리턴이 없을 때 void를 쓰는 것.
	// public void t1() {
	public int t1() {

		int num = 3;
		if (num % 2 == 0) {
			return 0;
		}
		int num2 = 6;
		int result = num * num2;

		// 메서드를 종료할 때 리턴을 만나거나
		// 리턴의 데이터갯수는 딱 하나만 가능
		// 리턴 타입의 제한은 없음
		// return num, num2 이런식으로 안됨
		return result;
	}

	public void t2() { // void는 리턴 없음.
		Random random = new Random();
		// 0이상 10 미만의 정수 하나를 랜덤하게 리턴해준다.
		int num = random.nextInt(10);
		if (num % 2 == 0) {
			return; // 그 즉시 종료하겠다는 의미.
		} else {
			System.out.println(num);
		}
	}
}
