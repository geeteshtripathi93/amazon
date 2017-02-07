package com.project.dao;

import java.util.List;

public interface ProductDao {
boolean addProduct(Product p,int cid);
Boolean deleteProduct(int pid);
boolean updateProduct(Product p);
List<Product> viewProduct(int cid);
}
