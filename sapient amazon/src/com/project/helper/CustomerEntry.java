package com.project.helper;

import java.util.Scanner;
import com.project.bean.Customer;

public class CustomerEntry {
	
	private Customer customer = new Customer();
	
	public Customer input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name : ");
		customer.setFirstName(sc.next());
		System.out.println("Enter Last Name : ");
		customer.setLastName(sc.next());
		System.out.println(" Enter Email Id : ");
		customer.setEmail(sc.next());
		System.out.println(" Enter Password : ");
		customer.setPassword(sc.next());
		System.out.println(" Enter Phone Number : ");
		customer.setPhoneNumber(sc.next());
		System.out.println(customer); // test
	return customer;	
	}
	

}
