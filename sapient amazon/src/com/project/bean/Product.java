package com.project.bean;

public class Product {
	private int productId;
	private String Name;
	private String category;
	private double price;
	private int quantity;
	private int discount;
	
	public Product(){
		
	}
	
	public Product(int productId, String Name, String category, double price, int quantity, int discount) {
		this.productId = productId;
		this.Name = Name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
	}

	public int getP_id() {
		return productId;
	}

	public void setP_id(int productId) {
		this.productId = productId;
	}

	public String getP_name() {
		return Name;
	}

	public void setP_name(String Name) {
		this.Name = Name;
	}

	public String getP_cat() {
		return category;
	}

	public void setP_cat(String category) {
		this.category = category;
	}

	public double getP_price() {
		return price;
	}

	public void setP_price(double price) {
		this.price = price;
	}

	public int getP_qty() {
		return quantity;
	}

	public void setP_qty(int quantity) {
		this.quantity = quantity;
	}

	public int getP_disc() {
		return discount;
	}

	public void setP_disc(int discount) {
		this.discount = discount;
	}
}
