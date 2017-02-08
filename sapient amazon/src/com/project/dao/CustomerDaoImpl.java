package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.bean.Customer;
import com.project.helper.CreateConnection;

public class CustomerDaoImpl implements CustomerDao {

	private CreateConnection createCon = new CreateConnection();
	private Connection connection = null;
	private ResultSet rs = null;
	private PreparedStatement pstmt = null;

	@Override
	public boolean insert(Customer customer) throws ClassNotFoundException, SQLException {
		connection = createCon.getCon();
		Statement statement = connection.createStatement();
		rs = statement.executeQuery("SELECT MAX(CUSTOMER_ID) FROM CUSTOMER_INFO");
		rs.next();
		int cId = rs.getInt(1);
		customer.setCustomerId((cId + 1));
		pstmt = connection.prepareStatement("INSERT INTO CUSTOMER VALUES(?,?,?,?,?,?)");
		pstmt.setInt(1, customer.getCustomerId());
		pstmt.setString(2, customer.getFirstName());
		pstmt.setString(3, customer.getLastName());
		pstmt.setString(4, customer.getEmail());
		pstmt.setString(5, customer.getPassword());
		pstmt.setString(6, customer.getPhoneNumber());
		int row = pstmt.executeUpdate();
		connection.close();
		if (row > 0)
			return true;
		else
			return false;

	}

	@Override
	public boolean validation(String email, String password) throws ClassNotFoundException, SQLException {

		pstmt = connection.prepareStatement("SELECT * FROM CUSTOMER_INFO WHERE EMAIL=? AND PASSWORD=?");
		pstmt.setString(1, email);
		pstmt.setString(2, password);

		int row = pstmt.executeUpdate();
		connection.close();
		if (row > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean update(Customer customer) throws ClassNotFoundException, SQLException {

		pstmt = connection.prepareStatement(
				"UPDATE CUSTOMER_INFO SET FIRST_NAME=?, LAST_NAME=?,PASSWORD=? , PHONE_NUMBER=? WHERE MAIL=?");
		pstmt.setString(1, customer.getFirstName());
		pstmt.setString(2, customer.getLastName());
		pstmt.setString(3, customer.getPassword());
		pstmt.setString(4, customer.getPhoneNumber());
		pstmt.setString(5, customer.getEmail());
		int row = pstmt.executeUpdate();
		connection.close();
		if (row > 0)
			return true;
		else
			return false;

	}

}
