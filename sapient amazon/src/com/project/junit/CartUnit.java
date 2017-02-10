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
	List<Cart> cartList = new LinkedList<Cart>();
	String str = "2017-02-08";
	Date date = Date.valueOf(str);
	
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
		cart = new Cart(2, 2, 20, date);
		cartList.add(cart);
		assertTrue(cartDao.addToCart(cartList));
	}

	@Test 
	public void testRemoveNegative() throws ClassNotFoundException, SQLException {
		cart = new Cart(-2, 2, 20, date);
		cartList.add(cart);
		assertFalse(cartDao.removeFromCart(cart.getProductId(), cart.getCustomerId()));
	}
	
	@Test 
	public void testRemoveNegativeTwo() throws ClassNotFoundException, SQLException {
		cart = new Cart(2, -2, 20, date);
		cartList.add(cart);
		assertFalse(cartDao.removeFromCart(cart.getProductId(), cart.getCustomerId()));
	}
	
	@Test 
	public void testRemovePositive() throws ClassNotFoundException, SQLException {
		cart = new Cart(2, 2, 20, date);
		cartList.add(cart);
		assertTrue(cartDao.removeFromCart(cart.getProductId(), cart.getCustomerId()));
	}
		
	@Test
	public void testRemoveZero() throws ClassNotFoundException, SQLException {
		cart = new Cart(0, 2, 20, date);
		cartList.add(cart);
		assertFalse(cartDao.removeFromCart(cart.getProductId(), cart.getCustomerId()));
	}
	
	@Test 
	public void testRemoveZeroTwo() throws ClassNotFoundException, SQLException {
		cart = new Cart(2, 0, 20, date);
		cartList.add(cart);
		assertFalse(cartDao.removeFromCart(cart.getProductId(), cart.getCustomerId()));
	}
	
	@Test
	public void testListNegative() throws ClassNotFoundException, SQLException {
		cart = new Cart(-2, 2, 20, date);
		cartList.add(cart);
		assertNotEquals(1, cart.getCustomerId());
	}
	
	@Test
	public void testListZero() throws ClassNotFoundException, SQLException {
		cart = new Cart(0, 2, 20, date);
		cartList.add(cart);
		assertNotEquals(1, cart.getCustomerId());	
	}
	
	@Test
	public void testListPositive() throws ClassNotFoundException, SQLException {
		cart = new Cart(2, 2, 20, date);
		cartList.add(cart);
		assertEquals(2, cart.getCustomerId());
	}

}
