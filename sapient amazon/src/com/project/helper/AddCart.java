package com.project.helper;


import java.util.List;
import java.util.Scanner;

import com.project.bean.Cart;
import com.project.dao.CartDaoImpl;

public class AddCart {

	public CartDaoImpl cdl=new CartDaoImpl();
	private Cart cart = new Cart();
	
	public void addToCart(){
		List<Cart> cartlist= cdl.addToCart(cart);
		int d=0;
		
		while(d!=0){
			Scanner sc=new Scanner(System.in);
		System.out.println("enter the product ID");
	     int product_id=sc.nextInt();
	     
	     System.out.println("enter the quantity of the product");
	     int product_quant=sc.nextInt();
	     
		
		
		
		}
		
	}
}
