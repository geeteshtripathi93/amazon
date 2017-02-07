package com.project.dao;

import java.util.List;

import com.project.bean.Product;


public interface ProductDao {
boolean addProduct(Product p);
Boolean deleteProduct(int pid);
boolean updateProduct(Product p);
List<Product> viewProduct(int cid);
}
