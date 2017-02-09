package com.project.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.project.bean.Category;
import com.project.bean.Product;
import com.project.bl.AdminBL;
import com.project.bl.CustomerBl;

public class CustomerFirstUI {
	private	Scanner sc = null;
	private CustomerBl customerbl = new CustomerBl();
	private int customerId;
	
	
		public CustomerFirstUI(int customerId) {
			
			this.customerId= customerId;
			
		}

	public void displayMenu() {
		System.out.println("1. View Category");
		System.out.println("2. Update Profile");
		System.out.println("3. Search By Category");
		System.out.println("4. View Category");
		System.out.println("5. View Cart");
		System.out.println("6. View Bill History");
		System.out.println("7. Exit");

		System.out.println("Press 1/2/3/4/5/6/7");
	}

	public void choice(int choice){
		
		sc=new Scanner(System.in);
		
		switch(choice){
		case 1:{
			List<Category> categorylist=customerbl.viewCategory();
			for (Category category : categorylist) {
				System.out.println(category. getCategoryName());
			}
			


			CustomerSecondPage customersecond= new CustomerSecondPage();
			customersecond.displayMenu(); 
			int choice2=sc.nextInt();
			boolean check=customersecond.choice(choice, customerbl);
			if(check){
				displayMenu();
				int choice1=sc.nextInt();
				choice(choice1);
			}
			
//			
//				//System.out.println("a. Login");
//			
//			System.out.println("b. Unsubscribe");
//			System.out.println("c. Exit");
//			System.out.println("Press a/b/c");
//			String ch2=sc.next();
//			switch(ch2){
//			case "a":
//			
//					System.out.println("Enter your Employee ID");
//				int userId=sc.nextInt();
//				System.out.println("Enter your Password");
//				//char[] passwordChars = console.readPassword();
//			     //String password = new String(passwordChars);
//				String password=sc.next();
//			   
//			   try {
//					Info e=b1.validation(userId,password);
//					if(e!=null){
//						System.out.println("Login Successful");
//						System.out.println(" ");
//						idOb.display(e);
//						
//					}
//					else{
//						System.out.println("Incorrect UserID or Password Please try again");
//					}
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
				break;
			
			
			case 2:
				
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
			
			
			product.viewProduct(pcategory);
			break;
		case 4:
			System.out.println("Exit!!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}

}
