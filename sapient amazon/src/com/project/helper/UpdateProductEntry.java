package com.project.helper;

import java.util.Scanner;

import com.project.bean.Product;

public class UpdateProductEntry {
private Product product=new Product();
	
	public Product updateProduct(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Product ID : ");
		product.setProductId(sc.nextInt());
		System.out.println("Enter new Product Name : ");
		product.setName(sc.next());
		System.out.println("Enter new Product Price : ");
		product.setPrice(sc.nextDouble());
		System.out.println("Enter new product Quantity : ");
		product.setQuantity(sc.nextInt());
		System.out.println("Enter new product Discount : ");
		product.setDiscount(sc.nextInt());
		return product;
	}

	
	
	
}
