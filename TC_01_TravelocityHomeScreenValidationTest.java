package com.globant.qe.in.travelocity.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;

public class TC_01_TravelocityHomeScreenValidationTest extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Test
	public void homeScreenValidationTest() {
		travelocityServiceProvider.getTravelocitygetHomeService().homeTabValidateTitleOfScreen();
		Assert.assertEquals(travelocityServiceProvider.getTravelocitygetHomeService().homeTabValidateTitleOfScreen(),
				"Wander Wisely with Cheap Hotels, Flights, Vacations & Travel Deals | Travelocity");
		Assert.assertTrue(
				travelocityServiceProvider.getTravelocitygetHomeService().homeTabcheckifHomeSearchButtonsEnabled());
	}
}
