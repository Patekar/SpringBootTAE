package com.globant.qe.in.travelocity.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeMethod;

import com.globant.qe.in.ConfigParams;
import com.globant.qe.in.browsers.BrowserLauncher;
import com.globant.qe.in.pagebase.AbtractBasePage;
import com.globant.qe.in.yahoo.provider.PageProvider;
import com.globant.qe.in.travelocity.provider.TravelocityPageProvider;

public abstract class BasePage extends AbtractBasePage {

	public BasePage(BrowserLauncher browserLauncher, ConfigParams configParams) {
		super(browserLauncher, configParams);
	}

	@Autowired
	protected PageProvider pageProvider;
	protected TravelocityPageProvider travelocityPageProvider;
}