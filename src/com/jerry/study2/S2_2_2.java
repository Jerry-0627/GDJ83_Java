package com.jerry.study2;

import java.util.Scanner;

public class S2_2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		String[] names = null;
		int[] stunum = null;
		int[] koreans = null;
		int[] englishs = null;
		int[] maths = null;
		int[] totals = null;
		double[] avgs = null;

		while (flag) {
			System.out.println("다음 중 원하는 선택지를 고르시오.");
			System.out.println("1.학생 정보 입력 2.학생 정보 출력 3.원하는 학생 정보 출력 4.정렬 5.종료");
			int sel = sc.nextInt();

			switch (sel) {
			// 1. 학생 정보 입력
			case 1:
				System.out.println("학생 수를 입력하세요.");
				int num = sc.nextInt();

				names = new String[num];
				stunum = new int[num];
				koreans = new int[num];
				englishs = new int[num];
				maths = new int[num];
				totals = new int[num];
				avgs = new double[num];

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
				break;

			// 학생 정보 출력
			case 2:
				System.out.println("이름\t 번호\t 국어\t 영어\t 수학\t 총점\t 평균\t");
				for (int i = 0; i < names.length; i++) {
					System.out.print(names[i] + "  \t");
					System.out.print(stunum[i] + "번\t");
					System.out.print(koreans[i] + "   \t");
					System.out.print(englishs[i] + "   \t");
					System.out.print(maths[i] + "  \t");
					System.out.print(totals[i] + "  \t");
					System.out.println(avgs[i] + "  \t");
				}
				break;

			// 원하는 학생 정보 출력
			case 3:
				System.out.println("정보를 원하는 학생의 번호를 입력하세요.");
				int num2 = sc.nextInt();
				int num3 = num2 - 1;
				System.out.println("이름\t 번호\t 국어\t 영어\t 수학\t 총점\t 평균\t");
				System.out.print(names[num3] + "  \t");
				System.out.print(stunum[num3] + "번\t");
				System.out.print(koreans[num3] + "   \t");
				System.out.print(englishs[num3] + "   \t");
				System.out.print(maths[num3] + "  \t");
				System.out.print(totals[num3] + "  \t");
				System.out.println(avgs[num3] + "  \t");
				break;

			// 정렬
			case 4:
				for (int i = 0; i < avgs.length - 1; i++) {
					for (int j = 0; j < avgs.length - i - 1; j++) {
						// 현재 요소가 다음 요소보다 작으면 교환합니다.
						if (avgs[j] < avgs[j + 1]) {
							// avgs 배열의 값들을 교환합니다.

							String temp0 = names[j];
							names[j] = names[j + 1];
							names[j + 1] = temp0;

							double temp1 = avgs[j];
							avgs[j] = avgs[j + 1];
							avgs[j + 1] = temp1;

							int temp2 = stunum[j];
							stunum[j] = stunum[j + 1];
							stunum[j + 1] = temp2;

							temp2 = koreans[j];
							koreans[j] = koreans[j + 1];
							koreans[j + 1] = temp2;

							temp2 = englishs[j];
							englishs[j] = englishs[j + 1];
							englishs[j + 1] = temp2;

							temp2 = maths[j];
							maths[j] = maths[j + 1];
							maths[j + 1] = temp2;

							temp2 = totals[j];
							totals[j] = totals[j + 1];
							totals[j + 1] = temp2;

						}
					}
				}
				System.out.println("이름\t 번호\t 국어\t 영어\t 수학\t 총점\t 평균\t");
				for (int i = 0; i < names.length; i++) {
					System.out.print(names[i] + "  \t");
					System.out.print(stunum[i] + "번\t");
					System.out.print(koreans[i] + "   \t");
					System.out.print(englishs[i] + "   \t");
					System.out.print(maths[i] + "  \t");
					System.out.print(totals[i] + "  \t");
					System.out.println(avgs[i] + "  \t");
				}
				break;

			// 종료
			case 5:
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			}
		}

//기본 괄호

	}
}
