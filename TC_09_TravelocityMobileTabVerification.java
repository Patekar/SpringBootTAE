package com.globant.qe.in.travelocity.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;

public class TC_09_TravelocityMobileTabVerification extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Test
	public void validateTravelocityMobileTab() {
		travelocityServiceProvider.getTravelocitygetHomeService().mobileTabVerification();
		travelocityServiceProvider.getTravelocityyMobileService().tapOnEnterMobileNumberField();

		Assert.assertTrue(travelocityServiceProvider.getTravelocityyMobileService()
				.mobileTAbTabCheckIfDownloadAppButtonIsEnabled());
		Assert.assertEquals(travelocityServiceProvider.getTravelocityyMobileService().verifyMessageOnMobileScreen(),
				"Thank you! A text with the download link has been sent to your mobile device.");
	}
}
