package com.globant.qe.in.travelocity.tests;

import static com.globant.qe.in.utils.JsonUtil.jsonToBean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.qe.in.dataprovider.TestDataProvider;
import com.globant.qe.in.travelocity.business_service.TravelocityPackageChooseYourRoomService;
import com.globant.qe.in.travelocity.models.PackageData;
import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;
import com.globant.qe.in.utils.DataUtil;

public class TC_15_TravelocityPackageChooseYourRoomTest extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Autowired
	TravelocityPackageChooseYourRoomService travelocityPackageChooseYourRoomService;

	@Autowired
	PackageData packageData;

	@Autowired
	DataUtil dataUtil;

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProvider.class)
	public void validatePackageSearchResultPageTest(Map<String, String> testData) throws InterruptedException {
		packageData =  jsonToBean(testData.get("packageData"), PackageData.class);
		travelocityServiceProvider.getTravelocityPackageSearchResultService().gotoSearchResultPageService(packageData)
				.packageTapOnFirstHotelFromList();
		travelocityServiceProvider.getTravelocityPackageChooseYourRoomService().switchToChooseYourRoomPage();
		travelocityServiceProvider.getTravelocityPackageChooseYourRoomService()
				.chooseYourRoomcheckThePressenceOfButtons();
		Assert.assertEquals(
				travelocityServiceProvider.getTravelocityPackageChooseYourRoomService().checkLandingPageTitle(),
				"Book Somerset Liang Court Singapore | Singapore Hotel Deals");
	}
}