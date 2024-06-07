package com.winter.s2.util.collections.ex2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BusinessCardService {
	// 명함의 내용을 추가할 것
	// 회사명, 이름, 직급, 연락처

	private StringBuffer sb;
	private Scanner sc;

	public void BusinessCardService() {
		sb = new StringBuffer();
		sb.append("Google, Lee JungMin, senior, 3, 01012345678,");
		sb.append("Naver, Lee MinJung, junior, 2, 01098765432,");
		sb.append("Kakao, Min LeeJung, Senior, 4, 01054329876,");
		sb.append("Toss, JungMin, junior, 1, 01024374064,");
		sc = new Scanner(System.in);
	}

	public void init() {
		String info = sb.toString();
		StringTokenizer st = new StringTokenizer(info, ",");

	}
}
