package com.jerry.s1.lang;

import java.util.Scanner;

public class S2Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Object obj1 = new Object();
		Object obj2 = new Object();

		boolean flag = obj1.equals(obj2);
		System.out.println(flag);

		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1 == t2);

		t1.age = 9;

		flag = t2.equals(t1);
		System.out.println(flag);

		String name = "winter";
		// 위와 같이 한번 만들어지면 불변이다.
		System.out.println("이름 입력");
		String name2 = sc.next();
		String name3 = "winter";
		System.out.println(name == name2);
		System.out.println(name == name3);
		// equal은 주소에 있는 값을 비교하는 것이고, name == name3와 같은 것은 주소를 비교하는 것이다.
		System.out.println(name.equals(name2));
		// 문자열은 불변인데, 두개의 문자열을 더하면 새로운 객체를 만들어서 그 주소를 반환한다.
		// 문자열이 같다 틀리다를 비교할 땐 오버라이딩해서 equals로 비교해라.

	}

}
