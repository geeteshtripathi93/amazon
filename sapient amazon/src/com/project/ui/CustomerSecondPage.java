package com.project.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.project.bean.Category;
import com.project.bean.Customer;
import com.project.bean.Product;
import com.project.bl.CustomerBl;

public class CustomerSecondPage {
	CustomerBl customerbl = new CustomerBl();

	public void displayMenu() {
		System.out.println("1. Choose Category ");
		System.out.println("2. Back");
		System.out.println("3. Exit");
		System.out.println("Press 1/2/3");

	}

	public boolean choice(int ch, CustomerBl customerbl) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Customer CustomerOb = new Customer();

		switch (ch) {
		case 1:
			int index = 1;
			List<Product> productlist = customerbl.viewProduct(sc.next());
			for (Product product : productlist) {
				System.out.println((index++) + " " + product.getName());
			}
			addToCartMenu cartMenu=new  addToCartMenu();
			return false;
		case 2:
			return true;
		case 3:
			System.exit(0);
		default:
			System.out.println("INVALID OPTION");
			displayMenu();
			choice(sc.nextInt(), customerbl);
		}
		return true;

	}

}
