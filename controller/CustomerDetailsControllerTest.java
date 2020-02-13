package com.capgemini.airlinereservationsystem.controller;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerDetailsControllerTest {

	CustomerDetailsController c1 = new CustomerDetailsController();
	@DisplayName("Customer Details Test Case")
	@Test
	void test() {
		c1.checkCustomer();
	}

}
