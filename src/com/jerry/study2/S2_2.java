package com.jerry.study2;

import java.util.Scanner;

public class S2_2 {
	public static void main(String[] args) {
		// 학생 수를 입력 받아서 학생 수 만큼 이름과 국어 점수, 영어 점수, 수학 점수를 입력 받고 출력하자.
		//
		Scanner sc = new Scanner(System.in);

		// 1. 학생 정보 입력 2. 학생 정보 출력 3. 프로그램 종료
		int num = 0;

		while (true) {
			System.out.println("1. 학생 정보 입력 2. 학생 정보 출력 3. 프로그램 종료");
			int sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("학생 수를 입력하세요.");
				int NNN = sc.nextInt();
				num = NNN;
				System.out.println(num);
			}
			String[] names = new String[num];
			int[] stunum = new int[num];
			int[] koreans = new int[num];
			int[] englishs = new int[num];
			int[] maths = new int[num];
			int[] totals = new int[num];
			double[] avgs = new double[num];
			if (sel == 1) {
				for (int i = 0; i < names.length; i++) {
					System.out.println("학생의 이름을 입력하세요.");
					String name = sc.next();
					names[i] = name;
					stunum[i] = i + 1;
					System.out.println("국어 점수를 입력하세요.");
					int korean = sc.nextInt();
					koreans[i] = korean;
					System.out.println("영어 점수를 입력하세요.");
					int english = sc.nextInt();
					englishs[i] = english;
					System.out.println("수학 점수를 입력하세요.");
					int math = sc.nextInt();
					maths[i] = english;

					totals[i] = koreans[i] + englishs[i] + maths[i];
					avgs[i] = (double) totals[i] / 3;
				}
			} else if (sel == 2) {
				System.out.println("이름\t 번호\t 국어\t 영어\t 수학\t 총점\t 평균\t");
				for (int i = 0; i < num; i++) {
					System.out.print(names[i] + "  \t");
					System.out.print(stunum[i] + "번\t");
					System.out.print(koreans[i] + "   \t");
					System.out.print(englishs[i] + "   \t");
					System.out.print(maths[i] + "  \t");
					System.out.print(totals[i] + "  \t");
					System.out.println(avgs[i] + "  \t");
				}
			} else {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("Hello");

				break;
			}
		}

//		System.out.println("학생 수를 입력하세요.");
//		int num = sc.nextInt();
//
//		String[] names = new String[num];
//		int[] stunum = new int[num];
//		int[] koreans = new int[num];
//		int[] englishs = new int[num];
//		int[] maths = new int[num];
//		int[] totals = new int[num];
//		double[] avgs = new double[num];
//
//		for (int i = 0; i < names.length; i++) {
//			System.out.println("학생의 이름을 입력하세요.");
//			String name = sc.next();
//			names[i] = name;
//			stunum[i] = i + 1;
//			System.out.println("국어 점수를 입력하세요.");
//			int korean = sc.nextInt();
//			koreans[i] = korean;
//			System.out.println("영어 점수를 입력하세요.");
//			int english = sc.nextInt();
//			englishs[i] = english;
//			System.out.println("수학 점수를 입력하세요.");
//			int math = sc.nextInt();
//			maths[i] = english;
//
//			totals[i] = koreans[i] + englishs[i] + maths[i];
//			avgs[i] = (double) totals[i] / 3;
//		}
//
//		System.out.println("이름\t 번호\t 국어\t 영어\t 수학\t 총점\t 평균\t");
//		for (int i = 0; i < num; i++) {
//			System.out.print(names[i] + "  \t");
//			System.out.print(stunum[i] + "번\t");
//			System.out.print(koreans[i] + "   \t");
//			System.out.print(englishs[i] + "   \t");
//			System.out.print(maths[i] + "  \t");
//			System.out.print(totals[i] + "  \t");
//			System.out.println(avgs[i] + "  \t");
//		}

	}

}
