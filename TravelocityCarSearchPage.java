package com.globant.qe.in.travelocity.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
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
public class TravelocityCarSearchPage extends BasePage {

	public TravelocityCarSearchPage(BrowserLauncher browserLauncher, ConfigParams configParams) {
		super(browserLauncher, configParams);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id='filter-panel']/div[3]/fieldset[1]/div[4]/span[1]/label")
	private WebElement carTypeCheckbox;

	@FindBy(xpath = "//*[@id='filter-panel']/div[3]/fieldset[2]/div[1]/span[1]/label")
	private WebElement customerRecommendationCheckbox;

	String expectedTitleOfCarPage;

	public String verifyIfCorrectDataHasComeForCar() {
		expectedTitleOfCarPage = driver.getTitle();
		return expectedTitleOfCarPage;
	}

	public void tapOnCarTypeCheckbox() {
		wait.until(ExpectedConditions.visibilityOf(carTypeCheckbox));
		carTypeCheckbox.click();
	}

	public void tapOnCustomerRecommendationCheckbox() {
		wait.until(ExpectedConditions.visibilityOf(customerRecommendationCheckbox));
		customerRecommendationCheckbox.click();
	}

	public TravelocityCarSearchPage tapOnFirstCarFromList() {
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				// <!--Perform your operation here for new window-->
				driver.close(); // closing child window
				driver.switchTo().window(parentWindow); // cntrl to parent
														// window
			}
		}

		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("#search-results .btn-label")));
		List<WebElement> carList = driver.findElements(By.cssSelector("#search-results .btn-label"));
		Actions actions = new Actions(driver);
		actions.moveToElement(carList.get(0)).click().perform();
		return this;
	}
}
