package com.globant.qe.in.travelocity.business_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.globant.qe.in.IService;
import com.globant.qe.in.travelocity.pages.TravelocityCruiseSearchResultPage;

@Service
@Lazy
public class TravelocityCruiseSearchResultService implements IService<TravelocityCruiseSearchResultService> {

	@Autowired
	TravelocityCruiseSearchResultPage travelocityCruiseSearchResultPage;

	@Override
	public TravelocityCruiseSearchResultService loadPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCruiseSearchPageHaader() {
		return travelocityCruiseSearchResultPage.verifyIfCorrectDataHasComeForCruise();
	}

	public boolean getCruiseSearchCity() {
		return travelocityCruiseSearchResultPage.verifyIfAllResultsContainCorrectCity();
	}
}
