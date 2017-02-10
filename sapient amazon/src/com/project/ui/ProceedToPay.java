package com.project.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.project.bean.Bill;
import com.project.bean.BillDetails;
import com.project.bl.CustomerBl;

public class ProceedToPay {
	
	public void display(){
		System.out.println("Pay Option");
		System.out.println("1) Proceed to Pay\n 2) Back\n 3)Exit");
	}
	public boolean payOption(int customerId) throws ClassNotFoundException, SQLException{
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice){
		case 1://payment gateway calling
			Bill bill=null;
			CustomerBl customerBl=new CustomerBl();
			bill= customerBl.generateBill(customerId);
			if (bill!= null) {
				List<BillDetails> list = customerBl.getCurrentBill(bill); 
				for (BillDetails billDetails : list) {
					System.out.println(billDetails);
					CustomerFirstUI customerFUI = new CustomerFirstUI(customerId);
					customerFUI.displayMenu();
					System.out.println("Enter your Choice : ");
					customerFUI.choice(sc.nextInt());
				}
				
			} else {
				display();
				System.out.println("Enter your Choice : ");
				payOption(customerId);
			}
			return false;
		case 2:
			return false;
		case 3:
			System.exit(0);
		default:
			display();
			System.out.println("Enter your Choice : ");
			payOption(customerId);
		}
		return false;
		
	}
}
