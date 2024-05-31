package com.jerry.s1;

public class S1Main {

	public static void main(String[] args) {

		Object obj = new Object();
		Test test = new Test();
		String str = test.toString();
		System.out.println(str);
		System.out.println(test.toString());

		System.out.println(String.CASE_INSENSITIVE_ORDER);

		String n = new String("Winter");
		String name = "winter";
		// 위에 둘이 같은거임

		System.out.println(name.toString());
		System.out.println(name);
		// 값이 나오는데 오버라이딩 됐다는 뜻이다.
	}

}
