package com.globant.qe.in.travelocity.tests;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import static com.globant.qe.in.utils.JsonUtil.jsonToBean;

import java.lang.reflect.Method;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.qe.in.dataprovider.TestDataProvider;
import com.globant.qe.in.utils.DataUtil;

import com.globant.qe.in.dataprovider.TestDataProvider;
import com.globant.qe.in.travelocity.models.TravelocityCreateAnAccountData;
import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;
import com.globant.qe.in.utils.DataUtil;

public class TC_05_TravelocityEnterPackageDetailsTest extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Autowired
	TravelocityCreateAnAccountData travelocityCreateAnAccountData;

	@Autowired
	DataUtil dataUtil;

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProvider.class)
	public void TravelocityVerifyCreateAnAccountFlow(Map<String, String> testData) {
		travelocityCreateAnAccountData = jsonToBean(testData.get("travelocityCreateAnAccountData"),
				TravelocityCreateAnAccountData.class);
	}
}
