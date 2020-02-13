package com.capgemini.airlinereservationsystem.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserMainControllerTest {

	UserMainController u1 = new UserMainController();
	@DisplayName("User Main Test Case")
	@Test
	void test() {
		u1.userMain("sam");
	}

}
