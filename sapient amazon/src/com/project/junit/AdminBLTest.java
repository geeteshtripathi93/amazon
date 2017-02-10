package com.project.junit;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.project.bean.Admin;
import com.project.bean.Category;
import com.project.bean.Customer;
import com.project.bean.Product;
import com.project.bl.AdminBL;
import com.project.dao.AdminDao;
import com.project.helper.CreateConnection;

public class AdminBLTest {

	AdminBL adminBL;
	Customer customer;
	Admin admin;
	Category category;
	Product product;
	
	@Before
	public void setUp() throws Exception {
		adminBL = new AdminBL();
	}

	@After
	public void tearDown() throws Exception {
		adminBL = null;
	}

	@Test
	public void positiveSignIn() throws ClassNotFoundException, SQLException {
		// customer = new Customer(1, "Tony", "Stark",
		// "ironman@starkindustries.com", "character", "1234567890");
		assertTrue(adminBL.signIn("abc@xyz.com", "password1"));
	}

	@Test
	public void emailSignIn() throws ClassNotFoundException, SQLException {
		// customer = new Customer(1, "Tony", "Stark",
		// "ironman@starkindustries.com", "character", "1234567890");
		assertFalse(adminBL.signIn("abc@cxyz.com", "password"));
	}

	@Test
	public void passwordSignIn() throws ClassNotFoundException, SQLException {
		// customer = new Customer(1, "Tony", "Stark",
		// "ironman@starkindustries.com", "character", "1234567890");
		assertFalse(adminBL.signIn("abc@xyz.com", "passqword"));
	}

//	@Test
//	public void positiveUpdatePassword() throws ClassNotFoundException,SQLException {
//		admin = new Admin("abc@xyz.com", "password1");
//		assertTrue(adminBL.updatePassword(admin));
//	}
//	
//	@Test
//	public void negativeUpdatePassword() throws ClassNotFoundException,SQLException {
//		admin = new Admin("abc@xyz.com", "passwor");
//		assertFalse(adminBL.updatePassword(admin));
//	}

	@Test
	public void positiveDeleteCategory() throws ClassNotFoundException, SQLException {
//		category = new Category("Clothing");
		assertTrue(adminBL.deleteCategory("Clothing"));
	}
	
	@Test
	public void negativeDeleteCategory() throws ClassNotFoundException, SQLException {
//		category = new Category("Footwear");
		assertFalse(adminBL.deleteCategory("Footwear"));
	}

	@Test
	public void testPositiveAddProduct() throws ClassNotFoundException, SQLException {
		product = new Product(1, "Shirt", "Clothing", 1500, 10, 20);
		assertTrue(adminBL.addProduct(product));
	}

	@Test
	public void testNegativeAddProduct() throws ClassNotFoundException, SQLException {
		product = new Product(-1, "Shirt", "Clothing", 1500, 10, 20);
		assertFalse(adminBL.addProduct(product));
	}
	
	@Test
	public void testNegativeTwoAddProduct() throws ClassNotFoundException, SQLException {
		product = new Product(0, "Shirt", "Clothing", 1500, 10, 20);
		assertFalse(adminBL.addProduct(product));
	}
	
	@Test
	public void testNegativeThreeAddProduct() throws ClassNotFoundException, SQLException {
		product = new Product(1, "Shirt", "Clothing", -1500, 10, 20);
		assertFalse(adminBL.addProduct(product));
	}
	
	@Test
	public void testNegativeFourAddProduct() throws ClassNotFoundException, SQLException {
		product = new Product(1, "Shirt", "Clothing", 0, 10, 20);
		assertFalse(adminBL.addProduct(product));
	}
	
	@Test
	public void testNegativeFiveAddProduct() throws ClassNotFoundException, SQLException {
		product = new Product(1, "Shirt", "Clothing", 1500, -10, 20);
		assertFalse(adminBL.addProduct(product));
	}
	
	@Test
	public void testNegativeSixAddProduct() throws ClassNotFoundException, SQLException {
		product = new Product(-1, "Shirt", "Clothing", 1500, 0, 20);
		assertFalse(adminBL.addProduct(product));
	}
	
	@Test
	public void testNegativeSevenAddProduct() throws ClassNotFoundException, SQLException {
		product = new Product(-1, "Shirt", "Clothing", 1500, 10, -20);
		assertFalse(adminBL.addProduct(product));
	}
	
	@Test
	public void testNegativeEightAddProduct() throws ClassNotFoundException, SQLException {
		product = new Product(-1, "Shirt", "Clothing", 1500, 10, 0);
		assertFalse(adminBL.addProduct(product));
	}
	
	@Test
	public void testUpdateProduct() throws ClassNotFoundException, SQLException {
		assertTrue(adminBL.updateProduct(product));
	}

}
