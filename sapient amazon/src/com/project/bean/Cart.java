package com.project.bean;

import java.util.Date;

public class Cart {
	private int cust_id;
	private int p_id;
	private int p_qty;
	private Date cart_date;
	
	public Cart(int cust_id, int p_id, int p_qty, Date cart_date) {
		this.cust_id = cust_id;
		this.p_id = p_id;
		this.p_qty = p_qty;
		this.cart_date = cart_date;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public int getP_qty() {
		return p_qty;
	}

	public void setP_qty(int p_qty) {
		this.p_qty = p_qty;
	}

	public Date getCartdate() {
		return cart_date;
	}

	public void setCartdate(Date cart_date) {
		this.cart_date = cart_date;
	}
}
