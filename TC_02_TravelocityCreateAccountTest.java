package com.globant.qe.in.travelocity.tests;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import static com.globant.qe.in.utils.JsonUtil.jsonToBean;

import com.globant.qe.in.dataprovider.TestDataProvider;
import com.globant.qe.in.utils.DataUtil;
import com.globant.qe.in.travelocity.business_service.TravelocityCreateAnAccountService;
import com.globant.qe.in.travelocity.models.TravelocityCreateAnAccountData;
import com.globant.qe.in.travelocity.pages.TravelocityCreateAnAccountPage;
import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;

public class TC_02_TravelocityCreateAccountTest extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Autowired
	TravelocityCreateAnAccountPage travelocityCreateAnAccountPage;

	@Autowired
	TravelocityCreateAnAccountData travelocityCreateAnAccountData;

	@Autowired
	TravelocityCreateAnAccountService travelocityCreateAnAccountService;

	@Autowired
	DataUtil dataUtil;

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProvider.class)
	public void verifyTravelocitySignUp(Map<String, String> testData) {
		travelocityCreateAnAccountData = jsonToBean(testData.get("travelocityCreateAnAccountData"),
				TravelocityCreateAnAccountData.class);
		travelocityServiceProvider.getTravelocitygetHomeService().homeclickOnAccountlink();
		travelocityServiceProvider.getTravelocitygetHomeService().homeclickOnCreateAccountlink();
		travelocityCreateAnAccountService.fillCreateAnAccountDetails(travelocityCreateAnAccountData);
	//	travelocityServiceProvider.getTravelocitygetHomeService().loadPage().
	}
}
