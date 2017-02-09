package com.project.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.project.bean.Customer;
import com.project.bl.CustomerBl;
import com.project.helper.CustomerEntry;

public class MainMenu {
	private MainMenu mainMenu = new MainMenu();
	Scanner sc = new Scanner(System.in);
	int ch;
	private CustomerBl customerBl= new CustomerBl();
	public void displayMenu() {
		System.out.println("WELCOME TO AMAZON");

		System.out.println("1: Sign In \n2: Sign Up \n3: Explore Category\n 4: Search\n 5: Exit");
	}

	public void choice(int ch) {
		
		

		switch (ch) {
		case 1:
		System.out.println("Enter your email id/username : ");
			String email = sc.next();
			System.out.println("Enter your password : ");
			String password = sc.next();
			try {
				customerBl.signIn(email, password);
			} catch (ClassNotFoundException | SQLException e1) {
				System.out.println("Sorry, Please try again!!!!");
				mainMenu.displayMenu();
				System.out.println("Enter your choice : ");
				ch = sc.nextInt();
				mainMenu.choice(ch);
			}
			break;
		case 2:
			Customer customer= new CustomerEntry().input();
			try {
				customerBl.signUp(customer);
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("Sorry, Please try again!!!!");
				displayMenu();
				System.out.println("Enter your choice : ");
				choice(sc.nextInt());		
			}
			break;
		case 3:
			// fetch category list

			break;

		case 4:
			System.out.println("Enter the product name you want to search for : ");
			String find = sc.next();
			break;

		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("INVALID OPTION");
			displayMenu();
			System.out.println("Enter your choice : ");
			choice(sc.nextInt());
		}
	}
}
