package com.globant.qe.in.travelocity.tests;

import static com.globant.qe.in.utils.JsonUtil.jsonToBean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.qe.in.dataprovider.TestDataProvider;
import com.globant.qe.in.travelocity.business_service.TravelocityActivitiesService;
import com.globant.qe.in.travelocity.business_service.TravelocityThingsToDoService;
import com.globant.qe.in.travelocity.models.ThingsToDoData;
import com.globant.qe.in.travelocity.models.TravelocityActivityData;
import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;

public class TC_20_TravelocityActivitiesTest extends TravelocityBaseTestSuite {
	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Autowired
	TravelocityActivityData travelocityActivityData;

	@Autowired
	TravelocityActivitiesService travelocityActivitiesService;

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProvider.class)
	public void validateActivitiesSearchResult(Map<String, String> testData) {

		travelocityActivityData = jsonToBean(testData.get("travelocityActivityData"), TravelocityActivityData.class);
		travelocityServiceProvider.getTravelocitygetHomeService().travelocityActivitiesTab()
				.fillActivityDetails(travelocityActivityData);
		Assert.assertEquals(travelocityServiceProvider.getTravelocityActivitiesService().validateactivitiesPageTitle(),
				"Things to do in Singapore | Travelocity");
	}
}