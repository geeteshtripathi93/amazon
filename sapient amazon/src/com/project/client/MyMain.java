package com.project.client;

import java.util.Scanner;

import com.project.ui.MainMenu;

public class MyMain {

	public static void main(String[] args) {
		MainMenu menu=new MainMenu();
		Scanner sc=new Scanner(System.in);
		int d;
		do{
			menu.displayMenu();
			System.out.println("enter choice : ");
			int ch=sc.nextInt();
			menu.choice(ch);
			System.out.println(" ");
			System.out.println("Press 1 to continue");
			
			 d=sc.nextInt();
		}while(d==1);
		System.out.println("Exited");
	}

	}	


