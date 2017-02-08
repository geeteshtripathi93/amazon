package com.project.junit;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.project.bean.Customer;
import com.project.dao.CustomerDaoImpl;

public class CustomerDaoTest {
	CustomerDaoImpl customerDao;
	Customer customer;

	@Before
	public void setUp() throws Exception {
		customerDao = new CustomerDaoImpl();
	}

	@After
	public void tearDown() throws Exception {
		customerDao = null;
	}

	@Test(expected = SQLException.class)
	public void negativeNumberTestInsert() throws ClassNotFoundException, SQLException {
		customer = new Customer(-4, "aa", "ll", "hsh", "ghsg", "561420");
		assertFalse(customerDao.insert(customer));
		System.out.println("Customer id can't be negative");
	}
	
	@Test(expected = SQLException.class)
	public void positiveNumberTestInsert() throws ClassNotFoundException, SQLException {
		customer = new Customer(4, "aa", "ll", "hsh", "ghsg", "561420");
		assertTrue(customerDao.insert(customer));
	}

	@Test(expected = NullPointerException.class)
	public void positiveTestValidation() throws ClassNotFoundException, SQLException {
		customer = new Customer(4, "aa", "ll", "hsh", "ghsg", "561420");
		assertTrue(customerDao.validation("hsh", "ghsg"));
	}

	@Test(expected = NullPointerException.class)
	public void negativeTestValidation() throws ClassNotFoundException, SQLException {
		customer = new Customer(4, "aa", "ll", "hsh", "ghsg", "561420");
		assertFalse(customerDao.validation("hsh", "ghs"));
	}

	@Test(expected = NullPointerException.class)
	public void zeroTestUpdate() throws ClassNotFoundException, SQLException {
		customer = new Customer(0, "aa", "ll", "hsh", "ghsg", "561420");
		assertTrue(customerDao.update(customer));
	}

}
