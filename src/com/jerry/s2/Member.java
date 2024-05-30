package com.jerry.s2;

public class Member {

	private String name;
	private int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}// 이런식으로 만들 수는 있지만, 수정을 할 수는 없음.

	// setter getter
	public void setAge(int age) {
		// if..
		this.age = age;
	}

	public int getAge(int age) {
		// if..
		return this.age; // 이땐 this를 생략할 수 있음.

	}

}
