package com.winter.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BusinessCardService {
	// 명함의 내용을 추가할 것
	// 회사명, 이름, 직급, 레벨, 연락처

	private StringBuffer sb;
	private Scanner sc;

	public void BusCardService() {
		sb = new StringBuffer();
		sb.append("Google, JungMin, senior, 3, 01012345678,");
		sb.append("Naver, Lee MinJung, junior, 2, 01098765432,");
		sb.append("Kakao, Min LeeJung, Senior, 4, 01054329876,");
		sb.append("Toss, Lee JungMin, junior, 1, 01024374064");
		sc = new Scanner(System.in);
	}

	public ArrayList<BusinessCardDTO> init() {
		ArrayList<BusinessCardDTO> ar = new ArrayList<BusinessCardDTO>();

		String info = sb.toString();
		StringTokenizer st = new StringTokenizer(info, ",");

		while (st.hasMoreTokens()) {
			BusinessCardDTO dto = new BusinessCardDTO();
			dto.setCompany(st.nextToken());
			dto.setName(st.nextToken());
			dto.setRank(st.nextToken());
			dto.setLevel(Integer.parseInt(st.nextToken()));
			dto.setContact(Integer.parseInt(st.nextToken()));

			ar.add(dto);

		}

		return ar;
	}
}
