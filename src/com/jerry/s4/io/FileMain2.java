package com.jerry.s4.io;

import java.io.File;

public class FileMain2 {
	public static void main(String[] args) {
		// study2 폴더를 삭제
		// 안에 있는 것 다 삭제하고 난 다음에 study2 폴더 삭제.
		File file = new File("C:\\study2");
		File[] files = file.listFiles();

		for (File ar : files) {
			ar.delete();
		}

	}
}
