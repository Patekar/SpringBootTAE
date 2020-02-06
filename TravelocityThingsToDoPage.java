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
public class TravelocityThingsToDoPage extends BasePage {

	@FindBy(css = "#header-history")
	private WebElement thingsToDoMyList;

	@Autowired
	ThingsToDoData thingsToDoData;

	String heartIconText;

	public TravelocityThingsToDoPage(BrowserLauncher browserLauncher, ConfigParams configParams) {
		super(browserLauncher, configParams);
		// TODO Auto-generated constructor stub
	}

	public TravelocityThingsToDoPage getFirstThingToDoInList() {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a.flex-link")));
		List<WebElement> ThingToDoList = driver.findElements(By.cssSelector("a.flex-link"));
		ThingToDoList.get(0).click();
		return this;
	}

	public TravelocityThingsToDoPage tapOnHeartIconToSaveIt() {
		List<WebElement> HeartIconToSaveIt = driver.findElements(By.cssSelector(".activityHeartBtnContainerReviewed"));
		Actions actions = new Actions(driver);
		actions.moveToElement(HeartIconToSaveIt.get(0)).click().perform();
		heartIconText = HeartIconToSaveIt.get(0).getText();
		return this;
	}

	public TravelocityThingsToDoPage thingsToDoMyListValidation() {
		wait.until(ExpectedConditions.visibilityOf(thingsToDoMyList));
		thingsToDoMyList.click();
		List<WebElement> HotelInList = driver.findElements(By.cssSelector("#uitk-tabs-container .uitk-card-link"));
		Iterator<WebElement> iter = HotelInList.iterator();

		while (iter.hasNext()) {
			WebElement we = iter.next();

			if (we.getText().equals(heartIconText)) {
				we.click();
			}
		}
		return this;
	}

	public String validateThingsToDoPageTitle() {
		String thingsToDoPageTitle = driver.getTitle();
		return thingsToDoPageTitle;
	}
}
