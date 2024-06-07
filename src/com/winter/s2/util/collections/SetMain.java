package com.winter.s2.util.collections;

import java.util.HashSet;

import com.winter.s2.util.collections.ex.ProductDTO;

public class SetMain {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();

		hs.add("first");
		hs.add("second");
		hs.add("apple");
		hs.add("second");
		// 똑같은 값을 넣으면 똑같은 것 하나는 버린다.

		System.out.println(hs);

		HashSet<ProductDTO> hs2 = new HashSet<ProductDTO>();

		ProductDTO productDTO = new ProductDTO();
		ProductDTO productDTO2 = new ProductDTO();

		hs2.add(productDTO);
		hs2.add(productDTO2);

		System.out.println(hs2);

	}
}
