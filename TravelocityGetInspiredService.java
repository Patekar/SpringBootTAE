package com.globant.qe.in.travelocity.business_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.globant.qe.in.IService;
import com.globant.qe.in.travelocity.models.GetInspiredTabVerificationtestData;
import com.globant.qe.in.travelocity.models.TravelocityCreateAnAccountData;
import com.globant.qe.in.travelocity.pages.TravelocityGetInspiredPage;
import com.globant.qe.in.travelocity.provider.TravelocityPageProvider;

@Service
@Lazy
public class TravelocityGetInspiredService implements IService<TravelocityGetInspiredService> {

	@Override
	public TravelocityGetInspiredService loadPage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	TravelocityGetInspiredPage travelocityGetInspiredPage;

	@Autowired
	TravelocityPageProvider travelocityPageProvider;

	@Autowired
	GetInspiredTabVerificationtestData getInspiredTabVerificationtestData;

	public void travelocityTapOnMenuOptions() {
		travelocityGetInspiredPage.tapOnMenuOptions();
	}

	public TravelocityGetInspiredService travelocitysubmitAComment(
			GetInspiredTabVerificationtestData getInspiredTabVerificationtestData) {
		travelocityPageProvider.getTravelocityGetInspiredPage().submitAComment(
				getInspiredTabVerificationtestData.getComment(), getInspiredTabVerificationtestData.getName(),
				getInspiredTabVerificationtestData.getName(), getInspiredTabVerificationtestData.getWebsite());
		return this;
	}
}
