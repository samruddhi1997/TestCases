package com.capgemini.airlinereservationsystem.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JourneyDetailsControllerTest {

	JourneyDetailsController c1 = new JourneyDetailsController();

	@DisplayName("Journey Details Case Test")
	@Test
	void test() {
		c1.journey();
	}

}
