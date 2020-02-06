package com.globant.qe.in.travelocity.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.globant.qe.in.ConfigParams;
import com.globant.qe.in.browsers.BrowserLauncher;

@Component
@Lazy
public class TravelocityPackageChooseYourRoomPage extends BasePage {

	public TravelocityPackageChooseYourRoomPage(BrowserLauncher browserLauncher, ConfigParams configParams) {
		super(browserLauncher, configParams);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//li/a[@class='preventajax']")
	private List<WebElement> pkgHotelSearchBreadcrumb;

	@FindBy(xpath = "//*[@id='mock-book-button']")
	private WebElement pkgHotelSearchChooseARoomButton;

	@FindBy(xpath = "//span[@class='room-price ']")
	private List<WebElement> pkgHotelSearchPrices;

	@FindBy(xpath = "//*[@id='hpg-menu']/ul/li/button/span")
	private WebElement pkgPriceGuaranteeCheckbox;

	@FindBy(css = "#rooms-and-rates .btn-label")
	private List<WebElement> pkgChooseRoomSelectButton;

	@FindBy(css = ".room-price-book-button-wrapper")
	private List<WebElement> pkgChooseRoomSection;

	@FindBy(css = "#rooms-and-rates .room-price")
	private List<WebElement> pkgChooseRoomPrice;

	@FindBy(xpath = "//article[@class='segment no-target room cf room-above-fold']")
	private List<WebElement> listOfSelectButton;

	@FindBy(xpath = "//span[@class='room-price']")
	private List<WebElement> priceOfHotels;

	@FindBy(css = "#rooms-and-rates .bed-type")
	private List<WebElement> pkgBedType;
	int flag = 0;

	@FindBy(css = ".room-price")
	private List<WebElement> RoomPrice;

	@FindBy(css = ".book-button-wrapper a")
	private List<WebElement> selectButton;

	String LANDING_PAGE_TITLE;

	public TravelocityPackageChooseYourRoomPage checkThePressenceOfButtons() {
		wait.until(ExpectedConditions.elementToBeClickable(pkgHotelSearchChooseARoomButton));
		boolean chooseARoomButtonIsEnabled = pkgHotelSearchChooseARoomButton.isEnabled();
		if (chooseARoomButtonIsEnabled == true)
			wait.until(ExpectedConditions.elementToBeClickable(pkgHotelSearchChooseARoomButton));
		pkgHotelSearchChooseARoomButton.click();
		pkgChooseRoomSection.stream().filter(elem -> {
			return elem.findElement(By.cssSelector(".room-price")).getText().contains("$0.00");
		}).findFirst().get().findElement(By.cssSelector(".book-button-wrapper a")).click();
		return this;
	}

	public String verifyLandingPageTitle() {
		LANDING_PAGE_TITLE = driver.getTitle();
		return LANDING_PAGE_TITLE;
	}

	public TravelocityPackageChooseYourRoomPage checkIfPriceGuaranteeCheckboxIsPresent() {
		pkgPriceGuaranteeCheckbox.isDisplayed();
		return this;
	}

	public void switchToPackageChooseYourRoomPage() {
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();

		for (String childWindowHandle : windowHandles) {
			if (!childWindowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(childWindowHandle);
			}
		}
	}
}
