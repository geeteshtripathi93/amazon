package com.project.bl;

import java.sql.SQLException;
import java.util.List;

import com.project.bean.CartDetails;
import com.project.bean.Category;
import com.project.bean.Customer;
import com.project.dao.CartDao;
import com.project.dao.CartDaoImpl;
import com.project.dao.CategoryDao;
import com.project.dao.CategoryDaoImpl;
import com.project.dao.CustomerDao;
import com.project.dao.CustomerDaoImpl;
import com.project.helper.CustomerEntry;

public class CustomerBl {

	private CustomerDao user = new CustomerDaoImpl();
	private CartDao cart= new CartDaoImpl();	
	private CategoryDao category= new CategoryDaoImpl();
	
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

	public boolean updateDetails() throws ClassNotFoundException, SQLException{
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
        return user.update(customer);
	}
	
	public List<CartDetails> viewCart(int customerId) throws ClassNotFoundException, SQLException{
		return cart.viewCart(customerId);
	}
 
	public void viewCategory(){
		
	}
	
	public void billHistory(){
		
	}
	
	public void search(){
		
	}
	
}
