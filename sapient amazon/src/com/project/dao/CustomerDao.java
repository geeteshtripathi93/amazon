package com.project.dao;

import com.project.bean.Customer;

public interface CustomerDao {

	boolean insert(Customer customer);
	boolean validation(int id, String password);
	boolean update(Customer customer);
}
