package com.globant.qe.in.travelocity.business_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.globant.qe.in.IService;
import com.globant.qe.in.travelocity.pages.TravelocityThingsToDoPage;
import com.globant.qe.in.travelocity.provider.TravelocityPageProvider;

@Service
@Lazy
public class TravelocityActivitiesService implements IService<TravelocityActivitiesService> {

	@Autowired
	TravelocityPageProvider travelocityPageProvider;

	@Override
	public TravelocityActivitiesService loadPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public String validateactivitiesPageTitle() {
		return travelocityPageProvider.getTravelocityActivitiesPage().validateActivitiesPageTitle();
	}
}
