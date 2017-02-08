package com.project.bean;

import java.util.Date;

public class Bill {
	private int customerId;
	private int billId;
	private Date billDate;

	public Bill() {

	}

	public Bill(int customerId, int billId, Date billDate) {
		this.customerId = customerId;
		this.billId = billId;
		this.billDate = billDate;
	}

	public int getCust_id() {
		return customerId;
	}

	public void setCust_id(int customerId) {
		this.customerId = customerId;
	}

	public int getBill_id() {
		return billId;
	}

	public void setBill_id(int billId) {
		this.billId = billId;
	}

	public Date getBill_date() {
		return billDate;
	}

	public void setBill_date(Date billDate) {
		this.billDate = billDate;
	}
}
