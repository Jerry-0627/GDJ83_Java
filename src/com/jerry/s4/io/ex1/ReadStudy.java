package com.jerry.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReadStudy {
	public List<MenuDTO> read() throws Exception {
		// info.txt 파일 읽어오기
		// 1. 읽어서 파싱 후 DTO들을 만든 후 리턴
		ArrayList<MenuDTO> ar = new ArrayList<MenuDTO>();
		File file = new File("C:\\study", "info2.txt");
		FileReader fr = null;
		BufferedReader br = null;

		fr = new FileReader(file);
		br = new BufferedReader(fr);

		while (true) {
			MenuDTO dto = new MenuDTO();
			String st = br.readLine();
			if (st == null) {
				break;
			}
			StringTokenizer stn = new StringTokenizer(st, ",");
			while (stn.hasMoreTokens()) {
				dto.setMenuName(stn.nextToken().trim());
				dto.setPrice(Integer.parseInt(stn.nextToken().trim()));
				dto.setKcal(Integer.parseInt(stn.nextToken().trim()));
				ar.add(dto);
			}
		}
		br.close();
		fr.close();

		return ar;
	}
}
