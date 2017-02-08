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

<<<<<<< HEAD
	public int getProductQuantity() {
=======
	public int getQuantity() {
>>>>>>> branch 'master' of https://github.com/geeteshtripathi93/amazon.git
		return quantity;
	}

<<<<<<< HEAD
	public void setProductQuantity(int quantity) {
=======
	public void setQuantity(int quantity) {
>>>>>>> branch 'master' of https://github.com/geeteshtripathi93/amazon.git
		this.quantity = quantity;
	}

<<<<<<< HEAD
	public int getProductDisc() {
=======
	public int getDiscount() {
>>>>>>> branch 'master' of https://github.com/geeteshtripathi93/amazon.git
		return discount;
	}

<<<<<<< HEAD
	public void setProductDisc(int discount) {
=======
	public void setDiscount(int discount) {
>>>>>>> branch 'master' of https://github.com/geeteshtripathi93/amazon.git
		this.discount = discount;
	}
}
