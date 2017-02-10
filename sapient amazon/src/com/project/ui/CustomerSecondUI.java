package com.project.ui;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.bean.CartDetails;
import com.project.bean.Category;
import com.project.bean.Customer;
import com.project.bean.Product;
import com.project.bl.CustomerBl;
import com.project.dao.CartDaoImpl;
import com.project.helper.AddToCart;

public class CustomerSecondUI {

	private int customerId;
	public CustomerSecondUI(int customerId) {
	this.customerId= customerId;
	}
	CustomerBl customerbl = new CustomerBl();

	public void displayMenu() {
		System.out.println("1. Choose Category ");
		System.out.println("2. Back");
		System.out.println("3. Exit");
		System.out.println("Press 1/2/3");
	}

	public boolean choice(int ch) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		boolean status = false;
		switch (ch) {
		case 1:
			int index = 1;
			try { //category name input list output
				System.out.println("Enter category name to view products : ");
				String category=sc.next();
				List<Product> productlist = customerbl.viewProduct(category);
			for (Product product : productlist) {
				System.out.println((index++) + " " + product.getName());
			}
			AddToCart add=new AddToCart();//add to cart 
			status = customerbl.addToCart(add.addingToCart(customerId));
			} catch (ClassNotFoundException e) {
				CustomerSecondUI customerSUI = new CustomerSecondUI(customerId);
				customerSUI.displayMenu();
				System.out.println("Enter your choice : ");
				customerSUI.choice(sc.nextInt());
			}
			if(status){ 
				System.out.println("Added To Cart.");
				List<CartDetails> list=new ArrayList<CartDetails>();
				
				try {
					list = customerbl.viewCart(customerId);//view cart
					System.out.println(list);
				} catch (ClassNotFoundException e) {
					CustomerSecondUI customerSUI = new CustomerSecondUI(customerId);
					customerSUI.displayMenu();
					System.out.println("Enter your choice : ");
					customerSUI.choice(sc.nextInt());
				}
				for (CartDetails cartDetails : list) {
					System.out.println(cartDetails);
				}
				// call pay ui
				ProceedToPay paymentUI = new ProceedToPay();
				paymentUI.display();
				try {
					paymentUI.payOption(customerId);//payment
				} catch (ClassNotFoundException e) {
					CustomerSecondUI customerSUI = new CustomerSecondUI(customerId);
					customerSUI.displayMenu();
					System.out.println("Enter your choice : ");
					 status=customerSUI.choice(sc.nextInt());
					 
				}
			}
				else{
					System.out.println("Sorrry, somthing went wrong!!!!");
					CustomerSecondUI customerSUI = new CustomerSecondUI(customerId);
					customerSUI.displayMenu();
					System.out.println("Enter your choice : ");
					customerSUI.choice(sc.nextInt());
				}
			return true;
		case 2:
			return true;
			
		case 3:
			System.exit(0);
		default:
			System.out.println("INVALID OPTION");
			displayMenu();
			System.out.println("Enter your choice : ");
			choice(sc.nextInt());
		}
		CustomerSecondUI customerSUI = new CustomerSecondUI(customerId);
		customerSUI.displayMenu();
		System.out.println("Enter your choice : ");
		customerSUI.choice(sc.nextInt());
		return false;
	}
}
