package com.jerry.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력");
		String filename = sc.next();

		// 데이터는 문자열, 문자열을 파일에 적으려면 문자로 분해해서 다시 01로 만든 뒤 내보내야함
		File file = new File("C:\\study", filename + ".txt");
		FileWriter fw = null;

		try {
			fw = new FileWriter(file, true);
			while (true) {
				System.out.println("입력해");
				String s = sc.next();

				if (s.equals("e") || s.equals("E")) {
					System.out.println("종료하겠습니다.");
					break;
				}

				fw.write(s + "\r\n");
				// e 또는 E가 입력되면 종료.
			}
		} catch (IOException e) { // IOException 오류가 발생한다라는 의미.
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close(); // 오류가 뜨는데, fw.close하지 못하면 어떡할거야? 라는 뜻이다.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}
}
