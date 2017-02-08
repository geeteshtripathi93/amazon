package com.project.dao;

import java.sql.Statement;
import java.sql.SQLException;
import java.util.List;

import com.project.bean.Cart;
import com.project.bean.Product;

public interface CartDao {

		boolean addToCart(Cart cart) throws ClassNotFoundException, SQLException;
	boolean removeFromCart(Cart cart)throws SQLException;
	boolean update(Cart cart);
	List<Product> viewCart(int Customer_id);
}

