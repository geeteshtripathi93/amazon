package com.project.ui;

import java.util.Scanner;

import com.project.bean.Customer;

public class MainMenu {

	public void displayMenu() {
		System.out.println("WELCOME TO AMAZON");

		System.out.println("1: Sign In \n2: Sign Up \n3: Explore Category\n 4: Search\n 5: Exit");
	}

	public void choice(int ch) {
		Scanner sc = new Scanner(System.in);
		Customer CustomerOb = new Customer();

		switch (ch) {
		case 1:
			System.out.println("Enter your email id/username");
			String uName = sc.next();
			System.out.println("enter your password");
			String pass = sc.next();

			break;
		case 2:
			System.out.println("Enter your first name : ");
			String fName = sc.next();
			System.out.println("Enter your last name : ");
			String lName = sc.next();
			System.out.println("Enter your email ID : ");
			String email = sc.next();
			System.out.println("Enter your password name : ");
			String password = sc.next();
			System.out.println("Enter your phone number : ");
			int number = sc.nextInt();

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
			choice(sc.nextInt());
		}
	}
}
