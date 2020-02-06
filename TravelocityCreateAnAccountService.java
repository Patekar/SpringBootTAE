package com.globant.qe.in.travelocity.business_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.globant.qe.in.IService;
import com.globant.qe.in.travelocity.models.TravelocityCreateAnAccountData;
import com.globant.qe.in.travelocity.provider.TravelocityPageProvider;
import com.globant.qe.in.yahoo.business_service.SignUpService;
import com.globant.qe.in.yahoo.models.SignUpData;

@Service
@Lazy
public class TravelocityCreateAnAccountService implements IService<TravelocityCreateAnAccountService> {

	@Autowired
	TravelocityPageProvider travelocityPageProvider;

	@Override
	public TravelocityCreateAnAccountService loadPage() {
		travelocityPageProvider.getTravelocityCreateAnAccountPage().getCreateAnAccountPage();
		return this;
	}

	public TravelocityCreateAnAccountService fillCreateAnAccountDetails(
			TravelocityCreateAnAccountData travelocityCreateAnAccountData) {
		travelocityPageProvider.getTravelocityCreateAnAccountPage()
				.setFirstname(travelocityCreateAnAccountData.getFirstName())
				.setLastname(travelocityCreateAnAccountData.getLastName())
				.setEmail(travelocityCreateAnAccountData.getEmail())
				.setPassword(travelocityCreateAnAccountData.getPassword()).clickOnSignupButton();
		return this;
	}
}
