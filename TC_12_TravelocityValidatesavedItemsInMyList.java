package com.globant.qe.in.travelocity.tests;

import static com.globant.qe.in.utils.JsonUtil.jsonToBean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.globant.qe.in.dataprovider.TestDataProvider;
import com.globant.qe.in.travelocity.models.PackageData;
import com.globant.qe.in.travelocity.models.ThingsToDoData;
import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;
import com.globant.qe.in.utils.DataUtil;

public class TC_12_TravelocityValidatesavedItemsInMyList extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Autowired
	DataUtil dataUtil;

	@Autowired
	ThingsToDoData thingsToDoData;

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProvider.class)
	public void validateSavedItemsInMyList(Map<String, String> testData) {
		thingsToDoData = jsonToBean(testData.get("thingsToDoData"), ThingsToDoData.class);
		travelocityServiceProvider.getTravelocitygetHomeService().thingsToDoTabVerification()
				.fillThingsToDoDetails(thingsToDoData);
		travelocityServiceProvider.getTravelocityThingsToDoService().travelocityTapOnHeartIconToSaveIt();
	}
}
