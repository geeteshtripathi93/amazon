package com.project.helper;

import java.util.Scanner;

import com.project.bean.Product;

public class ProductEntry {
private Product product=new Product();
	
	public Product input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product id : ");
		product.setProductId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Product Name : ");
		String s= sc.nextLine();
		product.setName(s);
		System.out.println("Enter Product Category : ");
		String s2= sc.next();
		product.setCategory(s2);
		
		System.out.println("Enter Product Price : ");
		product.setPrice(sc.nextDouble());
		System.out.println("Enter product Quantity : ");
		product.setQuantity(sc.nextInt());
		System.out.println("Enter product Discount : "); 
		product.setDiscount(sc.nextInt());
		System.out.println(product);
return product;
	}

	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}


