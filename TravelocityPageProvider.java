package com.globant.qe.in.travelocity.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globant.qe.in.travelocity.pages.TravelocityActivitiesPage;
import com.globant.qe.in.travelocity.pages.TravelocityCreateAnAccountPage;
import com.globant.qe.in.travelocity.pages.TravelocityCustomerSupportPage;
import com.globant.qe.in.travelocity.pages.TravelocityGetInspiredPage;
import com.globant.qe.in.travelocity.pages.TravelocityHomePage;
import com.globant.qe.in.travelocity.pages.TravelocityMobilePage;
import com.globant.qe.in.travelocity.pages.TravelocityPackageChooseYourRoomPage;
import com.globant.qe.in.travelocity.pages.TravelocityPackageSearchResultPage;
import com.globant.qe.in.travelocity.pages.TravelocitySignInPage;
import com.globant.qe.in.travelocity.pages.TravelocityThingsToDoPage;

@Component
public class TravelocityPageProvider {
	@Autowired
	private TravelocityHomePage travelocityHomePage;

	@Autowired
	private TravelocityCreateAnAccountPage travelocityCreateAnAccountPage;

	@Autowired
	private TravelocityCustomerSupportPage travelocityCustomerSupportPage;

	@Autowired
	private TravelocitySignInPage travelocitySignInPage;

	@Autowired
	private TravelocityPackageSearchResultPage travelocityPackageSearchResultPage;

	@Autowired
	private TravelocityMobilePage travelocityMobilePage;

	@Autowired
	private TravelocityThingsToDoPage travelocityThingsToDoPage;

	@Autowired
	private TravelocityGetInspiredPage travelocityGetInspiredPage;

	@Autowired
	private TravelocityPackageChooseYourRoomPage travelocityPackageChooseYourRoomPage;

	@Autowired
	private TravelocityActivitiesPage travelocityActivitiesPage;

	public TravelocityHomePage getTravelocityHomePage() {
		return travelocityHomePage;
	}

	public TravelocityCreateAnAccountPage getTravelocityCreateAnAccountPage() {
		return travelocityCreateAnAccountPage;
	}

	public TravelocityCustomerSupportPage gettravelocityCustomerSupportPage() {
		return travelocityCustomerSupportPage;
	}

	public TravelocitySignInPage getTravelocitySignInPage() {
		return travelocitySignInPage;
	}

	public TravelocityPackageSearchResultPage getTravelocityPackageSearchResult() {
		return travelocityPackageSearchResultPage;
	}

	public TravelocityMobilePage getTravelocityMobilePage() {
		return travelocityMobilePage;
	}

	public TravelocityThingsToDoPage getTravelocityThingsToDoPage() {
		return travelocityThingsToDoPage;
	}

	public TravelocityPackageChooseYourRoomPage getTravelocityPackageChooseYourRoomPage() {
		return travelocityPackageChooseYourRoomPage;
	}

	public TravelocityGetInspiredPage getTravelocityGetInspiredPage() {
		return travelocityGetInspiredPage;
	}

	public TravelocityActivitiesPage getTravelocityActivitiesPage() {
		return travelocityActivitiesPage;
	}

}