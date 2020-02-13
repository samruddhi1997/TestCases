package com.capgemini.airlinereservationsystem.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LoginRegDaoImplementationTest {
	LoginRegDaoImplementation i1 = new LoginRegDaoImplementation();
	@DisplayName("Admin Login Dao Impl Test Case")
	@Test
	void test() {
		i1.adminlogin();
		
	}

	@DisplayName("Admin Resgistration Dao Impl Test Case")
	@Test
	void test1() {
		i1.adminRegistration();
	}
	
	@DisplayName("User Dao Impl Test Case")
	@Test
	void test2() {
		i1.userRegistration();
	}
	
	@DisplayName("User Registration Dao Impl Test Case")
	@Test
	void test3() {
		i1.userlogin();
	}
}
