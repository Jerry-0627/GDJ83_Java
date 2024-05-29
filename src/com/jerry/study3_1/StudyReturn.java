package com.jerry.study3_1;

import java.util.Random;

public class StudyReturn {

	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수선언]) {}

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
