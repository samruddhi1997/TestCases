package com.capgemini.airlinereservationsystem.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ScheduleDetailsControllerTest {

	ScheduleDetailsController c1 = new ScheduleDetailsController();

	@DisplayName("Schedule Details Test Case")
	@Test
	void test() {
		c1.schedule();
	}

}
