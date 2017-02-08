package com.project.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import com.project.bean.Bill;
import com.project.bean.BillDetails;
import com.project.bean.CartDetails;
import com.project.bean.Product;
import com.project.helper.CreateConnection;

public class BillDaoImpl implements BillDao {
	
	private CreateConnection createCon = new CreateConnection();
	private Connection connection = null;
	private ResultSet rs = null;
	private ResultSet rs2 = null;
	private PreparedStatement pstmt = null;
	
	@Override
	public Bill generateBill(int customerId) {
		// TODO Auto-generated method stub
	
		
		return null;
	}

	@Override
	public List<BillDetails> getBillDetails(int customerId) throws ClassNotFoundException, SQLException {

		List<BillDetails> billList = new LinkedList<BillDetails>();
		connection = createCon.getCon();
		Statement statement = connection.createStatement();
		rs= statement.executeQuery("select bill_id, bill_date from bill where customer_id="+customerId);
		BillDetails billdetail= null;
		double totalPrice=0.0;
		pstmt= connection.prepareStatement("select product_id,product_quantity,product_discount,product_price from bill_history where bill_id=?");
		while(rs.next()){
			pstmt.setInt(1, rs.getInt("bill_id"));
			rs2= pstmt.executeQuery();
			while(rs2.next()){
			billdetail= new BillDetails();
			billdetail.setCustomerId(customerId);
			billdetail.setBillId(rs.getInt(1));
			billdetail.setProductId(rs2.getInt("product_id"));
			billdetail.setPrice(rs2.getDouble("product_price"));
			billdetail.setDiscount(rs2.getInt("product_discount"));
			billdetail.setQuantity(rs2.getInt("product_quantity"));
			billdetail.setDate(rs.getDate("bill_date"));
			totalPrice= (rs2.getDouble("product_price") * rs2.getInt("product_quantity")) *(100-rs2.getInt("product_discount")/100);
			billdetail.setTotalPrice(totalPrice);
			billList.add(billdetail);
			}
		}
		return billList;
	}

	@Override
	public List<BillDetails> getAllBillDetails() throws SQLException, ClassNotFoundException {
		List<BillDetails> billList = new LinkedList<BillDetails>();
		connection = createCon.getCon();
		Statement statement = connection.createStatement();
		rs= statement.executeQuery("select customer_id, bill_id, bill_date from bill order by customer_id,bill_date ");
		BillDetails billdetail= null;
		double totalPrice=0.0;
		pstmt= connection.prepareStatement("select product_id,product_quantity,product_discount,product_price from bill_history where bill_id=?");
		while(rs.next()){
			pstmt.setInt(1, rs.getInt("bill_id"));
			rs2= pstmt.executeQuery();
			while(rs2.next()){
			billdetail= new BillDetails();
			billdetail.setCustomerId(rs.getInt("customer_id"));
			billdetail.setBillId(rs.getInt(1));
			billdetail.setProductId(rs2.getInt("product_id"));
			billdetail.setPrice(rs2.getDouble("product_price"));
			billdetail.setDiscount(rs2.getInt("product_discount"));
			billdetail.setQuantity(rs2.getInt("product_quantity"));
			billdetail.setDate(rs.getDate("bill_date"));
			totalPrice= (rs2.getDouble("product_price") * rs2.getInt("product_quantity")) *(100-rs2.getInt("product_discount")/100);
			billdetail.setTotalPrice(totalPrice);
			billList.add(billdetail);
			}
		}
		return billList;
	}

	
	
	
	
	
}
