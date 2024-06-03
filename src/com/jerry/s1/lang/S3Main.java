package com.jerry.s1.lang;

import java.util.Scanner;

public class S3Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하시오.");
		String name = sc.next();
		boolean flag = true;
		int i = 0;

		while (flag) {
			int result = name.indexOf('f', i);
			if (result == -1) {
				flag = false;
			} else {
				System.out.println(result);
				i = result + 1;
			}
		}
		System.out.println("종료");

	}
}
