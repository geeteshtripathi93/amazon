package com.project.bl;

import java.sql.SQLException;

import com.project.bean.Admin;
import com.project.dao.AdminDao;
import com.project.dao.AdminDaoImpl;

public class AdminBL {

	private AdminDao admin1 = new AdminDaoImpl();
	
	public boolean signIn(String email, String password) throws ClassNotFoundException, SQLException {
		
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        if(m.matches()){
        	return admin1.validation(email, password);
        }
        else 
        	System.out.println("email ID is not valid");
			
        return false;
	}	
	
	public boolean updatePassword(Admin admin) throws SQLException{
		if((admin.getPassword().length()<8))
		{
			System.out.println("Password needs to be atleast 8 character longer");
			return false;
		}
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
