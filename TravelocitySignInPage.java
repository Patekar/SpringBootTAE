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
public class TravelocitySignInPage extends BasePage {

	public TravelocitySignInPage(BrowserLauncher browserLauncher, ConfigParams configParams) {
		super(browserLauncher, configParams);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "gss-signin-login-facebook-button")
	private WebElement signInWithFbLink;

	@FindBy(id = "gss-signin-email")
	private WebElement signInEmailField;

	@FindBy(id = "gss-signin-password")
	private WebElement signInPasswordField;

	@FindBy(id = "gss-signin-submit")
	private WebElement signInSubmitbutton;

	@FindBy(xpath = "//div[@aria-label='Need an account?']")
	private WebElement signInNeedAnAccount;

	public boolean checkIfSignInWithFbIsPresent() {
		return signInWithFbLink.isDisplayed();
	}

	public TravelocitySignInPage signInEnterEmail(String email2) {
		wait.until(ExpectedConditions.visibilityOf(signInEmailField));
		this.signInEmailField.clear();
		this.signInEmailField.sendKeys(email2);
		return this;
	}

	public TravelocitySignInPage signInEnterPassword(String passsword1) {
		wait.until(ExpectedConditions.visibilityOf(signInPasswordField));
		this.signInPasswordField.clear();
		this.signInPasswordField.sendKeys(passsword1);
		return this;
	}

	public TravelocitySignInPage clickOnSignInButton() {
		wait.until(ExpectedConditions.visibilityOf(signInSubmitbutton));
		signInSubmitbutton.click();
		return this;
	}

	public TravelocitySignInPage getSignInPage() {
		travelocityPageProvider.getTravelocityHomePage().getPage().clickOnAccountlink().clickOnAccountSignIn();
		return this;

	}
}
