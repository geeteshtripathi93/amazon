package com.project.bean;

public class Product {
	private int p_id;
	private String p_name;
	private String p_cat;
	private String p_price;
	private int p_qty;
	private String p_disc;
	
	public Product(int p_id, String p_name, String p_cat, String p_price, int p_qty, String p_disc) {
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_cat = p_cat;
		this.p_price = p_price;
		this.p_qty = p_qty;
		this.p_disc = p_disc;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_cat() {
		return p_cat;
	}

	public void setP_cat(String p_cat) {
		this.p_cat = p_cat;
	}

	public String getP_price() {
		return p_price;
	}

	public void setP_price(String p_price) {
		this.p_price = p_price;
	}

	public int getP_qty() {
		return p_qty;
	}

	public void setP_qty(int p_qty) {
		this.p_qty = p_qty;
	}

	public String getP_disc() {
		return p_disc;
	}

	public void setP_disc(String p_disc) {
		this.p_disc = p_disc;
	}
}
