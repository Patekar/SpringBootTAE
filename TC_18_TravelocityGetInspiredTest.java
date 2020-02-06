package com.globant.qe.in.travelocity.tests;

import static com.globant.qe.in.utils.JsonUtil.jsonToBean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.globant.qe.in.dataprovider.TestDataProvider;
import com.globant.qe.in.travelocity.models.CruiseData;
import com.globant.qe.in.travelocity.models.GetInspiredTabVerificationtestData;
import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;
import com.globant.qe.in.utils.DataUtil;

public class TC_18_TravelocityGetInspiredTest extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Autowired
	DataUtil dataUtil;

	@Autowired
	GetInspiredTabVerificationtestData getInspiredTabVerificationtestData;

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProvider.class)
	public void getInspiredTabVerificationtest(Map<String, String> testData) {
		getInspiredTabVerificationtestData = jsonToBean(testData.get("getInspiredTabVerificationtestData"),
				GetInspiredTabVerificationtestData.class);
		travelocityServiceProvider.getTravelocitygetHomeService().travelocityGetInspireTab();
		travelocityServiceProvider.getTravelocityGetInspiredService().travelocityTapOnMenuOptions();
		travelocityServiceProvider.getTravelocityGetInspiredService()
				.travelocitysubmitAComment(getInspiredTabVerificationtestData);

	}

}
