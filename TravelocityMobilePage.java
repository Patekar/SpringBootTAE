package com.globant.qe.in.travelocity.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.globant.qe.in.ConfigParams;
import com.globant.qe.in.browsers.BrowserLauncher;

@Component
@Lazy
public class TravelocityMobilePage extends BasePage {

	public TravelocityMobilePage(BrowserLauncher browserLauncher, ConfigParams configParams) {
		super(browserLauncher, configParams);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "appDLphoneNumber")
	private WebElement enterMobileField;

	@FindBy(id = "appDL-btn-action")
	private WebElement downloadButton;

	@FindBy(xpath = "//*[@id='appDLphNumErrMsg']")
	private WebElement errorMessage;

	@FindBy(xpath = "//*[@id='appDLSuccessDiv']/h5")
	private WebElement successMessage;

	public String expectedErrorMessage;
	public String expectedSuccessMessage;

	public static final String ACTUAL_MESSAGE = "Thank you! A text with the download link has been sent to your mobile device.";

	public boolean checkIfDownloadAppButtonisenabled() {
		return downloadButton.isEnabled();
	}

	public TravelocityMobilePage tapOnEnterMobileField() {
		enterMobileField.sendKeys("9604398509");
		downloadButton.click();
		return this;
	}

	public String verifyAnErrorMessage() {
		wait.until(ExpectedConditions.visibilityOf(errorMessage));
		expectedErrorMessage = errorMessage.getText();
		return expectedErrorMessage;
	}

	public String verifyASuccessMessage() {
		wait.until(ExpectedConditions.visibilityOf(successMessage));
		expectedSuccessMessage = successMessage.getText();
		return expectedSuccessMessage;
	}
}