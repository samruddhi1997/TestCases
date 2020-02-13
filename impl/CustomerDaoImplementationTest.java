package com.capgemini.airlinereservationsystem.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerDaoImplementationTest {
    CustomerDaoImplementation c1 = new CustomerDaoImplementation();
	@DisplayName("Customer Dao Impl Test Case for Serach form")
	@Test
	void test() {
	 c1.searchForm();
	}
	@DisplayName("Customer Dao Impl for Test Case for Schedule details")
	@Test
	void test1() {
		c1.scheduleFlight();
	}
	@DisplayName("Customer Dao Impl for Test Case for Journey details")
	@Test
	void test2() {
		c1.journeyDetails();
	}
	
	
}
