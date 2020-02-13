package com.capgemini.airlinereservationsystem.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserDaoImplementationTest {

	UserDaoImplementation u1 = new UserDaoImplementation();
	@DisplayName("Show Flight Details test Case")
	@Test
	void test() {
		u1.flightDetails();
	}
	
	@DisplayName("Confirm Flight Ticket test Case")
	@Test
	void test1() {
		u1.showConfirmTicketDetails();
	}
	
	@DisplayName("Get Confirm Ticket Test Case")
	@Test
	void test2() {
		u1.getConfirmTicketDetails();
	}
	
	@DisplayName("Ticket Cancel Form Test Case")
	@Test
	void test3() {
		u1.ticketCancelForm();
	}
	
	@DisplayName("Delete Ticket Test Case")
	@Test
	void test4() {
		u1.ticketDelete();
	}
	
	@DisplayName("Ticket Details Test Case")
	@Test
	void tes5() {
		u1.ticketDetails();
	}
}
