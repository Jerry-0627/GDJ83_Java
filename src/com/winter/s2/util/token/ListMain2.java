package com.winter.s2.util.token;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar = new ArrayList<String>();
		// ArrayList<>의 <>는 타입에 제한을 주는 것. 타입의 안정성을 확보한 것.
		// E : 변수
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		// <> 안에 Int 넣으면 안됨. 이유는 ?
		ar2.add(10);

		ar.add("frist");
//		ar.add(2);
//		ar.add('c');
//		ar.add(true);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		// String name = ar.get(0); 라고 하면 에러가 뜸.
		// 들어갈 때 object타입으로 들어갔기 때문임. 떄문에 위와 같이 쓰려면
		// String name = (String)ar.get(0); 과 같이 형변환을 해줘야함.

		String name = (String) ar.get(0);
	}

}
