package com.jerry.s1;

import com.jerry.s2.Korea;

public class S1Main {

	public static void main(String[] args) {
//		Test test = new Test();
//		test.num = 10;
//
//		Korea korea;
//
//		Member member = new Member();
//		member.name = "test";
//		member.age = 20;
		Korea korea = new Korea();

		korea.setPop(20);

		int p = korea.getPop();
		System.out.println(p);

	}
}
