package com.project.helper;

import java.util.Scanner;

import com.project.bean.Customer;
public class CustomerEntry {
	
	 private Customer customer = new Customer();
	
	public Customer input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name : ");
		customer.setfirstName(sc.next());
		System.out.println("Enter Last Name : ");
		customer.setlastName(sc.next());
		System.out.println(" Enter Email Id : ");
		customer.setemail(sc.next());
		System.out.println(" Enter Password : ");
		customer.setpassword(sc.next());
		System.out.println(" Enter Phone Number : ");
		customer.setphoneNumber(sc.next());
	return customer;	
	}
	

}
