package com.jerry.study1;

import java.util.Scanner;

public class Study8 {
	
	public static void main(String [] args) {
		//이중 for
		
		//
		
		// 1. 단발모드 => 탕 * 30
		//    단발 or 점사 선택
		// 2. 점사모드 => 탕 * 10
		//    단발 or 점사 선택
		// System.out.println("1.단발 2.점사");
		// Scanner sc = new Scanner(System.in);
		//		
		
//		for(int j=0; j<3; j++) {
//			System.out.println("1.단발 2.점사");
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();
//			
//			if(num == 1) {
//				for(int i=0;i<31;i++) {
//					System.out.println("탕 " + i);
//				}
//			}else if(num==2) {
//				for(int i=0; i<11; i++) {
//					System.out.println("탕 탕 탕 " + i);
//				}
//			}else {
//				System.out.println("기능고장.");
//				j--;
//			}
//
//			if(j==2) {
//				System.out.println("탄알이 모두 소진 되었습니다.");	
//			}
//		}

		Scanner sc = new Scanner(System.in);
		int tan = 3;
		int j = 30;
		
		for(int i=0; i<= j;i++) {
			System.out.println("1.단발 2.점사");
			int num = sc.nextInt();
			System.out.println(num);
		}
	}
}
