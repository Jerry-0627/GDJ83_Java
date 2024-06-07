package com.winter.s2.util.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain3 {
	public static void main(String[] args) {
		// set은 절대 중복적인 값은 허용하지 않으며 순서 유지 x 한개씩 꺼내야 함.
		HashSet<Integer> ar = new HashSet<Integer>();
		ar.add(10);
		ar.add(8);
		ar.add(16);

		// 애는 get해서 하나 꺼내는 메서드가 없다.
		Iterator<Integer> ir = ar.iterator();

		while (ir.hasNext()) {
			Integer num = ir.next();
			System.out.println(num);

		}

		System.out.println(ar);
	}
}
