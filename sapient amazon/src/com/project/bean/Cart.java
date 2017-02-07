package com.project.bean;

import java.util.Date;

public class Cart {
	private int customerId;
	private int productId;
	private int quantity;
	private Date cartDate;
	
	public Cart() {
		
	}
	
	public Cart(int customerId, int productId, int quantity, Date cartDate) {
		this.customerId = customerId;
		this.productId = productId;
		this.quantity = quantity;
		this.cartDate = cartDate;
	}

	public int getCust_id() {
		return customerId;
	}

	public void setCust_id(int customerId) {
		this.customerId = customerId;
	}

	public int getP_id() {
		return productId;
	}

	public void setP_id(int productId) {
		this.productId = productId;
	}

	public int getP_qty() {
		return quantity;
	}

	public void setP_qty(int quantity) {
		this.quantity = quantity;
	}

	public Date getCartdate() {
		return cartDate;
	}

	public void setCartdate(Date cartDate) {
		this.cartDate = cartDate;
	}
}
