package com.project.bean;

public class Customer {
	private int cust_id;
	private String cust_fname;
	private String cust_lname;
	private String cust_email;
	private String cust_pass;
	private String cust_phone;
	
	public Customer(){
		
	}
	 
	public Customer (int cust_id, String cust_fname, String cust_lname, String cust_email, String cust_pass, String cust_phone) {
		this.cust_id = cust_id;
		this.cust_fname = cust_fname;
		this.cust_lname = cust_lname;
		this.cust_email = cust_email;
		this.cust_pass = cust_pass;
		this.cust_phone = cust_phone;
	}

	public int getcust_id() {
		return cust_id;
	}

	public void setcust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getcust_fname() {
		return cust_fname;
	}

	public void setcust_fname(String cust_fname) {
		this.cust_fname = cust_fname;
	}

	public String getcust_lname() {
		return cust_lname;
	}

	public void setcust_lname(String cust_lname) {
		this.cust_lname = cust_lname;
	}

	public String getcust_email() {
		return cust_email;
	}

	public void setcust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	public String getcust_pass() {
		return cust_pass;
	}

	public void setcust_pass(String cust_pass) {
		this.cust_pass = cust_pass;
	}

	public String getcust_phone() {
		return cust_phone;
	}

	public void setcust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
}
