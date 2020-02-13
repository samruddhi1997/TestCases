package com.capgemini.airlinereservationsystem.controller;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ControllerTest {

	Controller c1 = new Controller();
	@DisplayName("Controller Test Case")
	@Test
	void test() {
		c1.cancelFlight();
	}

	@DisplayName("Cancel Ticket Test Case")
	@Test
	void test1() {
		c1.cancelTicket();
	}
	
	@DisplayName("Check Confirmed Ticket Test Case")
	@Test
	void test2() {
		c1.checkConfirmedTicket();
	}
	
	@DisplayName("Check Ticket Test Case")
	@Test
	void test3() {
		c1.checkTicket();
	}
	@DisplayName("Delete Ticket Test Case")
	@Test
	void test4() {
		c1.deleteTicket();
	}
	@DisplayName("Show Flight Test Case")
	@Test
	void test5() {
		c1.showFlightDetails();
	}
	@DisplayName("Show Ticket Test Case")
	@Test
	void tes6t() {
		c1.showTicketDetails();
	}
	
}
