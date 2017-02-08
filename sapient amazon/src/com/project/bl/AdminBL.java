package com.project.bl;

import java.sql.SQLException;

import com.project.bean.Admin;
import com.project.dao.AdminDao;
import com.project.dao.AdminDaoImpl;

public class AdminBL {

	private AdminDao admin1 = new AdminDaoImpl();
	
	public boolean signIn(String email, String password) throws ClassNotFoundException, SQLException {
		return admin1.validation(email, password);	
	}	
	
	public boolean updatePassword(Admin admin) throws SQLException{
		return admin1.update(admin);
	}
	
	public void viewCategory(){
		
	}
	public void updateCategory(){
		
	}
	
	public void viewProduct(){
		
	}
	
	public void updateProduct(){
		
	}
	
	public void deleteProduct(){
		
	}
}
