package com.globant.qe.in.travelocity.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;

public class TC_06_TravelocityCarTabMandatoryFieldSearchTest extends TravelocityBaseTestSuite {
	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Test
	public void packageMandatoryFieldSearchTest() {
		travelocityServiceProvider.getTravelocitygetHomeService().loadPage().carTabEmptySearch().carTabSearchButton();
		Assert.assertEquals(travelocityServiceProvider.getTravelocitygetHomeService().carTabValidateEmptySearchError(),
				"Please complete the highlighted destination field below.");
	}
}
