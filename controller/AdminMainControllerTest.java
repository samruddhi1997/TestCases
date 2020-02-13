package com.capgemini.airlinereservationsystem.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AdminMainControllerTest {

	AdminMainController m1 = new AdminMainController();
	@DisplayName("")
	@Test
	void test() {
		m1.checkFlight("krish");
	}

}
