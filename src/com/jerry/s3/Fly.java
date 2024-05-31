package com.jerry.s3;

public interface Fly extends Landing {

	// 상수 접근지정자는 public만 가능
	public final static int NUM = 1;
	String NAME = "abc";// name이 기울어져 있는데 스태틱이 들어가 있다는 뜨시앋.
	// interface에 있는 변수는 String NAME과 같이 써야 하는데, public final static은 생각 가능하다.
	// 기본으로 있다고 인식된다.

	// 추상 메서드
	// 접근지정자 public abstract
	public abstract void t1();

	public int t2();

	abstract String t3(int num);

	void t4(); // public abstract 다 빼도 된다.

	public abstract void flyAble();
}
