package com.jerry.study2;

import java.util.Scanner;

public class S2_1 {
	public static void main(String[] args) {
		int[] ar = new int[5];
		// int 타입의 배열을 만들건데, 5개를 만들겠다.

		// 각 인덱스 번호의 칸에 값을 키보드로 입력 받아서 저장하기
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ar.length; i++) {
			System.out.println("a[" + i + "] 에 값을 입력하시오.");
			int num = sc.nextInt();
			ar[i] = num;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println("a[" + i + "] = " + ar[i]);
		}

		System.out.println("배열의 크기를 입력");
		int num2 = sc.nextInt();
		int[] nums = new int[num2]; // 뒤에 new int[]
		System.out.println(num2);
	}

}
