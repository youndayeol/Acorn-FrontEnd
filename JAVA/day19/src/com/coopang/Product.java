package com.coopang;

public class Product {
	Long ProductId;
	String ProductName;
	Long Price;

	public Product(Long ProductId, String ProductName, Long Price) {
		this.ProductId = ProductId;
		this.ProductName = ProductName;
		this.Price = Price;
	}

	public Long getProductId() {
		return ProductId;
	}

	public String getProductName() {
		return ProductName;
	}

	public Long getPrice() {
		return Price;
	}

}
