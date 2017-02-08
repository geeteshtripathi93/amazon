package com.project.junit;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.project.dao.AdminDaoImpl;

public class AdminUnit {
AdminDaoImpl admin;
	@Before
	public void setUp() throws Exception {
		admin=new AdminDaoImpl();
	}

	@After
	public void tearDown() throws Exception {
		admin=null;
	}

	@Test
	public void testValidation() throws ClassNotFoundException, SQLException {
		assertTrue(admin.validation("ishita", "ishita"));
	}

	@Test
	public void testUpdate() {
		
	}

}
