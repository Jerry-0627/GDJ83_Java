package com.winter.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {
	public static void main(String[] args) {

		ProductService productService = new ProductService();
		ArrayList<ProductDTO> ar = productService.init();
//		productService.addProduct(ar);
		int result = productService.removeProduct(ar);

		if (result > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}

		for (int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i).getPrice() + "\t");
			System.out.print(ar.get(i).getName() + "\t");
			System.out.println(ar.get(i).getStock() + "\t");

		}

	}
}
