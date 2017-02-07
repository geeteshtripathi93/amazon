package com.project.dao;

public interface AdminDao {

	boolean validation(int id, String password);
	boolean update(Admin a);
}
