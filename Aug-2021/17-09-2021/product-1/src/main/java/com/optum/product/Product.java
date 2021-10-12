package com.optum.product;

public class Product {
	
	private String productName;
	private String productType;
	private int productId;
	private int productprice;
	
	
	public Product() {
		super();
	}


	public Product(String productName, String productType, int productId, int productprice) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.productId = productId;
		this.productprice = productprice;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public int getProductprice() {
		return productprice;
	}


	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}


	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productType=" + productType + ", productId=" + productId
				+ ", productprice=" + productprice + "]\n";
	}
	
	
}