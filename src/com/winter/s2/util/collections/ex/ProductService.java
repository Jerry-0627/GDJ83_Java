package com.winter.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductService {

	private StringBuffer sb;
	private Scanner sc;

	public ProductService() {
		sb = new StringBuffer();
		sb.append("50000, 아이폰, 50,");
		sb.append("45000, 갤럭시, 100,");
		sb.append("30000, 노키아, 20");
		sc = new Scanner(System.in);
	}

	public ArrayList<ProductDTO> init() {
		ArrayList<ProductDTO> ar = new ArrayList<ProductDTO>();

		String info = sb.toString();
		StringTokenizer st = new StringTokenizer(info, ",");

		while (st.hasMoreTokens()) {
			ProductDTO dto = new ProductDTO();
			dto.setPrice(Integer.parseInt(st.nextToken().trim()));
			dto.setName(st.nextToken().trim());
			dto.setStock(Integer.parseInt(st.nextToken().trim()));

			ar.add(dto);
		}

		return ar;
	}

	// init 메서드를 만들고 파싱해서, 프로덕트 객체에 각 멤버변수에 맞는 값은ㄹ 넣어줘
	// 얘네를 모아야 하니까, 어레이 리스트에 만들어 집어 넣고 리턴하자.

	// 기존의 가방에다가 새상품을 추가하려고 한다.
	// sc 로 받아오기
	// 새로운 콜렉션 만들기
	// 기존 콜렉션에 새로운 콜렉션에 받아온 것 추가로 집어 넣기
	// 메인함수 수정하기
	public void addProduct(ArrayList<ProductDTO> ar) {
		ProductDTO productDTO = new ProductDTO();
		System.out.println("상품명 입력");
		productDTO.setName(sc.next());
		System.out.println("상품 가격 입력");
		productDTO.setPrice(sc.nextInt());
		System.out.println("상품 재고 입력");
		productDTO.setStock(sc.nextInt());
		ar.add(productDTO);

	}

	// Chpater 3
	// 기존의 가방을 받아서 제품을 삭제하려고 한다.
	// 물건의 이름을 입력 받아서 그 이름과 일치하는 제품을 삭제한다.
	// return할 필요가 없다. (기존의 주소를 받아서 사용하면 되기 떄문이다.)
	public int removeProduct(ArrayList<ProductDTO> ar) {
		ProductDTO productDTO = new ProductDTO();
		System.out.println("삭제할 제품의 이름을 입력하세요.");
		String name = sc.next();

		int result = 0;
		for (int i = 0; i < ar.size(); i++) {
			if (name.equals(ar.get(i).getName())) {
				ar.remove(i);
				result = 1;
				break;
			}
		}
		return result;
	}
}
