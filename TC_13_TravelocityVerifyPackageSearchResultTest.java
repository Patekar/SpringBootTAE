package com.globant.qe.in.travelocity.tests;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.globant.qe.in.utils.JsonUtil.jsonToBean;

import com.globant.qe.in.dataprovider.TestDataProvider;
import com.globant.qe.in.travelocity.business_service.TravelocityPackageSearchResultService;
import com.globant.qe.in.travelocity.models.PackageData;
import com.globant.qe.in.travelocity.pages.TravelocityPackageSearchResultPage;
import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;
import com.globant.qe.in.utils.DataUtil;
import com.globant.qe.in.yahoo.models.SignUpData;

public class TC_13_TravelocityVerifyPackageSearchResultTest extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Autowired
	PackageData packageData;

	@Autowired
	DataUtil dataUtil;

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProvider.class)
	public void validatePackageSearchResultPageTest(Map<String, String> testData) {
		packageData = jsonToBean(testData.get("packageData"), PackageData.class);
		travelocityServiceProvider.getTravelocityPackageSearchResultService().gotoSearchResultPageService(packageData);
		Assert.assertEquals(travelocityServiceProvider.getTravelocityPackageSearchResultService()
				.packageVerifyIfCorrectDataHasCome(), "Singapore, Singapore");
	}
}
