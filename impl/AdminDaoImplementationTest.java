	package com.capgemini.airlinereservationsystem.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AdminDaoImplementationTest {

	AdminDaoImplementation d1 = new AdminDaoImplementation();
	@DisplayName("Admin Dao Implementation Test Case")
	@Test
	void test() {
		d1.addFlight();
		d1.addTicket();
	}

}
