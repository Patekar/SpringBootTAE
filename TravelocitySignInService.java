package com.globant.qe.in.travelocity.business_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.globant.qe.in.IService;
import com.globant.qe.in.travelocity.models.TravelocityCreateAnAccountData;
import com.globant.qe.in.travelocity.provider.TravelocityPageProvider;

@Service
@Lazy
public class TravelocitySignInService implements IService<TravelocitySignInService> {

	@Autowired
	TravelocityPageProvider travelocityPageProvider;

	@Override
	public TravelocitySignInService loadPage() {
		travelocityPageProvider.getTravelocitySignInPage().getSignInPage();
		return this;
	}

	public TravelocitySignInService fillSignInDetails(TravelocityCreateAnAccountData travelocityCreateAnAccountData) {
		travelocityPageProvider.getTravelocitySignInPage().signInEnterEmail(travelocityCreateAnAccountData.getEmail())
				.signInEnterPassword(travelocityCreateAnAccountData.getPassword()).clickOnSignInButton();
		return this;
	}
}
