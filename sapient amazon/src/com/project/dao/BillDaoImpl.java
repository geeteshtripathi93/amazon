package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.project.bean.Bill;
import com.project.bean.BillDetails;
import com.project.helper.CreateConnection;

public class BillDaoImpl implements BillDao {
	private CreateConnection createCon = new CreateConnection();
	private Connection connection = null;
	private ResultSet rs = null;
	private ResultSet rs2 = null;
	private ResultSet rs3 = null;
	private PreparedStatement pstmt = null;
	Bill bill=new Bill();
	

	@Override
	public Bill generateBill(int customerId)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	
		connection = createCon.getCon();
		Statement statement = connection.createStatement();
		rs = statement.executeQuery("SELECT PRODUCT_ID,PRODUCT_QUANTITY FROM CART WHERE CUSTOMER_ID="+customerId);
		int productId=0;
		 int productQuantity=0;
		 int productDiscount=0;
		double productPrice=0;
		int productQuantityOriginal=0;
		int rows=0;
		while(rs.next()){
			 productId=rs.getInt("PRODUCT_ID");
			 productQuantity=rs.getInt("PRODUCT_QUANTITY");
			rs2 = statement.executeQuery("SELECT PRODUCT_PRICE,PRODUCT_DISCOUNT,PRODUCT_QUANTITY FROM PRODUCT_INFO WHERE PRODUCT_ID="+productId);
			
			while(rs2.next()){
		 productPrice=rs2.getDouble("PRODUCT_PRICE");
			 productDiscount=rs2.getInt("PRODUCT_DISCOUNT");
			productQuantityOriginal=rs2.getInt("PRODUCT_QUANTITY");
			}
		
		rs3 = statement.executeQuery("SELECT MAX(BILL_ID) FROM BILL");
		rs3.next();
		int billId = (rs3.getInt(1)+1);
				
		 pstmt=connection.prepareStatement("insert into bill_history  values(?,?,?,?,?)"); 
		 pstmt.setInt(1,billId);
		 pstmt.setInt(2,productId);
		 pstmt.setInt(3,productQuantity);
		 pstmt.setInt(4,productDiscount);
		 pstmt.setDouble(5,productPrice);
		 rows=pstmt.executeUpdate();
		
		long millis=System.currentTimeMillis();  
	       java.sql.Date date=new java.sql.Date(millis);  	
					
			bill.setCustomerId(customerId);
			bill.setBillId(billId);
			bill.setBillDate(date);
			
			int newProductQuantity=productQuantityOriginal-productQuantity;

			pstmt = connection.prepareStatement(
					"UPDATE PRODUCT_INFO SET PRODUCT_QUANTITY="+newProductQuantity+"where PRODUCT_ID="+productId);
			pstmt.executeUpdate();
			connection.close();
			
		}	
			if(rows>0){
						return bill;
			}
		
			return null;
	
	}

	@Override
	public List<BillDetails> getBillDetails(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BillDetails> getAllBillDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
}
