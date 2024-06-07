package com.winter.s2.util.token;

import java.util.StringTokenizer;
// 다른 패키지에 있기 때문에 임포트 해야함
// 

public class TokenStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String names = "winter, 25, iu, 30, hani, 29, 철수, 18, 영희, 20";

		StringTokenizer st = new StringTokenizer(names, ",");
		// , 기준으로 names를 분리하겠다.

		System.out.println(st.countTokens());

		// 이때는 for문 잘 안쓰고, while문을 자주 씀

		while (st.hasMoreTokens()) {
			// 리턴 타입 boolean, 즉 토큰이 없을 때 까지 하자
			String name = st.nextToken();
			String ahe = st.nextToken();
			System.out.println(name.trim());
		}
	}

}
