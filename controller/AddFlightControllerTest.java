
package com.capgemini.airlinereservationsystem.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AddFlightControllerTest {

	AddFlightController f1 = new AddFlightController();

	@DisplayName("Add Flight Controller Test Case")
	@Test
	void test() {
		f1.checkFlight();
	}

}
