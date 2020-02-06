/**
 * 
 */
package com.globant.qe.in.travelocity.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.globant.qe.in.ConfigParams;
import com.globant.qe.in.browsers.BrowserLauncher;
import com.globant.qe.in.travelocity.business_service.TravelocityHomeService;
import com.globant.qe.in.travelocity.provider.TravelocityPageProvider;

/**
 * @author priya.patekar
 *
 */
@Component
@Lazy
public class TravelocityHomePage extends BasePage {

	public TravelocityHomePage(BrowserLauncher browserLauncher, ConfigParams configParams) {
		super(browserLauncher, configParams);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "tab-package-tab-hp")
	private WebElement pkgTab;

	@FindBy(xpath = "//*[@id='gcw-hotel-form-hp-hotel']/div[8]/label/button")
	private WebElement hotelTabsearchButton;

	@FindBy(id = "tab-car-tab-hp")
	private WebElement carTab;

	@FindBy(xpath = "//*[@id='gcw-cars-form-hp-car']/div[6]/label/button[@type='submit']")
	private WebElement carTabsearchButton;

	@FindBy(xpath = "//*[@id='gcw-cruises-form-hp-cruise']/button")
	private WebElement cruiseTabsearchButton;

	@FindBy(xpath = "//*[@id='gcw-packages-form-hp-package']/div[2]/div/ul/li[1]/a")
	private WebElement emptySearchError;

	@FindBy(xpath = "//*[@id='gcw-cars-form-hp-car']/div[2]/div/ul/li[1]/a")
	private WebElement emptyCarSearchError;

	@FindBy(xpath = "//*[@id='gcw-activities-form-alp']/div[2]/div/ul/li/a")
	private WebElement emptyThingsToDoSearchError;

	@FindBy(css = "#tab-flight-tab-hp")
	private WebElement flightTab;

	@FindBy(xpath = "//*[@id='gcw-activities-form-hp-activity']/div[2]/div/ul/li/a")
	private WebElement emptyActivitiesSearchError;

	@FindBy(id = "header-account-menu")
	private WebElement accountTab;

	@FindBy(id = "account-register")
	private WebElement createAccountLink;

	@FindBy(id = "account-signin")
	private WebElement accountSignIn;

	@FindBy(id = "support-cs")
	private WebElement customerSupportMenu;

	@FindBy(id = "header-support-menu")
	private WebElement supportMenu;

	@FindBy(xpath = "//*[@class='tab-pane cf gcw-section-packages-tab on']/form//button[@type='submit']")
	private WebElement pkgTabSearchButton;

	@FindBy(xpath = "//input[@value='hotel-car']")
	private WebElement pkgHotelPlusCar;

	@FindBy(xpath = "//input[@id='hotel-destination-hp-package']")
	private WebElement pkgGoingToCity;

	@FindBy(xpath = "//input[@id='car-pickup-hp-car']")
	private WebElement carPickUp;

	@FindBy(xpath = "//input[@id='car-dropoff-hp-car']")
	private WebElement cardropoff;

	@FindBy(xpath = "//input[@id='car-pickup-date-hp-car']")
	private WebElement carPickupDate;

	@FindBy(xpath = "//input[@id='car-dropoff-date-hp-car']")
	private WebElement cardropoffDate;

	@FindBy(xpath = "//*[@id='typeaheadDataPlain']/div/li[1]")
	private WebElement pkgFirstCityInAList;

	@FindBy(xpath = "//input[@id='package-hc-departing-hp-package']")
	private WebElement pkgHotelCheckinDate;

	@FindBy(xpath = "//input[@id='package-hc-returning-hp-package']")
	private WebElement pkgHotelCheckoutDate;

	@FindBy(id = "package-rooms-hp-package")
	private WebElement pkgSelectNumberOfRooms;

	@FindBy(id = "package-1-adults-hp-package")
	private WebElement pkgSelectNumberOfAdultsInRoom;

	@FindBy(id = "package-1-children-hp-package")
	private WebElement pkgSelectNumberOfChildInRoom;

	@FindBy(id = "package-1-age-select-1-hp-package")
	private WebElement pkgSelectAgeeOfChildInRoom;

	@FindBy(id = "tab-cruise-tab-hp")
	private WebElement cruiseTab;

	@FindBy(xpath = "//*[@id='gcw-cruises-form-hp-cruise']/button/span")
	private WebElement cruiseTabSearchButton;

	@FindBy(id = "cruise-destination-hp-cruise")
	private WebElement cruiseDestinationDropDown;

	@FindBy(id = "cruise-end-date-hp-cruise")
	private WebElement cruiseEndDate;

	@FindBy(id = "primary-header-mobile")
	private WebElement mobileTab;

	@FindBy(id = "primary-header-activity")
	private WebElement thingsToDo;

	@FindBy(id = "primary-header-inspired")
	private WebElement getInspiredTab;

	@FindBy(xpath = "//*[@id='activity-destination-alp']")
	private WebElement thingsToDoDestination;

	@FindBy(id = "activity-start-alp")
	private WebElement thingsToDoFromDate;

	@FindBy(id = "activity-end-alp")
	private WebElement thingsToDoEndDate;

	@FindBy(xpath = "//*[@id='tab-activity-tab-hp']/span[2]")
	private WebElement activitiesTab;

	@FindBy(xpath = "//*[@id='gcw-activities-form-hp-activity']/button/span")
	private WebElement activitiesTabSearchButton;

	@FindBy(xpath = "//input[@id='activity-destination-hp-activity']")
	private WebElement activitiesDestination;

	@FindBy(xpath = "//input[@id='activity-start-hp-activity']")
	private WebElement activitiesFromDate;

	@FindBy(xpath = "//input[@id='activity-end-hp-activity']")
	private WebElement activitiesEndDate;

	@FindBy(xpath = "//*[@id='gcw-activities-form-alp']/button/span")
	private WebElement thingsToDoSearchButton;

	public static final String ACTUAL_ERROR = "Customer Service Portal";
	public String expectedError;
	public String expectedEmptyCarSearchError;
	public String expectedEmptyThingsToDoSearchError;

	public static final String ACTUAL_TITLE = "Wander Wisely with Cheap Hotels, Flights, Vacations & Travel Deals | Travelocity";
	public String expectedTitle;

	public String colorBeforeHover;
	public String colorAfterHover;

	@FindBy(xpath = "//div[@class='cf']/div[2]/ul/li")
	private List<WebElement> linkElements;
	String underConsTitle = "Under Construction: Mercury Tours";
	int i = 0;
	int Flag = 0;

	public TravelocityHomePage getPage() {
		if (!driver.getCurrentUrl().equals(configParams.baseUrl)) {
			driver.get(configParams.baseUrl);
		}
		return this;
	}

	public String getHomeScreenTitle() {
		expectedTitle = driver.getTitle();
		return expectedTitle;
	}

	public boolean checkifHomeSearchButtonsEnabled() {
		return hotelTabsearchButton.isEnabled();
	}

	public TravelocityHomePage getColorValueOfHomeTabs() {
		Actions action = new Actions(driver);
		Action mouseHover = action.moveToElement(flightTab).build();
		colorBeforeHover = flightTab.getCssValue("color");
		mouseHover.perform();
		colorAfterHover = flightTab.getCssValue("color");
		return this;
	}

	public TravelocityHomePage clickOnAccountlink() {
		accountTab.click();
		return this;
	}

	public void clickOnCreateAccountlink() {
		createAccountLink.click();
	}

	public void clickOnAccountSignIn() {
		accountSignIn.click();
	}

	public TravelocityHomePage clickOnSupportMenu() {
		supportMenu.click();
		return this;
	}

	public void clickOncustomerSupportMenu() {
		customerSupportMenu.click();
	}

	public TravelocityHomePage tapOnPackageTab() {
		pkgTab.click();
		return this;
	}

	public String getErrorOnEmptySearch() {
		expectedError = emptySearchError.getText();
		return expectedError;
	}

	public TravelocityHomePage tapOnHotelPlusCar() {
		Actions action = new Actions(driver);
		action.moveToElement(pkgHotelPlusCar).click().build().perform();
		return this;
	}

	public TravelocityHomePage tapOnGoingToCity(String city) {
		wait.until(ExpectedConditions.visibilityOf(pkgGoingToCity));
		this.pkgGoingToCity.click();
		pkgGoingToCity.sendKeys(city);
		wait.until(ExpectedConditions.visibilityOf(pkgFirstCityInAList));
		pkgFirstCityInAList.click();
		return this;
	}

	public TravelocityHomePage tapOnCarPickUp(String pickup) {
		wait.until(ExpectedConditions.visibilityOf(carPickUp));
		this.carPickUp.click();
		carPickUp.sendKeys(pickup);
		return this;
	}

	public TravelocityHomePage tapOnCarPickupDate(String pickUpDate) {
		wait.until(ExpectedConditions.visibilityOf(carPickupDate));
		this.carPickupDate.click();
		carPickupDate.sendKeys(pickUpDate);
		return this;
	}

	public TravelocityHomePage tapOnCarDropOff(String dropoff) {
		wait.until(ExpectedConditions.visibilityOf(cardropoff));
		this.cardropoff.click();
		cardropoff.sendKeys(dropoff);
		return this;
	}

	public TravelocityHomePage tapOnCarDropOffDate(String dropoffDate) {
		wait.until(ExpectedConditions.visibilityOf(cardropoffDate));
		this.cardropoffDate.click();
		cardropoffDate.sendKeys(dropoffDate);
		return this;
	}

	public TravelocityHomePage tapOnCheckInDate(String checkInDate) {
		wait.until(ExpectedConditions.visibilityOf(pkgHotelCheckinDate));
		this.pkgHotelCheckinDate.click();
		pkgHotelCheckinDate.sendKeys(checkInDate);
		return this;
	}

	public TravelocityHomePage tapOnCheckOutDate(String checkOutDate) {
		wait.until(ExpectedConditions.visibilityOf(pkgHotelCheckoutDate));
		this.pkgHotelCheckoutDate.sendKeys(Keys.chord(Keys.CONTROL, "a"), checkOutDate);
		return this;
	}

	public TravelocityHomePage packageSelectNumberOfRooms() {
		Select pkgNumberofRooms = new Select(pkgSelectNumberOfRooms);
		pkgNumberofRooms.selectByValue("1");
		return this;
	}

	public TravelocityHomePage packageSelectNumberOfAdults() {
		Select pkgNumberofRooms = new Select(pkgSelectNumberOfAdultsInRoom);
		pkgNumberofRooms.selectByValue("2");
		return this;
	}

	public TravelocityHomePage packageSelectNumberOfChildrens() {
		Select pkgNumberofChild = new Select(pkgSelectNumberOfChildInRoom);
		pkgNumberofChild.selectByValue("1");
		return this;
	}

	public TravelocityHomePage packageSelectAgeOfChildrens() {
		Select pkgAgeOfChild = new Select(pkgSelectAgeeOfChildInRoom);
		pkgAgeOfChild.selectByValue("2");
		return this;
	}

	public TravelocityHomePage tapOnPackageTabSearchbutton() {
		pkgTabSearchButton.click();
		return this;
	}

	public TravelocityHomePage tapOnCarTab() {
		carTab.click();
		return this;
	}

	public TravelocityHomePage tapOnCarTabSearchbutton() {
		wait.until(ExpectedConditions.visibilityOf(carTabsearchButton));
		Actions actions = new Actions(driver);
		actions.moveToElement(carTabsearchButton).click().perform();
		return this;
	}

	public String getErrorOnEmptyCarSearch() {
		expectedEmptyCarSearchError = emptyCarSearchError.getText();
		return expectedEmptyCarSearchError;
	}

	public TravelocityHomePage tapOnCruiseTab() {
		cruiseTab.click();
		return this;
	}

	public void tapOnCruiseTabSearchButton() {
		Actions actions = new Actions(driver);
		actions.moveToElement(cruiseTabSearchButton).click().perform();
	}

	public TravelocityHomePage tapOncruiseDestinationDropDown() {
		wait.until(ExpectedConditions.elementToBeClickable(cruiseDestinationDropDown));
		Select country = new Select(cruiseDestinationDropDown);
		country.selectByValue("europe");
		return this;
	}

	public TravelocityHomePage tapOncruiseStartDate(String startDate) {
		WebElement cruiseStartDate = driver.findElement(By.id("cruise-start-date-hp-cruise"));
		wait.until(ExpectedConditions.elementToBeClickable(cruiseStartDate));
		cruiseStartDate.sendKeys(startDate);
		return this;
	}

	public TravelocityHomePage tapOncruiseEndDate(String endDate) {
		wait.until(ExpectedConditions.visibilityOf(cruiseEndDate));
		this.cruiseEndDate.click();
		cruiseEndDate.sendKeys(endDate);
		return this;
	}

	public void tapOnMobileTab() {
		wait.until(ExpectedConditions.visibilityOf(mobileTab));
		mobileTab.click();
	}

	public TravelocityHomePage tapOnThingsToDo() {
		wait.until(ExpectedConditions.visibilityOf(thingsToDo));
		thingsToDo.click();
		return this;
	}

	public TravelocityHomePage tapOnThingsToDoDestination(String destination) {
		wait.until(ExpectedConditions.visibilityOf(thingsToDoDestination));
		this.thingsToDoDestination.click();
		thingsToDoDestination.sendKeys(destination);
		return this;
	}

	public TravelocityHomePage tapOnFromDate(String fromDate) {
		wait.until(ExpectedConditions.visibilityOf(thingsToDoFromDate));
		this.thingsToDoFromDate.sendKeys(Keys.chord(Keys.CONTROL, "a"), fromDate);
		return this;
	}

	public TravelocityHomePage tapOnEndDate(String endDate) {
		wait.until(ExpectedConditions.visibilityOf(thingsToDoEndDate));
		this.thingsToDoEndDate.sendKeys(Keys.chord(Keys.CONTROL, "a"), endDate);
		return this;
	}

	public void tapOnThingsToDoTabSearchButton() {
		Actions actions = new Actions(driver);
		actions.moveToElement(thingsToDoSearchButton).click().perform();
	}

	public String getErrorOnEmptyThingsToDoSearch() {
		expectedEmptyThingsToDoSearchError = emptyThingsToDoSearchError.getText();
		return expectedEmptyThingsToDoSearchError;
	}

	public int brokenLinks() {
		String[] linkTexts = new String[linkElements.size()];
		for (WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			i++;
		}
		for (String t : linkTexts) {
			wait.until(ExpectedConditions.visibilityOfAllElements(linkElements));
			driver.findElement(By.linkText(t)).click();
			if (driver.getTitle().equals(underConsTitle)) {
				System.out.println("\"" + t + "\"" + " is under construction.");
			} else {
				System.out.println("\"" + t + "\"" + " is working.");
				Flag = 1;
			}
			driver.navigate().back();
		}
		return Flag;
	}

	public void tapOnGetInspiredTab() {
		getInspiredTab.click();
	}

	public void tapOnActivitiesTab() {
		activitiesTab.click();
	}

	public void tapOnActivitiesTabSearchButton() {
		Actions actions = new Actions(driver);
		actions.moveToElement(activitiesTabSearchButton).click().build().perform();
	}

	public String getErrorOnActivitiesSearch() {
		String expectedEmptyActivitiesSearchError = emptyActivitiesSearchError.getText();
		return expectedEmptyActivitiesSearchError;
	}

	public TravelocityHomePage tapOnActivitiesDestination(String activityDestination) {
		wait.until(ExpectedConditions.visibilityOf(activitiesDestination));
		this.activitiesDestination.click();
		activitiesDestination.sendKeys(activityDestination);
		return this;
	}

	public TravelocityHomePage tapOnActivitiesFromDate(String activityFromDate) {
		wait.until(ExpectedConditions.visibilityOf(activitiesFromDate));
		this.activitiesFromDate.sendKeys(Keys.chord(Keys.CONTROL, "a"), activityFromDate);
		return this;
	}

	public TravelocityHomePage tapOnActivitiesEndDate(String activityEndDate) {
		wait.until(ExpectedConditions.visibilityOf(activitiesEndDate));
		this.activitiesEndDate.sendKeys(Keys.chord(Keys.CONTROL, "a"), activityEndDate);
		return this;
	}
}