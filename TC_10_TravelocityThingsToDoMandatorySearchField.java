package com.globant.qe.in.travelocity.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;

public class TC_10_TravelocityThingsToDoMandatorySearchField extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Test
	public void verifyThingsToDoMandatorySearchFields() {
		travelocityServiceProvider.getTravelocitygetHomeService().thingsToDoTabVerification()
				.thingsToDoTabEmptySearch();

		Assert.assertEquals(
				travelocityServiceProvider.getTravelocitygetHomeService().thingsToDoTabValidateEmptySearchError(),
				"Please complete the highlighted destination field below.");
	}
}