package com.project.ui;

import java.util.List;
import java.util.Scanner;

import com.project.bean.Category;
import com.project.bl.CustomerBl;

public class CustomerFirstUI {
	private	Scanner sc = null;
	private CustomerBl customerbl = new CustomerBl();
	private int customerId;
	
	
		public CustomerFirstUI(int customerId) {
			
			this.customerId= customerId;
			
		}

	public void displayMenu() {
		System.out.println("1. View Category");
		System.out.println("2. Update Profile");
		System.out.println("3. Search By Category");
		System.out.println("4. View Category");
		System.out.println("5. View Cart");
		System.out.println("6. View Bill History");
		System.out.println("7. Exit");

		System.out.println("Press 1/2/3/4/5/6/7");
	}

	public void choice(int choice){
		
		sc=new Scanner(System.in);
		
		switch(choice){
		case 1:{
			List<Category> categorylist=customerbl.viewCategory();
			for (Category category : categorylist) {
				System.out.println(category. getCategoryName());
			}
			


			CustomerSecondPage customersecond= new CustomerSecondPage();
			customersecond.displayMenu(); 
			int choice2=sc.nextInt();
			boolean check=customersecond.choice(choice, customerbl);
			if(check){
				displayMenu();
				int choice1=sc.nextInt();
				choice(choice1);
			}
			
//			
//				//System.out.println("a. Login");
//			
//			System.out.println("b. Unsubscribe");
//			System.out.println("c. Exit");
//			System.out.println("Press a/b/c");
//			String ch2=sc.next();
//			switch(ch2){
//			case "a":
//			
//					System.out.println("Enter your Employee ID");
//				int userId=sc.nextInt();
//				System.out.println("Enter your Password");
//				//char[] passwordChars = console.readPassword();
//			     //String password = new String(passwordChars);
//				String password=sc.next();
//			   
//			   try {
//					Info e=b1.validation(userId,password);
//					if(e!=null){
//						System.out.println("Login Successful");
//						System.out.println(" ");
//						idOb.display(e);
//						
//					}
//					else{
//						System.out.println("Incorrect UserID or Password Please try again");
//					}
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
				break;
			
			
			case 2:
				System.out.println("Enter your Employee  ID");
				int eId=sc.nextInt();
				System.out.println("Enter your Password");
				
				String pswd=sc.next();
			   
			   try {
					Info e=b1.validation(eId,pswd);
					if(e!=null){
						int dp=e.getParkNo();
						idOb.delPark(dp);
						System.out.println("You are not a signee anymore!!!");
						
					}
					else{
						System.out.println("You are not a Signee!!!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				try {
					Boolean tf=b1.unsubscribe(eId);
					if(tf){
						
						System.out.println("You have unsubscribed");
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
				
			case "c":
				System.out.println("Exit!!");
				System.exit(0);
				break;
			default :System.out.println("Invalid choice");
			break;
				
			}}break;
		case 2:
			try {
				try {
					idOb.input();
				} catch (ClassNotFoundException e) {
					System.out.println("Sorry Record Not Inserted");
					
					e.printStackTrace();
				} catch (IOException e) {
					
					System.out.println("Sorry Record Not Inserted");
					e.printStackTrace();
				}
				boolean status=b2.add(idOb.getEmployee());
				if(status){
					System.out.println("Congratulations your Space have been Reserved!!! ");
				}
			} 
			catch (SQLException e) {
				System.out.println("Sorry Record Not Inserted");
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				gdOb.input();
				boolean status=b3.add(gdOb.getGuest());
				if(status){
					System.out.println(gdOb.getGuest());
					System.out.println("Congratulations your Space have been Reserved!!! ");
					System.out.println("To Cancel Booking Press 1 else Press 0 : ");
					int i=sc.nextInt();
					if(i==1)
					{
						System.out.println("Enter vehicle number : ");
						String vehicleNo=null;
						vehicleNo=sc.next();
						try {
							
							Guest g=b3.cancelBookingBl(gdOb.getGuest(),vehicleNo);
							if(g!=null){
								
								System.out.println("You have Cancelled your Booking");
							}
							
						} catch (SQLException e) {
							e.printStackTrace();
						}
							
						}
				}
			} catch (SQLException e) {
				System.out.println("Sorry Record Not Inserted");
				e.printStackTrace();
			}
			break;
		case 4:
			System.out.println("Exit!!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}

}
