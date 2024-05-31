package com.jerry.s2;

public class HighStudent extends MidStudent {
	// 자바는 단일 상속만 가능하다.
	private int science;

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

}
