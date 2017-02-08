package com.project.bean;

import java.sql.Date;
import java.util.GregorianCalendar;

public class Cart {
	private int customerId;
	private int productId;
	private int quantity;
	private GregorianCalendar cartDate;

	public Cart() {

	}

	public Cart(int customerId, int productId, int quantity, GregorianCalendar cartDate) {
		super();
		this.customerId = customerId;
		this.productId = productId;
		this.quantity = quantity;
		this.cartDate = cartDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getCartDate() {
		return cartDate;
	}

	public void setCartDate(GregorianCalendar gregorianCalendar) {
		this.cartDate = gregorianCalendar;
	}

}
