package com.project.helper;

import java.util.Scanner;

import com.project.bean.Product;

public class UpdateProductEntry {
private Product product=new Product();
	
	public void updateProduct(){
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter new Product Price : ");
		product.setPrice(sc.nextDouble());
		System.out.println("Enter new product Quantity : ");
		product.setQuantity(sc.nextInt());
		System.out.println("Enter new product Discount : ");
		product.setDiscount(sc.nextInt());

	}

	public Product getproduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
