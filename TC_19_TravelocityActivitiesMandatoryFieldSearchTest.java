package com.globant.qe.in.travelocity.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;

public class TC_19_TravelocityActivitiesMandatoryFieldSearchTest extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Test
	public void activitiesMandatoryFieldSearchTest() {
		travelocityServiceProvider.getTravelocitygetHomeService().travelocityActivitiesTab();
		travelocityServiceProvider.getTravelocitygetHomeService().travelocityActivitiesTabEmptySearch();
		Assert.assertEquals(
				travelocityServiceProvider.getTravelocitygetHomeService().activitiesValidateEmptySearchError(),
				"Please complete the highlighted destination field below.");
	}
}