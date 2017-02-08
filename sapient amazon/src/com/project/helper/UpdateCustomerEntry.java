package com.project.helper;

import java.util.Scanner;

import com.project.bean.Customer;

public class UpdateCustomerEntry {

	private Customer customer = new Customer();
	
	public Customer update(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new First Name : ");
		customer.setfirstName(sc.next());
		System.out.println("Enter new  Last Name : ");
		customer.setlastName(sc.next());
		System.out.println(" Enter new Email Id : ");
		customer.setemail(sc.next());
		System.out.println(" Enter new Password : ");
		customer.setpassword(sc.next());
		System.out.println(" Enter new Phone Number : ");
		customer.setphoneNumber(sc.next());
	return customer;	
	}
}
