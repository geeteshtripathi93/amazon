package com.project.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.project.dao.CartDaoImpl;

public class CartUnit {
CartDaoImpl cart;
	@Before
	public void setUp() throws Exception {
		cart= new CartDaoImpl();
	}

	@After
	public void tearDown() throws Exception {
		cart=null;
	}

	@Test
	public void testAddToCart() {
		assertTrue();
	}

	@Test
	public void testRemoveFromCart() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewCart() {
		fail("Not yet implemented");
	}

}
