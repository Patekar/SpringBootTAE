package com.globant.qe.in.travelocity.business_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.globant.qe.in.IService;
import com.globant.qe.in.travelocity.pages.TravelocityThingsToDoPage;
import com.globant.qe.in.travelocity.provider.TravelocityPageProvider;

@Service
@Lazy
public class TravelocityThingsToDoService implements IService<TravelocityThingsToDoService> {

	@Autowired
	TravelocityPageProvider travelocityPageProvider;

	@Override
	public TravelocityThingsToDoService loadPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public TravelocityThingsToDoPage travelocityTapOnHeartIconToSaveIt() {
		return travelocityPageProvider.getTravelocityThingsToDoPage().tapOnHeartIconToSaveIt()
				.thingsToDoMyListValidation();
	}

	public String validatethingsToDoPageTitle() {
		return travelocityPageProvider.getTravelocityThingsToDoPage().validateThingsToDoPageTitle();
	}
}
