package com.capgemini.airlinereservationsystem.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AdminLoginTest {
	
	AdminLogin l1 = new AdminLogin();
	@DisplayName("Admin Login Dao Test Case")
	@Test
	void test() {
	l1.login();
	}

}
