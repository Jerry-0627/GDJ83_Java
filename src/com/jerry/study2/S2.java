package com.jerry.study2;

public class S2 {
	public static void main(String[] args) {
		// 모으려고 하는 데이터 타입명[] 변수명 = new 모으려고 하는 데이터 타입명 [갯수]
		// 정수를 3개 모으려고 하는 배열
		int[] ar = new int[3];
		// ar은 int 배열 타입임
		// ar은 스택 영역에 있으며 참조 영역이라고 부른다. int [3]은 힙 영역에 있다. ar은 int [3]의 주소를 가져온다.
		// 정수 타입을 3개 모으려고 한다.
		// 변수를 선언하는 문법
		// 데이터타입 변수명;
		// String name; (변수명은 name, 변수명은 String)
		System.out.println(ar);
		String[] names = new String[2];
		System.out.println(names);
		// 자바는 주소를 잘 따라다녀야 한다.

	}
}
