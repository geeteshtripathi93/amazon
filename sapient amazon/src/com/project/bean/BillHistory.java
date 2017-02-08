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

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductQuantity() {
		return quantity;
	}

	public void setProductQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProductDisc() {
		return discount;
	}

	public void setProductDisc(int discount) {
		this.discount = discount;
	}
}
