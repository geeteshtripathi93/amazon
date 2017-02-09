package com.project.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.bean.Cart;

public class AddToCart {

	public List<Cart> addingToCart(int customerId){
		 Scanner sc=new Scanner(System.in);
		 List<Cart> cartList=new ArrayList<Cart>();
		 do{
			 System.out.println("Enter Choice to Add to Cart\n or 0: EXIT");
			 int optionChosen=sc.nextInt();
			 if(optionChosen==0)
				 break;
			 Cart cart=new Cart();
			 cart.setCustomerId(customerId);
			 cart.setProductId(optionChosen);
			 System.out.println("Enter Quantity");
			 int quantity=sc.nextInt();
			 cart.setQuantity(quantity);
			 long millis=System.currentTimeMillis();  
		        java.sql.Date date=new java.sql.Date(millis);  
			 cart.setCartDate(date);
	
			 cartList.add(cart);
		 }while(true);
		 return cartList;
	}
}
