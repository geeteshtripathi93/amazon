package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.bean.Admin;
import com.project.helper.CreateConnection;

public class AdminDaoImpl implements AdminDao {

	private CreateConnection createCon = new CreateConnection();
	 private Connection connection =null;
	 private ResultSet rs = null;
	 private PreparedStatement pstmt = null;
	
	@Override
	public boolean validation(String email, String password) throws ClassNotFoundException, SQLException {
		connection = createCon.getCon();
		pstmt = connection.prepareStatement("SELECT * FROM ADMIN_INFO WHERE EMAIL=? AND PASSWORD=?");
		pstmt.setString(1, email);
		pstmt.setString(2, password);
		int row = pstmt.executeUpdate();
		 connection.close();
		 if( row>0)
			 return true;
			 else
				 return false;
	}

	@Override
	public boolean update(Admin admin) throws SQLException {

		pstmt = connection.prepareStatement("UPDATE ADMIN_INFO SET PASSWORD=? WHERE EMAIL=?");
		pstmt.setString(1, admin.getMail());
		pstmt.setString(2, admin.getPassword());
		int row = pstmt.executeUpdate();
		 connection.close();
		 if( row>0)
			 return true;
			 else
				 return false;}

}
