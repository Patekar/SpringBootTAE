package com.globant.qe.in.travelocity.business_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.globant.qe.in.IService;
import com.globant.qe.in.travelocity.pages.TravelocityMobilePage;
import com.globant.qe.in.travelocity.provider.TravelocityPageProvider;

@Service
@Lazy
public class TravelocityMobileService implements IService<TravelocityMobileService> {

	@Autowired
	TravelocityMobilePage travelocityMobilePage;

	@Autowired
	TravelocityPageProvider travelocityPageProvider;

	@Override
	public TravelocityMobileService loadPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean mobileTAbTabCheckIfDownloadAppButtonIsEnabled() {
		return travelocityPageProvider.getTravelocityMobilePage().checkIfDownloadAppButtonisenabled();
	}

	public TravelocityMobilePage tapOnEnterMobileNumberField() {
		return travelocityMobilePage.tapOnEnterMobileField();
	}

	public String verifyMessageOnMobileScreen() {
		return travelocityMobilePage.verifyASuccessMessage();
	}
}
