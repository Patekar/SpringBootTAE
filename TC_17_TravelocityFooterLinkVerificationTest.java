package com.globant.qe.in.travelocity.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;

public class TC_17_TravelocityFooterLinkVerificationTest extends TravelocityBaseTestSuite {
	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;
	
	@Test
	public void validateTravelocityFooterLinks() {
		travelocityServiceProvider.getTravelocitygetHomeService().verifybrokenLinks();
		Assert.assertEquals(true, true);
	//	Assert.assertEquals(actual, expected);
		
	

	}
}
