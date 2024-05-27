package com.jerry.study1;

import java.util.Scanner;

public class Study7 {

	public static void main(String [] args) {
		//3과목의 점수를 입력 받아서 합계 구하기
		Scanner sc = new Scanner(System.in);
		int sum =0;
		
		//입력 받아서 합계를 내자.
		for(int i=0;i<3;i++) {
			
			int num = sc.nextInt();
			sum = sum+num;
			//sum+=num;
		}
		
		
		int c = 97;
		for(int i='a';i<'z';i++) {
		//primitive 타입은 자동 형변환이 된다.
			System.out.println((char)i);
			c++;
		}
		
	}
	
}
