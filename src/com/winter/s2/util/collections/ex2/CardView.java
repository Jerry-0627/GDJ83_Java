package com.winter.s2.util.collections.ex2;

import java.util.ArrayList;

public class CardView {
	public void View(ArrayList<CardDTO> ar) {
		for(CardDTO dto: ar) {
	        System.out.print("회사명: " + dto.getCompany() + "\t");
	        System.out.print("이름: " + dto.getName() + "\t");
	        System.out.print("직급: " + dto.getRank() + "\t");
	        System.out.print("레벨: " + dto.getLevel() + "\t");
	        System.out.println("연락처: " + dto.getContact() + "\t");
		}
	}
	
	public void View(CardDTO dto) {
        System.out.print("회사명: " + dto.getCompany() + "\t");
        System.out.print("이름: " + dto.getName() + "\t");
        System.out.print("직급: " + dto.getRank() + "\t");
        System.out.print("레벨: " + dto.getLevel() + "\t");
        System.out.println("연락처: " + dto.getContact() + "\t");
	}
}
