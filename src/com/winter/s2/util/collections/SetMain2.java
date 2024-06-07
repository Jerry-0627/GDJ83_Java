package com.winter.s2.util.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또 번호를 뽑는데 중복되는 번호가 없어야 한다.
		Random random = new Random();

		ArrayList<Integer> list = new ArrayList<Integer>();

//		while (list.size() != 6) {
//			
//		}

		int num = random.nextInt(45) + 1;

		int[] ar = new int[6];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = random.nextInt(45) + 1;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		HashSet<Integer> hs = new HashSet<Integer>();

		while (hs.size() != 6) {
			hs.add(random.nextInt(45) + 1);
		}
		System.out.println(hs);

		// 중복 제거하는 것은 배열 및 어레이리스트에서 해보기

	}

}
