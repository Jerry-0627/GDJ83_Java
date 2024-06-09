package com.winter.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CardService {
	private StringBuffer sb;
	private Scanner sc;
	
	public CardService() {
		sb = new StringBuffer();
		sb.append("구글, 준원, 상무, 5, 01011112222,");
		sb.append("퀄컴, 혜옥, 이사, 4, 01033334444,");
		sb.append("애플, 정민, 부장, 3, 01055556666,");
		sb.append("네이버, 하은, 팀장, 2, 01077778888,");
		sb.append("카카오, 지우, 과장, 1, 01099991112");
		Scanner sc = new Scanner(System.in);
	}
	
	public ArrayList<CardDTO> init() {
		StringTokenizer st = new StringTokenizer(sb.toString(), ",");
		ArrayList<CardDTO> ar = new ArrayList<CardDTO>();
		
		while(st.hasMoreTokens()) {
			CardDTO dto = new CardDTO();
			dto.setCompany(st.nextToken().trim());
			dto.setName(st.nextToken().trim());
			dto.setRank(st.nextToken().trim());
			dto.setLevel(Integer.parseInt(st.nextToken().trim()));
			dto.setContact(Integer.parseInt(st.nextToken().trim()));
			
			ar.add(dto);
		}
		return ar;
	}
	// 이름으로 명함 정보 찾기
	public CardDTO findByName(ArrayList<CardDTO> ar, String name) {
		
		for(CardDTO dto : ar) {
			if(dto.getName().equals(name.trim())) {
				return dto;
			}
		}
		return null;
	}
	
	// 명함 정보 추가하기
	public ArrayList<CardDTO> addInformation(ArrayList<CardDTO> ar) {
		sc = new Scanner(System.in);
		CardDTO dto = new CardDTO();
		System.out.println("추가할 회사명을 입력하시오.");
		String company = sc.next();
		dto.setCompany(company);
		System.out.println("추가할 이름을 입력하시오.");
		String name = sc.next();
		dto.setName(name);
		System.out.println("추가할 직급을 입력하시오.");
		String rank = sc.next();
		dto.setRank(rank);
		System.out.println("추가할 레벨을 입력하시오.");
		int level = sc.nextInt();
		dto.setLevel(level);
		System.out.println("추가할 연락처를 입력하시오.");
		int contact = sc.nextInt();
		dto.setContact(contact);
		ar.add(dto);
		
		return ar;
	}
}
