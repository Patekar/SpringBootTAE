package com.globant.qe.in.travelocity.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;

public class TC_04_TravelocityCustomerSupportValidationTest extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Test
	public void travelocityCustomerSupportValidationTest() {
		travelocityServiceProvider.getTravelocitygetHomeService().homeClickOncustomerSupportMenu();
		travelocityServiceProvider.getTravelocitygetHomeService().homeClickOncustomerSupportMenu();
		travelocityServiceProvider.gettravelocityCustomerSupportValidationService().loadPage();
		Assert.assertEquals(travelocityServiceProvider.gettravelocityCustomerSupportValidationService()
				.customerSupportValidateTitleOfScreen(), "Customer Service Portal");
		Assert.assertTrue(travelocityServiceProvider.gettravelocityCustomerSupportValidationService()
				.customerSupportcheckIfContactUsButtonEnabled());
	}
}
