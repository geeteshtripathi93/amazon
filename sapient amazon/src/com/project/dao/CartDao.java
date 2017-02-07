package com.project.dao;

import java.util.List;

public interface CartDao {

	boolean addToCart(Cart c);
	boolean removeFromCart(Cart c);
	boolean update(Cart c);
	List<Product> viewCart(int Customer_id);
}
