package com.project.dao;

public interface CustomerDao {

	boolean insert(Customer c);
	boolean validation(int id, String pass);
	boolean update(Cusomer c);
}
