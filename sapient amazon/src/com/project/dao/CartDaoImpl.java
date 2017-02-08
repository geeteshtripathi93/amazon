package com.project.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.project.bean.Cart;
import com.project.bean.CartDetails;
import com.project.bean.Product;
import com.project.helper.CreateConnection;

public class CartDaoImpl implements CartDao {
	
	 private CreateConnection createCon = new CreateConnection();
	 private Connection connection =null;
	 private ResultSet rs = null;
	 private PreparedStatement pstmt = null;
	@Override
	public boolean addToCart(Cart cart) throws ClassNotFoundException, SQLException {
		
		connection = createCon.getCon();
		pstmt = connection.prepareStatement("INSERT INTO CART VALUES(?,?,?,?)");
		pstmt.setInt(1, cart.getCustomerId());
		pstmt.setInt(2, cart.getProductId());
		pstmt.setInt(3, cart.getQuantity());
		pstmt.setDate(4, cart.getCartDate());
		
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
	public List<CartDetails> viewCart(int customerId) throws SQLException, ClassNotFoundException {
		
		List<CartDetails> listOfItem = new LinkedList<CartDetails>();
		connection = createCon.getCon();
		Date date;
		int pid, quantity, discount;
		Statement stmt=connection.createStatement();
		String sql = "SELECT  product_id,product_quantity,cart_date FROM CART WHERE CUSTOMER_ID="+customerId;
		connection = createCon.getCon();
		rs= stmt.executeQuery(sql);
		ResultSet product = null;
		while(rs.next()){
			pid=(int)rs.getLong("product_id");
			quantity=((int)(rs.getLong("product_quantity")));
			date=rs.getDate("cart_date");  
			product= stmt.executeQuery("select product_name, product_category,product_price,"
			+ "product_discount from product_info where product_id="+pid);
	   		double price = product.getDouble(3);
	   		discount=  product.getInt(4);
  			double totalPrice = (quantity*price)*(100-discount)/100;			
			listOfItem.add(new CartDetails(pid, product.getString(1), price, quantity, discount, totalPrice, product.getString(2),date));
		}
		
		return listOfItem;
	}

}
