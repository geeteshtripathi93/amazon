package com.project.bean;

import java.util.Date;

public class Bill {
	private int cust_id;
	private int bill_id;
	private Date bill_date;
	
	public Bill(int cust_id, int bill_id, Date bill_date) {
		this.cust_id = cust_id;
		this.bill_id = bill_id;
		this.bill_date = bill_date;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public Date getBill_date() {
		return bill_date;
	}

	public void setBill_date(Date bill_date) {
		this.bill_date = bill_date;
	}
}
