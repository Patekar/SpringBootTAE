package com.globant.qe.in.travelocity.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;

public class TC_08_TravelocityCruiseMandatorySearchFieldTest extends TravelocityBaseTestSuite {
	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Test
	public void cruiseMandatoryFieldSearchTest() {
		travelocityServiceProvider.getTravelocitygetHomeService().loadPage().cruiseTabEmptySearch();
		Assert.assertEquals(
				travelocityServiceProvider.getTravelocityCruiseSearchResultService().getCruiseSearchPageHaader(),
				"All destinations");
	}

}
