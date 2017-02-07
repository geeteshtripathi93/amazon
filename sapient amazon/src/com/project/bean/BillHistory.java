package com.project.bean;

public class BillHistory {
	private int bill_id;
	private int prod_id;
	private int p_qty;
	private int p_disc;
	
	public BillHistory(int bill_id, int prod_id, int p_qty, int p_disc) {
		this.bill_id = bill_id;
		this.prod_id = prod_id;
		this.p_qty = p_qty;
		this.p_disc = p_disc;
	}

	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public int getP_qty() {
		return p_qty;
	}

	public void setP_qty(int p_qty) {
		this.p_qty = p_qty;
	}

	public int getP_disc() {
		return p_disc;
	}

	public void setP_disc(int p_disc) {
		this.p_disc = p_disc;
	}
}
