package com.project.dao;

import java.sql.Statement;
import java.util.List;

import com.project.bean.Cart;
import com.project.bean.Product;

public interface CartDao {

	boolean addToCart(Cart cart);
	boolean removeFromCart(Cart cart);
	boolean update(Cart cart);
	List<Product> viewCart(int Customer_id);
}

