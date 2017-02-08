package com.project.bean;

public class BillHistory {
	private int billId;
	private int productId;
	private int quantity;
	private int discount;

	public BillHistory() {

	}

	public BillHistory(int billId, int productId, int quantity, int discount) {
		this.billId = billId;
		this.productId = productId;
		this.quantity = quantity;
		this.discount = discount;
	}

	public int getBill_id() {
		return billId;
	}

	public void setBill_id(int billId) {
		this.billId = billId;
	}

	public int getProd_id() {
		return productId;
	}

	public void setProd_id(int productId) {
		this.productId = productId;
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
