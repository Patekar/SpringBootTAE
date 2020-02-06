package com.globant.qe.in.travelocity.business_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.globant.qe.in.IService;
import com.globant.qe.in.travelocity.pages.TravelocityCarSearchPage;
import com.globant.qe.in.travelocity.pages.TravelocityCarSelectPage;

@Service
@Lazy
public class TravelocityCarSearchResultService implements IService<TravelocityCarSearchResultService> {

	@Autowired
	TravelocityCarSearchPage travelocityCarSearchPage;

	@Autowired
	TravelocityCarSelectPage travelocityCarSelectPage;

	@Override
	public TravelocityCarSearchResultService loadPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public String verifyIfCorrectDataHasComeForCar() {
		return travelocityCarSearchPage.verifyIfCorrectDataHasComeForCar();
	}

	public void carTapOnSortingOptions() {
		travelocityCarSearchPage.tapOnCarTypeCheckbox();
		travelocityCarSearchPage.tapOnCustomerRecommendationCheckbox();
	}

	public TravelocityCarSearchResultService carTapOnFirstCarFromList() {
		travelocityCarSearchPage.tapOnFirstCarFromList();
		return this;
	}

	public void carTapOnSelectButton() {
		travelocityCarSelectPage.tapOnCarSelectButton();
	}
}
