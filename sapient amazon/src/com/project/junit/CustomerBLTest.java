package com.project.junit;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.project.bean.Customer;
import com.project.bl.CustomerBl;

public class CustomerBLTest {
	
	CustomerBl customerBL;
	Customer customer;

	@Before
	public void setUp() throws Exception {
		customerBL = new CustomerBl();
	}

	@After
	public void tearDown() throws Exception {
		customerBL = null;
	}

//	@Test
//	public void testPositiveSignIn() throws ClassNotFoundException, SQLException {
//		assertTrue(customerBL.signIn("abc@xyz.com", "password"));
//	}

	@Test
	public void testSignUp() {
		
	}

	@Test
	public void testUpdateDetails() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewCart() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddToCart() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveFromCart() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewCategory() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerateBill() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBillDetails() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentBill() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewProduct() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchProductByName() {
		fail("Not yet implemented");
	}

}
