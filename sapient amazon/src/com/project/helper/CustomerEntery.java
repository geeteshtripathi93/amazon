package com.project.helper;

import java.util.Scanner;

import com.project.bean.Customer;
public class CustomerEntery {
	
	Customer customer = new Customer();
	
	public void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name : ");
		customer.setcust_fname(sc.next());
		System.out.println("Enter Last Name : ");
		customer.setcust_lname(sc.next());
//		System.out.println(" Enter id : ");
		System.out.println(" Enter Password : ");
		customer.setcust_pass(sc.next());
		System.out.println(" Enter Phone Number : ");
		customer.setcust_phone(sc.next());
	
		
	}
	

}
