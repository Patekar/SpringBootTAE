package com.globant.qe.in.travelocity.business_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.globant.qe.in.IService;
import com.globant.qe.in.travelocity.pages.TravelocityPackageChooseYourRoomPage;
import com.globant.qe.in.travelocity.provider.TravelocityPageProvider;

@Service
@Lazy
public class TravelocityPackageChooseYourRoomService implements IService<TravelocityPackageChooseYourRoomService> {

	@Override
	public TravelocityPackageChooseYourRoomService loadPage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	TravelocityPageProvider travelocityPageProvider;

	@Autowired
	TravelocityPackageChooseYourRoomPage travelocityPackageChooseYourRoomPage;

	public TravelocityPackageChooseYourRoomPage chooseYourRoomcheckThePressenceOfButtons() {
		return travelocityPageProvider.getTravelocityPackageChooseYourRoomPage().checkThePressenceOfButtons();
	}

	public String checkLandingPageTitle() {
		return travelocityPageProvider.getTravelocityPackageChooseYourRoomPage().verifyLandingPageTitle();
	}

	public void switchToChooseYourRoomPage() {
		travelocityPageProvider.getTravelocityPackageChooseYourRoomPage().switchToPackageChooseYourRoomPage();
	}
}
