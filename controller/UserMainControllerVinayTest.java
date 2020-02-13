package com.capgemini.airlinereservationsystem.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserMainControllerVinayTest {
	UserMainController c1 = new UserMainController();
	@DisplayName("Usre Main Controller Test case")
	@Test
	void test() {
		c1.userMain("samruddhi");
	}

}
