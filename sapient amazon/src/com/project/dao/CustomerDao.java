package com.project.dao;

import com.project.bean.Customer;

public interface CustomerDao {

	boolean insert(Customer c);
	boolean validation(int id, String pass);
	boolean update(Customer c);
}
