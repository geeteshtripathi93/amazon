package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.project.bean.Category;
import com.project.helper.CreateConnection;

public class CategoryDaoImpl implements CategoryDao {
	CreateConnection cd = new CreateConnection();
	Connection con = null;
	PreparedStatement pstmt = null;
	
	
	
	
	public List<Category> viewCategory(Category category){
		
	
		return null;
		
	}

	@Override
	public boolean insertCategory(String categoryname)throws SQLException,ClassNotFoundException {
		pstmt = con.prepareStatement("insert into category values(?)");
		pstmt.setString(1,categoryname);
		int rows = pstmt.executeUpdate();
		con.close();
		if (rows > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteCategory(String categoryname) {
		// TODO Auto-generated method stub
		return false;
	}


	
	
	
}
