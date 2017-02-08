package com.project.helper;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import com.project.bean.Cart;

public class AddToCart {

	List<Cart> addingToCart(int customerId){
		 Scanner sc=new Scanner(System.in);
		 List<Cart> cartList=new ArrayList<Cart>();
		 do{
			 System.out.println("Enter Choice to Add to Cart");
			 int optionChosen=sc.nextInt();
			 if(optionChosen==0)
				 break;
			 Cart cart=new Cart();
			 cart.setCustomerId(customerId);
			 cart.setProductId(optionChosen);
			 System.out.println("Enter Quantity");
			 int quantity=sc.nextInt();
			 cart.setQuantity(quantity);
			 cart.setCartDate(new GregorianCalendar());
	
			 cartList.add(cart);
		 }while(true);
		 return cartList;
	}
}
