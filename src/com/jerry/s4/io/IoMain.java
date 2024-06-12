package com.jerry.s4.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoMain {
	public static void main(String[] args) {
		// 추상클래스 bit를 다룸
		InputStream is = System.in;
		// 문자(Char)를 다룸
		InputStreamReader ir = new InputStreamReader(is);
		// String을 다룸
		BufferedReader br = new BufferedReader(ir);
		// 여기까지 하면 입력 받을 준비가 끝남.
		System.out.println("입력하세요");
		// 한줄 읽어오라는 얘기.
		// 예외 처리 방법 try catch 또는 메서드 선언부에 throws 선언
		String s = "";
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
	}
}
