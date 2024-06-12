package com.jerry.s4.io.ex1;

import java.util.List;

public class Ex1Main {
	public static void main(String[] args) {
		ReadStudy rs = new ReadStudy();
		try {
			List<MenuDTO> list = rs.read();
			for (MenuDTO d : list) {
				System.out.println(d.getMenuName());
				System.out.println(d.getPrice());
				System.out.println(d.getKcal());
				System.out.println("=============================================");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
