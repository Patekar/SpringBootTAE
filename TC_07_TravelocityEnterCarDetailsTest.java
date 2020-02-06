package com.globant.qe.in.travelocity.tests;

import static com.globant.qe.in.utils.JsonUtil.jsonToBean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.globant.qe.in.dataprovider.TestDataProvider;
import com.globant.qe.in.travelocity.business_service.TravelocityCarSearchResultService;
import com.globant.qe.in.travelocity.models.CarData;
import com.globant.qe.in.travelocity.models.PackageData;
import com.globant.qe.in.travelocity.pages.TravelocityCarSearchPage;
import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;
import com.globant.qe.in.utils.DataUtil;

public class TC_07_TravelocityEnterCarDetailsTest extends TravelocityBaseTestSuite {

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Autowired
	CarData carData;

	@Autowired
	DataUtil dataUtil;

	@Autowired
	TravelocityCarSearchPage travelocityCarSearchPage;

	@Autowired
	TravelocityCarSearchResultService travelocityCarSearchResultService;

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProvider.class)
	public void enterCarDetails(Map<String, String> testData) {
		carData = jsonToBean(testData.get("carData"), CarData.class);
		travelocityServiceProvider.getTravelocitygetHomeService().carTabEmptySearch().fillCarDetails(carData)
				.carTabSearchButton();

		Assert.assertEquals(
				travelocityServiceProvider.getTravelocityCarSearchResultService().verifyIfCorrectDataHasComeForCar(),
				"Rental Cars and Car Rentals in Sydney from Travelocity");

		travelocityServiceProvider.getTravelocityCarSearchResultService().carTapOnSortingOptions();
		travelocityServiceProvider.getTravelocityCarSearchResultService().carTapOnFirstCarFromList();
		travelocityServiceProvider.getTravelocityCarSearchResultService().carTapOnSelectButton();

	}
}