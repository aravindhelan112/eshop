package com.ecommerce.products;

public class Product {
	private int productid;
	private String productName;
	private double productprice;
	private int productweight;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productid, String productName, double productprice, int productweight) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productprice = productprice;
		this.productweight = productweight;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	public int getProductweight() {
		return productweight;
	}
	public void setProductweight(int productweight) {
		this.productweight = productweight;
	}
	
	
}
