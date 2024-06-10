package com.winter.s3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int num = 10;

			System.out.println("숫자 입력");
			int num2 = sc.nextInt();

			System.out.println(num / num2);
			// throw new ArithmeticException();
			// 0을 입력하면 위 코드가 실행됨.
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("숫자 이외는 값을 입력할 수 없습니다.");
		} catch (Exception e) {// 다형성 개념 사용한 것

		} catch (Throwable e) {// Throwable은 else 느낌임.

		}

		Exception1 ex1 = new Exception1();
		try {
			ex1.ex1(5);
		} catch (ArithmeticException e) {
			e.printStackTrace(); // e.printStackTrace()는 왜 문제가 발생하는지를 나태내줌.
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("프로그램이 종료");

	}
}
