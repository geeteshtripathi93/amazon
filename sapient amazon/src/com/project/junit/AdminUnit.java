package com.project.junit;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.project.bean.Customer;
import com.project.dao.AdminDao;
import com.project.dao.AdminDaoImpl;

public class AdminUnit {
	
	AdminDaoImpl adminDao;
	Customer customer;
	
	@Before
	public void setUp() throws Exception {
		adminDao = new AdminDaoImpl();
	}

	@After
	public void tearDown() throws Exception {
		adminDao = null;
	}

	@Test(expected = NullPointerException.class)
	public void positiveTestValidation() throws ClassNotFoundException, SQLException {
		customer = new Customer(4, "aa", "ll", "hsh", "ghsg", "561420");
		assertTrue(adminDao.validation("hsh", "ghsg"));
	}

	@Test(expected = NullPointerException.class)
	public void negativeTestValidation() throws ClassNotFoundException, SQLException {
		customer = new Customer(4, "aa", "ll", "hsh", "ghsg", "561420");
		assertFalse(adminDao.validation("hsh", "ghs"));
	}

}
