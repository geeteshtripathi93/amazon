package com.project.ui;

import java.util.Scanner;

public class MainMenu {

	public void displayMenu()
	{
		System.out.println("WELCOME TO AMAZON");
		
		System.out.println("1: Sign In \n2: Sign Up \n3: Explore Category\n 4: Search\n 5: Seek Help\n 6: Exit");
	}
	
	public void choice(int ch)
	{
		Scanner sc=new Scanner(System.in);
		switch(ch)
		{
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("INVALID OPTION");
			displayMenu();
			choice(sc.nextInt());
		}
	}
}
