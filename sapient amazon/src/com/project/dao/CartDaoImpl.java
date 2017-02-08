package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.project.bean.Cart;
import com.project.bean.Product;
import com.project.helper.CreateConnection;

public class CartDaoImpl implements CartDao {
	
	 private CreateConnection createCon = new CreateConnection();
	 private Connection connection =null;
	 private ResultSet rs = null;
	 private PreparedStatement pstmt = null;
	@Override
	public boolean addToCart(List<Cart> cartList) throws ClassNotFoundException, SQLException {
		int count=0;
		connection = createCon.getCon();
		for(Cart cart:cartList){
			
		pstmt = connection.prepareStatement("INSERT INTO CART VALUES(?,?,?,?)");
		pstmt.setInt(1, cart.getCustomerId());
		pstmt.setInt(2, cart.getProductId());
		pstmt.setInt(3, cart.getQuantity());
		pstmt.setDate(4, cart.getCartDate());
		count++;
		}
		if(count==cartList.size())
			return true;
		else
		return false;
	}

	@Override
	public boolean removeFromCart(Cart cart) throws SQLException{
		int customerId=cart.getCustomerId();
		int productId =cart.getProductId();

		Statement stmt=connection.createStatement();
			 String sql = "DELETE FROM cart" +"WHERE product_id ="+productId+"AND"+"customer_Id="+customerId;
		int rows=stmt.executeUpdate(sql);
		if(rows>0){
			return true;
		}
			return false;
			
			
			
		} 


	@Override
	public boolean update(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> viewCart(int Customer_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
