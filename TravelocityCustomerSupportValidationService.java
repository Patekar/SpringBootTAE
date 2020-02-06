package com.globant.qe.in.travelocity.business_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.globant.qe.in.IService;
import com.globant.qe.in.travelocity.pages.TravelocityCustomerSupportPage;
import com.globant.qe.in.travelocity.provider.TravelocityPageProvider;

@Service
@Lazy
public class TravelocityCustomerSupportValidationService
		implements IService<TravelocityCustomerSupportValidationService> {

	@Autowired
	TravelocityPageProvider travelocityPageProvider;

	@Override
	public TravelocityCustomerSupportValidationService loadPage() {
		// TODO Auto-generated method stub
		return this;
	}

	public String customerSupportValidateTitleOfScreen() {
		return travelocityPageProvider.gettravelocityCustomerSupportPage().getTitleOfCustomerSupportScreen();
	}

	public boolean customerSupportcheckIfContactUsButtonEnabled() {
		return travelocityPageProvider.gettravelocityCustomerSupportPage().checkIfContactUsButtonEnabled();
	}

	public TravelocityCustomerSupportPage customerSupportVerifySearchBoxFunctionality() {
		return travelocityPageProvider.gettravelocityCustomerSupportPage().verifySearchBoxFunctionality();
	}
}
