package com.globant.qe.in.travelocity.business_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.globant.qe.in.IService;
import com.globant.qe.in.travelocity.models.PackageData;
import com.globant.qe.in.travelocity.pages.TravelocityCarSearchPage;
import com.globant.qe.in.travelocity.pages.TravelocityPackageSearchResultPage;
import com.globant.qe.in.travelocity.provider.TravelocityPageProvider;
import com.globant.qe.in.travelocity.provider.TravelocityServiceProvider;

@Service
@Lazy
public class TravelocityPackageSearchResultService implements IService<TravelocityPackageSearchResultService> {

	@Autowired
	TravelocityPageProvider travelocityPageProvider;

	@Autowired
	TravelocityPackageSearchResultPage travelocityPackageSearchResultPage;

	@Autowired
	PackageData packageData;

	@Autowired
	TravelocityServiceProvider travelocityServiceProvider;

	@Override
	public TravelocityPackageSearchResultService loadPage() {
		return this;
	}

	public String packageVerifyIfCorrectDataHasCome() {
		return travelocityPageProvider.getTravelocityPackageSearchResult().verifyIfCorrectDataHasCome();
	}

	public TravelocityPackageSearchResultPage packageTapOnSortingOptions() {
		return travelocityPackageSearchResultPage.tapOnPkgPropertyClassAndPropertyType();
	}

	public TravelocityPackageSearchResultService packageTapOnFirstHotelFromList() {
		travelocityPackageSearchResultPage.tapOnFirstHotelFromList();
		return this;
	}

	public boolean pkgTabCheckStarRatedHotelSearch() {
		return travelocityPageProvider.getTravelocityPackageSearchResult().checkStarRatedHotel();
	}

	public TravelocityPackageSearchResultService gotoSearchResultPageService(PackageData packageData) {
		travelocityServiceProvider.getTravelocitygetHomeService().homeClickOnPackageTab().homeTapOnHotelPlusCar()
				.fillPackageDetails(packageData).selectDetailsAboutCustomers();
		travelocityServiceProvider.getTravelocityPackageSearchResultService().packageTapOnSortingOptions();
		return this;
	}
}
