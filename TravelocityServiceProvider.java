package com.globant.qe.in.travelocity.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globant.qe.in.travelocity.business_service.TravelocityActivitiesService;
import com.globant.qe.in.travelocity.business_service.TravelocityCarSearchResultService;
import com.globant.qe.in.travelocity.business_service.TravelocityCreateAnAccountService;
import com.globant.qe.in.travelocity.business_service.TravelocityCruiseSearchResultService;
import com.globant.qe.in.travelocity.business_service.TravelocityCustomerSupportValidationService;
import com.globant.qe.in.travelocity.business_service.TravelocityGetInspiredService;
import com.globant.qe.in.travelocity.business_service.TravelocityHomeService;
import com.globant.qe.in.travelocity.business_service.TravelocityMobileService;
import com.globant.qe.in.travelocity.business_service.TravelocityPackageChooseYourRoomService;
import com.globant.qe.in.travelocity.business_service.TravelocityPackageSearchResultService;
import com.globant.qe.in.travelocity.business_service.TravelocitySignInService;
import com.globant.qe.in.travelocity.business_service.TravelocityThingsToDoService;
import com.globant.qe.in.travelocity.models.CarData;
import com.globant.qe.in.travelocity.models.PackageData;

@Service
public class TravelocityServiceProvider {
	@Autowired
	TravelocityHomeService travelocityHomeService;

	@Autowired
	TravelocityCreateAnAccountService travelocityCreateAnAccountService;

	@Autowired
	TravelocityCustomerSupportValidationService travelocityCustomerSupportValidationService;

	@Autowired
	TravelocitySignInService travelocitySignInService;

	@Autowired
	PackageData packageData;

	@Autowired
	CarData carData;

	@Autowired
	TravelocityPackageSearchResultService travelocityPackageSearchResultService;

	@Autowired
	TravelocityCarSearchResultService travelocityCarSearchResultService;

	@Autowired
	TravelocityCruiseSearchResultService travelocityCruiseSearchResultService;

	@Autowired
	TravelocityMobileService travelocityMobileService;

	@Autowired
	TravelocityThingsToDoService travelocityThingsToDoService;

	@Autowired
	TravelocityActivitiesService travelocityActivitiesService;

	@Autowired
	TravelocityPackageChooseYourRoomService travelocityPackageChooseYourRoomService;

	@Autowired
	TravelocityGetInspiredService travelocityGetInspiredService;

	public TravelocityHomeService getTravelocitygetHomeService() {
		return travelocityHomeService;
	}

	public TravelocityCreateAnAccountService getCreateAAnAccountService() {
		return travelocityCreateAnAccountService;
	}

	public TravelocityCustomerSupportValidationService gettravelocityCustomerSupportValidationService() {
		return travelocityCustomerSupportValidationService;
	}

	public TravelocitySignInService getTravelocitySignInService() {
		return travelocitySignInService;
	}

	public TravelocityPackageSearchResultService getTravelocityPackageSearchResultService() {
		return travelocityPackageSearchResultService;
	}

	public TravelocityCarSearchResultService getTravelocityCarSearchResultService() {
		return travelocityCarSearchResultService;
	}

	public TravelocityCruiseSearchResultService getTravelocityCruiseSearchResultService() {
		return travelocityCruiseSearchResultService;
	}

	public TravelocityHomeService navigateGetTravelocitygetHomeService() {
		return travelocityHomeService.carTabEmptySearch().fillCarDetails(carData).carTabSearchButton();
	}

	public TravelocityMobileService getTravelocityyMobileService() {
		return travelocityMobileService;
	}

	public TravelocityThingsToDoService getTravelocityThingsToDoService() {
		return travelocityThingsToDoService;
	}

	public TravelocityPackageChooseYourRoomService getTravelocityPackageChooseYourRoomService() {
		return travelocityPackageChooseYourRoomService;
	}

	public TravelocityGetInspiredService getTravelocityGetInspiredService() {
		return travelocityGetInspiredService;
	}

	public TravelocityActivitiesService getTravelocityActivitiesService() {
		return travelocityActivitiesService;
	}
}
