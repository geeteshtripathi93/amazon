package com.project.dao;
import java.sql.SQLException;
import java.util.List;
import com.project.bean.Cart;
import com.project.bean.CartDetails;

public interface CartDao {
	boolean addToCart(List<Cart> cartList) throws ClassNotFoundException, SQLException;
	boolean removeFromCart(Cart cart)throws SQLException;
	List<CartDetails> viewCart(int Customer_id)throws SQLException, ClassNotFoundException;
}

