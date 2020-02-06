package com.globant.qe.in.travelocity.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.globant.qe.in.ConfigParams;
import com.globant.qe.in.browsers.BrowserLauncher;

@Component
@Lazy
public class TravelocityCarSelectPage extends BasePage {

	public TravelocityCarSelectPage(BrowserLauncher browserLauncher, ConfigParams configParams) {
		super(browserLauncher, configParams);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "#dropoff-search-results .select")
	private WebElement carSelectButton;

	public void tapOnCarSelectButton() {
		wait.until(ExpectedConditions.visibilityOf(carSelectButton));
		carSelectButton.click();
	}
}
