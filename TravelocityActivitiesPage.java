package com.globant.qe.in.travelocity.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.globant.qe.in.ConfigParams;
import com.globant.qe.in.browsers.BrowserLauncher;
import com.globant.qe.in.travelocity.models.ThingsToDoData;

@Component
@Lazy
public class TravelocityActivitiesPage extends BasePage {

	public TravelocityActivitiesPage(BrowserLauncher browserLauncher, ConfigParams configParams) {
		super(browserLauncher, configParams);
		// TODO Auto-generated constructor stub
	}

	public String validateActivitiesPageTitle() {
		String activitiesPageTitle = driver.getTitle();
		return activitiesPageTitle;
	}
}
