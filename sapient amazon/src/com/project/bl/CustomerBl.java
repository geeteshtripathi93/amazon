package com.project.bl;

import java.sql.SQLException;

import com.project.bean.Customer;
import com.project.dao.CustomerDao;
import com.project.dao.CustomerDaoImpl;
import com.project.helper.CustomerEntry;
import com.project.ui.MainMenu;

public class CustomerBl {

	private CustomerDao user = new CustomerDaoImpl();
	public boolean signIn(String email, String password) throws ClassNotFoundException, SQLException{
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        if(m.matches()){
        	return user.validation(email, password);
        }
        else 
        	System.out.println("email ID is not valid");
			
        return false;
		
	}	
	
	public boolean signUp() throws ClassNotFoundException, SQLException{
		Customer customer= new CustomerEntry().input();
		if((customer.getPassword().length()<8))
		{
			System.out.println("Password needs to be atleast 8 character longer");
			return false;
		}
		if(customer.getPhoneNumber().contains("[a-zA-Z]+") == true||customer.getPhoneNumber().length()<10){
			System.out.println("Please check Phone Number");
			return false;
		}
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(customer.getEmail());
        if(!m.matches()){
        	System.out.println("Invalid Email ID");
        	return false;
        }
		return user.insert(customer);
	}
	public void viewCart(){
		
	}
	
	public void updateDetails(){
		
	}
	
	public void viewCategory(){
		
	}
	
	public void history(){
		
	}
	
	public void search(){
		
	}
	
}
