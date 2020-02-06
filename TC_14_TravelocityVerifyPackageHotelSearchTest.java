package com.globant.qe.in.travelocity.tests;

import static com.globant.qe.in.utils.JsonUtil.jsonToBean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.qe.in.dataprovider.TestDataProvider;
import com.globant.qe.in.travelocity.business_service.TravelocityPackageSearchResultService;
import com.globant.qe.in.travelocity.models.PackageData;
import com.globant.qe.in.travelocity.pages.TravelocityPackageSearchResultPage;
import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;
import com.globant.qe.in.utils.DataUtil;

public class TC_14_TravelocityVerifyPackageHotelSearchTest extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Autowired
	TravelocityPackageSearchResultService travelocityPackageSearchResultService;

	@Autowired
	PackageData packageData;

	@Autowired
	DataUtil dataUtil;

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProvider.class)
	public void validatePackageSearchResultPageTest(Map<String, String> testData) {
		packageData = jsonToBean(testData.get("packageData"), PackageData.class);
		travelocityServiceProvider.getTravelocityPackageSearchResultService().gotoSearchResultPageService(packageData);
		Assert.assertTrue(travelocityServiceProvider.getTravelocityPackageSearchResultService()
				.pkgTabCheckStarRatedHotelSearch());
	}
}
