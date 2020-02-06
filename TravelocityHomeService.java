package com.globant.qe.in.travelocity.business_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.globant.qe.in.IService;
import com.globant.qe.in.travelocity.models.CarData;
import com.globant.qe.in.travelocity.models.CruiseData;
import com.globant.qe.in.travelocity.models.PackageData;
import com.globant.qe.in.travelocity.models.ThingsToDoData;
import com.globant.qe.in.travelocity.models.TravelocityActivityData;
import com.globant.qe.in.travelocity.provider.TravelocityPageProvider;

@Service
@Lazy
public class TravelocityHomeService implements IService<TravelocityHomeService> {

	@Autowired
	TravelocityPageProvider travelocityPageProvider;

	@Override
	public TravelocityHomeService loadPage() {
		travelocityPageProvider.getTravelocityHomePage().getPage();
		return this;
	}

	public String homeTabValidateTitleOfScreen() {
		return travelocityPageProvider.getTravelocityHomePage().getHomeScreenTitle();
	}

	public boolean homeTabcheckifHomeSearchButtonsEnabled() {
		return travelocityPageProvider.getTravelocityHomePage().checkifHomeSearchButtonsEnabled();
	}

	public TravelocityHomeService homeclickOnAccountlink() {
		travelocityPageProvider.getTravelocityHomePage().clickOnAccountlink();
		return this;
	}

	public TravelocityHomeService homeclickOnCreateAccountlink() {
		travelocityPageProvider.getTravelocityHomePage().clickOnCreateAccountlink();
		return this;
	}

	public TravelocityHomeService homeclickOnSupportMenu() {
		travelocityPageProvider.getTravelocityHomePage().clickOnSupportMenu();
		return this;
	}

	public TravelocityHomeService homeClickOncustomerSupportMenu() {
		travelocityPageProvider.getTravelocityHomePage().clickOnSupportMenu().clickOncustomerSupportMenu();
		return this;
	}

	public TravelocityHomeService homeGetColorValueOfTab() {
		String beforeHovercolour = travelocityPageProvider.getTravelocityHomePage().colorBeforeHover;
		String afterHovercolour = travelocityPageProvider.getTravelocityHomePage().colorAfterHover;
		return this;
	}

	public TravelocityHomeService packageTabEmptySearch() {
		travelocityPageProvider.getTravelocityHomePage().tapOnPackageTab();
		return this;
	}

	public TravelocityHomeService packageTabSearchButton() {
		travelocityPageProvider.getTravelocityHomePage().tapOnPackageTabSearchbutton();
		return this;
	}

	public String packageTabValidateEmptySearchError() {
		return travelocityPageProvider.getTravelocityHomePage().getErrorOnEmptySearch();
	}

	public TravelocityHomeService homeClickOnPackageTab() {
		travelocityPageProvider.getTravelocityHomePage().tapOnPackageTab();
		return this;
	}

	public TravelocityHomeService homeTapOnHotelPlusCar() {
		travelocityPageProvider.getTravelocityHomePage().tapOnHotelPlusCar();
		return this;
	}

	public TravelocityHomeService selectDetailsAboutCustomers() {
		travelocityPageProvider.getTravelocityHomePage().packageSelectNumberOfRooms().packageSelectNumberOfAdults()
				.packageSelectNumberOfChildrens().packageSelectAgeOfChildrens().tapOnPackageTabSearchbutton();
		return this;
	}

	public TravelocityHomeService fillPackageDetails(PackageData packageData) {
		travelocityPageProvider.getTravelocityHomePage().tapOnGoingToCity(packageData.getGoingToCity())
				.tapOnCheckInDate(packageData.getHotelCheckinDate())
				.tapOnCheckOutDate(packageData.getHotelCheckoutDate());
		return this;
	}

	public TravelocityHomeService carTabEmptySearch() {
		travelocityPageProvider.getTravelocityHomePage().tapOnCarTab();
		return this;
	}

	public TravelocityHomeService carTabSearchButton() {
		travelocityPageProvider.getTravelocityHomePage().tapOnCarTabSearchbutton();
		return this;
	}

	public String carTabValidateEmptySearchError() {
		return travelocityPageProvider.getTravelocityHomePage().getErrorOnEmptyCarSearch();
	}

	public TravelocityHomeService fillCarDetails(CarData carData) {
		travelocityPageProvider.getTravelocityHomePage().tapOnCarPickUp(carData.getPickingUp())
				.tapOnCarDropOff(carData.getDropOff()).tapOnCarPickupDate(carData.getPickupDate())
				.tapOnCarDropOffDate(carData.getDropOffDate());
		return this;
	}

	public TravelocityHomeService cruiseTabEmptySearch() {
		travelocityPageProvider.getTravelocityHomePage().tapOnCruiseTab().tapOnCruiseTabSearchButton();
		return this;
	}

	public TravelocityHomeService cruiseTabSearch() {
		travelocityPageProvider.getTravelocityHomePage().tapOnCruiseTab();
		return this;
	}

	public TravelocityHomeService fillCruiseDetails(CruiseData cruiseData) {
		travelocityPageProvider.getTravelocityHomePage().tapOncruiseDestinationDropDown()
				.tapOncruiseStartDate(cruiseData.getDepartAsEarlyAs())
				.tapOncruiseEndDate(cruiseData.getDepartAsLateAs());
		return this;
	}

	public TravelocityHomeService mobileTabVerification() {
		travelocityPageProvider.getTravelocityHomePage().tapOnMobileTab();
		return this;
	}

	public TravelocityHomeService thingsToDoTabVerification() {
		travelocityPageProvider.getTravelocityHomePage().tapOnThingsToDo();
		return this;
	}

	public TravelocityHomeService fillThingsToDoDetails(ThingsToDoData thingsToDoData) {
		travelocityPageProvider.getTravelocityHomePage().tapOnThingsToDoDestination(thingsToDoData.getDestination())
				.tapOnFromDate(thingsToDoData.getFrom()).tapOnEndDate(thingsToDoData.getTo())
				.tapOnThingsToDoTabSearchButton();
		return this;
	}

	public TravelocityHomeService thingsToDoTabEmptySearch() {
		travelocityPageProvider.getTravelocityHomePage().tapOnThingsToDo().tapOnThingsToDoTabSearchButton();
		return this;
	}

	public String thingsToDoTabValidateEmptySearchError() {
		return travelocityPageProvider.getTravelocityHomePage().getErrorOnEmptyThingsToDoSearch();
	}

	public int verifybrokenLinks() {
		return travelocityPageProvider.getTravelocityHomePage().brokenLinks();
	}

	public void travelocityGetInspireTab() {
		travelocityPageProvider.getTravelocityHomePage().tapOnGetInspiredTab();
	}

	public TravelocityHomeService travelocityActivitiesTab() {
		travelocityPageProvider.getTravelocityHomePage().tapOnActivitiesTab();
		return this;
	}

	public void travelocityActivitiesTabEmptySearch() {
		travelocityPageProvider.getTravelocityHomePage().tapOnActivitiesTabSearchButton();
	}

	public String activitiesValidateEmptySearchError() {
		return travelocityPageProvider.getTravelocityHomePage().getErrorOnActivitiesSearch();
	}

	public TravelocityHomeService fillActivityDetails(TravelocityActivityData travelocityActivityData) {
		travelocityPageProvider.getTravelocityHomePage()
				.tapOnActivitiesDestination(travelocityActivityData.getActivityDestination())
				.tapOnActivitiesFromDate(travelocityActivityData.getActivityfrom())
				.tapOnActivitiesEndDate(travelocityActivityData.getActivityto()).tapOnActivitiesTabSearchButton();
		return this;
	}
}
