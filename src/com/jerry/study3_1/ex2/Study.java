package com.jerry.study3_1.ex2;

public class Study {

	public int[] add(int[] ar) {
		System.out.println(ar.length);
		int[] ar2 = new int[ar.length + 1];

		for (int i = 0; i < ar.length; i++) {
			ar2[i] = ar[i];
		}
		return ar2;
		// 배열은 한번 만든 크기는 변경 불가능하다.
		// 더 많은 칸수의 배열로 만들고 싶으면 새로운 배열을 선언할 수 밖예 없다.
		// ar을 여기서 선언해도 지역변수이기 때문에 메인에 있는 ar의 값은 바뀌지 않는다.
	}

	public int[] remove(int[] ar) {
		int[] RvAr = new int[ar.length - 1];

		for (int i = 0; i < RvAr.length; i++) {
			RvAr[i] = ar[i];
		}
		return RvAr;

	}

}
