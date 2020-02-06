package com.globant.qe.in.travelocity.tests;

import static com.globant.qe.in.utils.JsonUtil.jsonToBean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.globant.qe.in.dataprovider.TestDataProvider;
import com.globant.qe.in.travelocity.business_service.TravelocityCruiseSearchResultService;
import com.globant.qe.in.travelocity.models.CarData;
import com.globant.qe.in.travelocity.models.CruiseData;
import com.globant.qe.in.travelocity.pages.TravelocityCruiseSearchResultPage;
import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;
import com.globant.qe.in.utils.DataUtil;

import org.junit.Assert;

public class TC_11_TravelocityEnterCruisesDetailsTest extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Autowired
	CruiseData cruiseData;

	@Autowired
	DataUtil dataUtil;

	@Autowired
	TravelocityCruiseSearchResultService travelocityCruiseSearchResultService;

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProvider.class)
	public void enterCruisesDetails(Map<String, String> testData) {
		cruiseData = jsonToBean(testData.get("cruiseData"), CruiseData.class);
		travelocityServiceProvider.getTravelocitygetHomeService().cruiseTabSearch().fillCruiseDetails(cruiseData)
				.cruiseTabEmptySearch();
		Assert.assertEquals(
				travelocityServiceProvider.getTravelocityCruiseSearchResultService().getCruiseSearchPageHaader(),
				"European & Mediterranean Cruises | Travelocity");
	}
}
