package com.winter.s2.util.collections.ex3;

import java.util.List;

public class CollectionMain {
	public static void main(String[] args) {
		Collection1 c1 = new Collection1();
		Collection2 c2 = new Collection2();

		List<Integer> ar = c1.makeList(); // return으로 ArrayList(Integer)가 나옴
		c2.useList(ar);
		c2.useList(c1.makeList());

	}
}
