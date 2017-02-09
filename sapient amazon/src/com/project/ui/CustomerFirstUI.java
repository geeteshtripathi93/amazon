package com.project.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.project.bean.BillDetails;
import com.project.bean.CartDetails;
import com.project.bean.Category;
import com.project.bean.Customer;
import com.project.bean.Product;
import com.project.bl.AdminBL;
import com.project.bl.CustomerBl;
import com.project.helper.UpdateCustomerEntry;

public class CustomerFirstUI {
	
	public CustomerFirstUI(int customerId) {
		
		this.customerId= customerId;
		
	}
	
	private boolean status =false;
	private	Scanner sc = null;
	private CustomerBl customerbl = new CustomerBl();
	private int customerId;

	public void displayMenu() {
		System.out.println("1. View Category");
		System.out.println("2. Update Profile");
		System.out.println("3. Search By Category");
		System.out.println("4. Search By Product");
		System.out.println("5. View Cart");
		System.out.println("6. View Bill History");
		System.out.println("7. Exit");

		System.out.println("Press 1/2/3/4/5/6/7");
	}

	public void choice(int choice){
		
		sc=new Scanner(System.in);
		
		switch(choice){
		case 1:{
				try{		
			List<Category> categorylist=customerbl.viewCategory();
			for (Category category : categorylist) {
				System.out.println(category. getCategoryName());
			}
			CustomerSecondUI customersecond= new CustomerSecondUI(customerId);
			customersecond.displayMenu(); 
			int choice2=sc.nextInt();
			boolean check=customersecond.choice(choice);
			if(check){
				displayMenu();
				int choice1=sc.nextInt();
				choice(choice1);
			}
}
catch (SQLException e) {
	System.out.println("Sorry, somthing went wrong!!!");
	displayMenu();
	System.out.println("Enter your choice : ");
	choice(sc.nextInt());	
	}
	break;
	}
			
			
			case 2:
				Customer customer= new UpdateCustomerEntry().update();
				try{	customer.setCustomerId(customerId);
				status=customerbl.updateDetails(customer);
				if(status)
					System.out.println("Details Updated ");
						else
							System.out.println("  Not Updated, Please try again!!!1");
					} catch (ClassNotFoundException | SQLException e) {
						System.out.println("Sorry, somthing went wrong!!!");
						displayMenu();
						System.out.println("Enter your choice : ");
						choice(sc.nextInt());		
					}
				break;
				
			
			
		
		case 3:System.out.println("Enter the category name you want to search: \n");
			String category=sc.next();
			List<Product> productlist;
			try {
				productlist = customerbl.viewProduct(category);
				for (Product prodlist : productlist) {
				System.out.println(prodlist);		
			} 
				// Choose Category
			}
			catch (SQLException e) {
			System.out.println("Sorry, somthing went wrong!!!");
			displayMenu();
			System.out.println("Enter your choice : ");
			choice(sc.nextInt());	
			}
			break;
		case 4:
			System.out.println("Enter the product name you want to search: \n");
			String productname=sc.next();
//			Product product=new Product();
			try{Product product=customerbl.searchProductByName(productname);
			System.out.println(product);
			}
			catch (SQLException e) {
				System.out.println("Sorry, somthing went wrong!!!");
				displayMenu();
				System.out.println("Enter your choice : ");
				choice(sc.nextInt());	
				}
			break;
			
		case 5:
			try {	List<CartDetails> cartlist;
			
				cartlist = customerbl.viewCart(customerId);
				for (CartDetails clist : cartlist) {
				System.out.println(clist);		
			} }
				catch (SQLException | ClassNotFoundException e) {
					System.out.println("Sorry, somthing went wrong!!!");
					displayMenu();
					System.out.println("Enter your choice : ");
					choice(sc.nextInt());	
					}
				break;
		case 6:
			try{List<BillDetails> billList;
			billList = customerbl.getBillDetails(customerId);
			for (BillDetails blist : billList) {
				System.out.println(blist);		
			} }
			catch (SQLException | ClassNotFoundException e) {
				System.out.println("Sorry, somthing went wrong!!!");
				displayMenu();
				System.out.println("Enter your choice : ");
				choice(sc.nextInt());	
				}
			break;
				
		case 7:
			System.exit(0);
		default:
			System.out.println("Invalid choice");
			break;
		}
		
}}
