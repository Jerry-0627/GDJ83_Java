package com.winter.s2.util.collections.ex;

public class ProductDTO {

	// 멤버변수는전부다 private
	// private는 외부에ㅓ 접근 불가, 따라서 세터게터

	private Integer price;
	private String name;
	private Integer stock;

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
