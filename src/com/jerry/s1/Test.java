package com.jerry.s1;

public class Test {

	int num; // 접근 지정자 종류는 4개, 접근 지정자 안쓰면 default, default의 접근은 같은 패키지 내에서 사용 가능
	private String name; // private는 같은 클래스 내에서만 쓸 수 있음

	public void info() {
		System.out.println(this.name);
	}

}
