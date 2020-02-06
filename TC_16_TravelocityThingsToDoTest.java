package com.globant.qe.in.travelocity.tests;

import static com.globant.qe.in.utils.JsonUtil.jsonToBean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.qe.in.dataprovider.TestDataProvider;
import com.globant.qe.in.travelocity.business_service.TravelocityThingsToDoService;
import com.globant.qe.in.travelocity.models.ThingsToDoData;
import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;

public class TC_16_TravelocityThingsToDoTest extends TravelocityBaseTestSuite {
	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Autowired
	ThingsToDoData thingsToDoData;

	@Autowired
	TravelocityThingsToDoService travelocityThingsToDoService;

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProvider.class)
	public void validateThingsToDoSearchResult(Map<String, String> testData) {

		thingsToDoData = jsonToBean(testData.get("thingsToDoData"), ThingsToDoData.class);
		travelocityServiceProvider.getTravelocitygetHomeService().thingsToDoTabVerification()
				.fillThingsToDoDetails(thingsToDoData);
		travelocityServiceProvider.getTravelocityThingsToDoService().travelocityTapOnHeartIconToSaveIt();
		Assert.assertEquals(travelocityServiceProvider.getTravelocityThingsToDoService().validatethingsToDoPageTitle(),
				"Things to do in Singapore | Travelocity");
	}
}