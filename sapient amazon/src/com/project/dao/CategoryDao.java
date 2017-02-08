package com.project.dao;

import java.sql.SQLException;
import java.util.List;

import com.project.bean.Category;
import com.project.bean.Product;

public interface CategoryDao {
List<Category> viewCategory(Category category);
boolean insertCategory(String categoryname)throws SQLException,ClassNotFoundException;
boolean deleteCategory(String categoryname);
	
}
