package com.globant.qe.in.travelocity.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.globant.qe.in.ConfigParams;
import com.globant.qe.in.browsers.BrowserLauncher;
import com.globant.qe.in.travelocity.models.CruiseData;

@Component
@Lazy
public class TravelocityCruiseSearchResultPage extends BasePage {

	public TravelocityCruiseSearchResultPage(BrowserLauncher browserLauncher, ConfigParams configParams) {
		super(browserLauncher, configParams);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = ".flex-card")
	private List<WebElement> cruiseSection;

	@FindBy(css = "destination-select")
	private WebElement cruiseGoingToHeader;

	@Autowired
	CruiseData cruiseData;

	String expectedTitle;

	public String verifyIfCorrectDataHasComeForCruise() {
		expectedTitle = driver.getTitle();
		return expectedTitle;
	}

	public boolean verifyIfAllResultsContainCorrectCity() {
		wait.until(ExpectedConditions.visibilityOfAllElements(cruiseSection));
		cruiseSection.stream().filter(cruise -> {
			cruise.findElement(By.cssSelector(".subtitle-on-ship-image")).getText();
			if (cruise.findElement(By.cssSelector(".subtitle-on-ship-image")).getText()
					.contains(cruiseData.getCruiseGoingTo()))
				;
			{
				return true;
			}

		});
		return false;
	}

}
