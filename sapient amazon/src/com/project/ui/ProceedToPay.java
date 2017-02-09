package com.project.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.project.bean.Bill;
import com.project.bl.CustomerBl;
import com.project.dao.BillDao;
import com.project.dao.BillDaoImpl;

public class ProceedToPay {
	
	public void display(){
		System.out.println("Pay Option");
		System.out.println("1) Proceed to Pay\n 2) Back\n 3)Exit");
	}
	public boolean payOption(int customerId) throws ClassNotFoundException, SQLException{
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			Bill bill=null;
			CustomerBl customerBl=new CustomerBl();
			bill= customerBl.generateBill(customerId);
			return true;
		case 2:
			return false;
		case 3:
			System.exit(0);
		default:
			display();
			payOption(customerId);
		}
		return false;
		
	}
}
