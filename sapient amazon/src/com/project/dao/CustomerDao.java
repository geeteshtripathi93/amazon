package com.project.dao;

import java.sql.SQLException;

import com.project.bean.Customer;

public interface CustomerDao {

	boolean insert(Customer customer) throws ClassNotFoundException, SQLException;
	boolean validation(int id, String password) throws ClassNotFoundException, SQLException;
	boolean update(Customer customer) throws ClassNotFoundException, SQLException;
}
