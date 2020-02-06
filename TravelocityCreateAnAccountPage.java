package com.globant.qe.in.travelocity.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.globant.qe.in.ConfigParams;
import com.globant.qe.in.browsers.BrowserLauncher;
import com.globant.qe.in.travelocity.models.TravelocityCreateAnAccountData;
import com.globant.qe.in.travelocity.provider.TravelocityPageProvider;

@Component
@Lazy
public class TravelocityCreateAnAccountPage extends BasePage {

	public TravelocityCreateAnAccountPage(BrowserLauncher browserLauncher, ConfigParams configParams) {
		super(browserLauncher, configParams);
	}

	@FindBy(xpath = "//input[@id='gss-signup-first-name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='gss-signup-last-name']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='gss-signup-email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='gss-signup-password']")
	private WebElement passwordField;

	@FindBy(id = "gss-signup-submit")
	private WebElement signupButton;

	public TravelocityCreateAnAccountPage getCreateAnAccountPage() {
		travelocityPageProvider.getTravelocityHomePage().getPage().clickOnAccountlink().clickOnCreateAccountlink();
		return this;

	}

	public TravelocityCreateAnAccountPage setFirstname(String userFirstName) {
		wait.until(ExpectedConditions.visibilityOf(firstName));
		this.firstName.clear();
		this.firstName.sendKeys(userFirstName);
		return this;
	}

	public TravelocityCreateAnAccountPage setLastname(String userLastName) {
		wait.until(ExpectedConditions.visibilityOf(lastName));
		this.lastName.clear();
		this.lastName.sendKeys(userLastName);
		return this;
	}

	public TravelocityCreateAnAccountPage setEmail(String userEmail) {
		wait.until(ExpectedConditions.visibilityOf(email));
		this.email.clear();
		this.email.sendKeys(userEmail);
		return this;
	}

	public TravelocityCreateAnAccountPage setPassword(String userPasssword) {
		wait.until(ExpectedConditions.visibilityOf(passwordField));
		this.passwordField.clear();
		this.passwordField.sendKeys(userPasssword );
		return this;
	}

	public TravelocityCreateAnAccountPage clickOnSignupButton() {
		wait.until(ExpectedConditions.visibilityOf(signupButton));
		signupButton.click();
		return this;
	}
}
