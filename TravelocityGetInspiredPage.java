package com.globant.qe.in.travelocity.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.globant.qe.in.ConfigParams;
import com.globant.qe.in.browsers.BrowserLauncher;

@Component
@Lazy
public class TravelocityGetInspiredPage extends BasePage {

	public TravelocityGetInspiredPage(BrowserLauncher browserLauncher, ConfigParams configParams) {
		super(browserLauncher, configParams);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//ul[@id='menu-travelocity-sub-menu']/li")
	private List<WebElement> menuContainerList;

	@FindBy(xpath = "//textarea[@id='comment']")
	private WebElement submitACommentTextArea;

	@FindBy(xpath = "//*[@id='author']")
	private WebElement nameTextArea;

	@FindBy(xpath = "//*[@id='email']")
	private WebElement emailTextArea;

	@FindBy(xpath = "//*[@id='url']")
	private WebElement urlTextArea;

	@FindBy(xpath = "//*[@id='submit']")
	private WebElement submitACommentButton;

	public void tapOnMenuOptions() {
		Actions action = new Actions(driver);
		action.moveToElement(menuContainerList.get(1)).click(menuContainerList.get(1)).build().perform();
	}

	public TravelocityGetInspiredPage submitAComment(String comment, String name, String email, String website) {
		wait.until(ExpectedConditions.visibilityOf(submitACommentTextArea));
		submitACommentTextArea.click();
		submitACommentTextArea.sendKeys(comment);
		nameTextArea.sendKeys(name);
		emailTextArea.sendKeys(email);
		urlTextArea.sendKeys(website);
		submitACommentButton.click();
		return this;
	}
}
