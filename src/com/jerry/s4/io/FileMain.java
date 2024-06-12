package com.jerry.s4.io;

import java.io.File;

public class FileMain {
	public static void main(String[] args) {
		// bit(byte) -> 문자 -> 문자열
		// 파일의 정보를 담고 있는 객체가 필요

		File file = new File("C:\\study");

		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getName());
		// length는 파일의 크기를 얘기함
		System.out.println(file.length());

		System.out.println("1=============================================================");
		// file = new File("C:\\study", "test.txt");
		file = new File(file, "sub");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());

		if (!file.exists()) {
			file.mkdir();
		}

		file = new File("c:\\study\\sub2\\student");
		file.mkdirs();

		file = new File("c:\\study\\test.txt");
		file.delete();

		file = new File("c:\\study\\sub2");
		file.delete();

		file = new File("c:\\study");

		String[] list = file.list();
		for (String li : list) {
			System.out.println(li);
		}

		System.out.println("2============================================================");
		file.listFiles();
		File[] list2 = file.listFiles();
		for (File li2 : list2) {
			if (li2.isDirectory()) {
				System.out.println("폴더");
			} else if (li2.isFile()) {
				System.out.println("파일");
			}
		}

	}
}
