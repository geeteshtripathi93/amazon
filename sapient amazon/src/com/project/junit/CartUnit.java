package com.project.junit;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.project.bean.Cart;
import com.project.dao.CartDaoImpl;

public class CartUnit {
	
	CartDaoImpl cartDao;
	Cart cart;
	List<Cart> cartList;
	
	@Before
	public void setUp() throws Exception {
		cartDao = new CartDaoImpl();
	}

	@After
	public void tearDown() throws Exception {
		cartDao = null;
	}

	@Test
	public void positiveTest() throws ClassNotFoundException, SQLException {
		String str = "08-02-2017";
		Date date = Date.valueOf(str);
		List<Cart> cartList = new LinkedList<Cart>();
		cart = new Cart(2, 2, 20, date);
		cartList.add(cart);
		assertTrue(cartDao.addToCart(cartList));
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
