package com.jerry.study3_1;

public class ObjectStudy1 {
	public static void main(String[] args) {
		StudyReturn sr = new StudyReturn();
		// int result = sr.t2(); 는 리턴 타입이 맞지 않아서(void) 리턴이 안됨
		// String n = sr.t1();도 타입이 맞지 않음
		int n = sr.t1();

		int sal = 5000000;
		// int sal은 스택 영역
		// 아래 sal은 위에 있는 int의 sal과 다르다. 중복 선언이 아니다.
		sr.t4(sal);
		// t4에 있는 sal이라는 변수의 타입은 int이며 메모리 영역의 스택 영역에 있는 지역 변수이다.
		// 멤버 변수는 힙에 만들어진다.
		// 선언이 메서드에서 되어 있기 떄문에 스택에 만들어진다.

		System.out.println(sal);

		Test test = new Test();
		test.level = 1;
		sr.t5(test);
		System.out.println(test.level);
		Test test2 = sr.t5(test);
		System.out.println(test2.level);

	}

}
