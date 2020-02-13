package com.capgemini.airlinereservationsystem.controller;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class changeTicketPriceControllerTest {

	changeTicketPriceController t1 = new changeTicketPriceController();
	@DisplayName("Change Ticket Controller Test Case")
	@Test
	void test() {
		t1.checkPrice();
	}

}
