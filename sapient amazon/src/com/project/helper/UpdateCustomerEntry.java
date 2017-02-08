package com.project.helper;

import java.util.Scanner;

import com.project.bean.Customer;

public class UpdateCustomerEntry {

	private Customer customer = new Customer();
	
	public Customer update(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new First Name : ");
		customer.setFirstName(sc.next());
		System.out.println("Enter new  Last Name : ");
		customer.setLastName(sc.next());
		System.out.println(" Enter new Email Id : ");
		customer.setEmail(sc.next());
		System.out.println(" Enter new Password : ");
		customer.setPassword(sc.next());
		System.out.println(" Enter new Phone Number : ");
		customer.setPhoneNumber(sc.next());
	return customer;	
	}
}
