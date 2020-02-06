package com.globant.qe.in.travelocity.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.globant.qe.in.ConfigParams;
import com.globant.qe.in.browsers.BrowserLauncher;

@Component
@Lazy
public class TravelocityCustomerSupportPage extends BasePage {

	public TravelocityCustomerSupportPage(BrowserLauncher browserLauncher, ConfigParams configParams) {
		super(browserLauncher, configParams);
	}

	@FindBy(xpath = "//button[@data-modal-id='jspModalContent']")
	private WebElement contactUsButton;

	@FindBy(xpath = "//input[@id='search-term']")
	private WebElement searchBox;

	@FindBy(xpath = "//button[@aria-label='Search']")
	private WebElement searchIcon;

	@FindBy(xpath = "//li[@id='result-416']/article")
	private WebElement broseHelpTopicFlight;

	public static final String ACTUAL_SCREENTITLE = "Customer Service Portal";
	public String expectedTitleOfScreen;

	public TravelocityCustomerSupportPage getTravelocityCustomerSupportValidationPage() {
		travelocityPageProvider.getTravelocityHomePage().getPage().clickOnSupportMenu().clickOncustomerSupportMenu();
		return this;
	}

	public String getTitleOfCustomerSupportScreen() {
		expectedTitleOfScreen = driver.getTitle();
		return expectedTitleOfScreen;
	}

	public boolean checkIfContactUsButtonEnabled() {
		return contactUsButton.isEnabled();
	}

	public TravelocityCustomerSupportPage verifySearchBoxFunctionality() {
		searchBox.sendKeys("Cruises");
		searchBox.click();
		return this;
	}
}