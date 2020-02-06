package com.globant.qe.in.travelocity.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.globant.qe.in.ConfigParams;
import com.globant.qe.in.browsers.BrowserLauncher;
import com.globant.qe.in.travelocity.business_service.TravelocityPackageSearchResultService;

@Component
@Lazy
public class TravelocityPackageSearchResultPage extends BasePage {

	public TravelocityPackageSearchResultPage(BrowserLauncher browserLauncher, ConfigParams configParams) {
		super(browserLauncher, configParams);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "star4")
	private WebElement pkgPropertyClass4StarCheckbox;

	@FindBy(id = "star5")
	private WebElement pkgPropertyClass5StarCheckbox;

	@FindBy(id = "star3")
	private WebElement pkgPropertyClass3StartCheckbox;

	@FindBy(id = "lodging3")
	private WebElement pkgPropertyType;

	@FindBy(css = "#resultsContainer .hotel")
	private List<WebElement> pkghotelsInASearchResult;

	@FindBy(css = "#li.actualPrice")
	private List<WebElement> pkgPropertyPrice;

	@FindBy(css = "#resultsContainer .hotel a")
	private List<WebElement> hotelList;

	@FindBy(xpath = "//button[@data-opt-group='Guest Rating']")
	private WebElement pkgPropertySortBy;

	@FindBy(xpath = "//*[@id='searchWizard']/div[2]/div[1]/div/div[2]/div[1]/button")
	private WebElement pkgData;

	@FindBy(css = "	#resultsContainer .starRating")
	private List<WebElement> starRatings;

	@FindBy(css = ".flex-area-primary")
	private List<WebElement> starRatingsSection;

	@FindBy(css = ".flex-card")
	private List<WebElement> sections;

	@FindBy(css = ".flex-link")
	private List<WebElement> eachHotelSection;

	public static final String PACKAGE_ACTUAL_TITLE = "Singapore Hotel Search Results | Travelocity";
	public String expectedTitle;
	public String priceOfHotel;
	public boolean Result;

	public String verifyIfCorrectDataHasCome() {
		wait.until(ExpectedConditions.visibilityOf(pkgData));
		expectedTitle = pkgData.getText();
		return expectedTitle;
	}

	public TravelocityPackageSearchResultPage tapOnPkgPropertyClassAndPropertyType() {
		wait.until(ExpectedConditions.visibilityOf(pkgPropertyClass4StarCheckbox));
		pkgPropertyClass4StarCheckbox.click();
		wait.until(ExpectedConditions.visibilityOf(pkgPropertyType));
		pkgPropertyType.click();
		return this;
	}

	public void tapOnPkgPropertySortBy() {
		wait.until(ExpectedConditions.visibilityOf(pkgPropertySortBy));
		pkgPropertySortBy.click();
	}

	public String getPriceOfFirstHotelInList() {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("li.actualPrice")));
		priceOfHotel = pkgPropertyPrice.get(0).getText();
		return priceOfHotel;
	}

	public TravelocityPackageSearchResultPage tapOnFirstHotelFromList() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(hotelList));
		} catch (StaleElementReferenceException e) {
			driver.findElements(By.cssSelector("#resultsContainer .hotel a"));
		}
		hotelList.get(0).click();
		return this;
	}

	public TravelocityPackageSearchResultPage validatePkgSearchResults() {

		starRatingsSection.stream().filter(rating -> {

			rating.findElement(By.cssSelector(".starRating")).getText();
			return rating.findElement(By.cssSelector(".starRating")).getText().contains("4");
		}).findFirst().get().click();

		return this;
	}

	public boolean checkStarRatedHotel() {

		for (WebElement w : starRatings) {
			System.out.println(w.getText());
			if (w.isDisplayed())
				return true;
		}

		return false;
	}
}
