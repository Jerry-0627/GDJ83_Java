package com.winter.s2.util.collections.ex2;

import java.util.ArrayList;

public class BusinessCardMain {
	// 명함 받는 것

	// 명함 관리 프로그램 하나 만들기.
	// 기존의 명함
	// 새로운 명항 추가
	// 기존 명할 검색 후 삭제
	// 명함의 내용 : 이름, 전화번호, 이메일, 회사명, 직책,
	public static void main(String[] args) {
		BusinessCardService BusCardService = new BusinessCardService();
		ArrayList<BusinessCardDTO> ar = BusCardService.init();

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i).getCompany());
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getRank());
			System.out.println(ar.get(i).getLevel());
			System.out.println(ar.get(i).getContact());
		}

	}

}
