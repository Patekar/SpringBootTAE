package com.globant.qe.in.travelocity.tests;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;

public class TC_03_TravelocityPackageMandatoryFieldSearchTest extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Test
	public void packageMandatoryFieldSearchTest() {
		travelocityServiceProvider.getTravelocitygetHomeService().loadPage().packageTabEmptySearch()
				.packageTabSearchButton();

		Assert.assertEquals(
				travelocityServiceProvider.getTravelocitygetHomeService().packageTabValidateEmptySearchError(),
				"Please complete the highlighted origin field below.");
	}
}
