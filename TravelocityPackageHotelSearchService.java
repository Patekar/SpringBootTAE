package com.globant.qe.in.travelocity.business_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.globant.qe.in.IService;
import com.globant.qe.in.travelocity.pages.TravelocityPackageChooseYourRoomPage;
import com.globant.qe.in.travelocity.provider.TravelocityPageProvider;

@Service
@Lazy
public class TravelocityPackageHotelSearchService implements IService<TravelocityPackageHotelSearchService> {

	@Autowired
	TravelocityPageProvider travelocityPageProvider;

	@Autowired
	TravelocityPackageChooseYourRoomPage travelocityPackageHotelSearchPage;

	@Override
	public TravelocityPackageHotelSearchService loadPage() {
		// TODO Auto-generated method stub
		return null;
	}

}
