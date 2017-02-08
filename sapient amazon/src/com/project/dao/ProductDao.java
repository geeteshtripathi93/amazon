package com.project.dao;

import java.sql.SQLException;
import java.util.List;

import com.project.bean.Product;


public interface ProductDao {
boolean addProduct(Product p)throws SQLException,ClassNotFoundException;
Boolean deleteProduct(int pid)throws SQLException;
boolean updateProduct(Product p)throws SQLException;
List<Product> viewProduct(String category)throws SQLException;
List<Product> searchProduct(String product)throws SQLException;


}
