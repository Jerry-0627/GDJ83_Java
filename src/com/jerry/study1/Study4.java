package com.jerry.study1;

import java.util.Scanner;

public class Study4 {

	public static void main(String [] args) {
		//키보드와 연결 준비
		//한번만 해도됨.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");//0 이상의 정수를 입력 받음.
		
		int num = sc.nextInt();
		
		int num1 = num/4*10;
		char ch = (char)num1;
		
				
		int result = num/4*10 + num%4;
		
		
		System.out.println(num);		
		System.out.println("프로그램을 종료합니다.");
		System.out.println(result);

		
		//1 -> 1
		//2 -> 2
		//3 -> 3
		
		//4 -> 10
		//5 -> 11
		//7 -> 13
		
		//8 -> 20
		//9 -> 21
		//10-> 22
		

		
	}
	
}
