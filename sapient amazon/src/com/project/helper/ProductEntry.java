package com.project.helper;

import java.util.Scanner;

import com.project.bean.Product;

public class ProductEntry {
private Product product=new Product();
	
	public void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product id : ");
		product.setProductId(sc.nextInt());
		System.out.println("Enter Product name : ");
		product.setName(sc.next());
		System.out.println("Enter Product Category : ");
		product.setCategory(sc.next());
		System.out.println("Enter Product Price : ");
		product.setPrice(sc.nextDouble());
		System.out.println("Enter product Quantity : ");
		product.setQuantity(sc.nextInt());
		System.out.println("Enter product Discount : ");
		product.setDiscount(sc.nextInt());

	}

	public Product getproduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}


