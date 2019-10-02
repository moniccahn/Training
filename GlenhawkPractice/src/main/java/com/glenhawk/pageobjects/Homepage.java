package com.glenhawk.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.glenhawk.base.TestBase;

public class Homepage extends TestBase {

	public Homepage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".burger span")
	public WebElement Burgermenu;

	@FindBy(linkText = "Products")
	public WebElement Products;

	@FindBy(xpath = "//ul/li[2]/ul/li[4]/a")
	public WebElement Residentiallink;

	@FindBy(linkText = "Development")
	public WebElement Developmentlink;

	@FindBy(linkText = "Commercial")
	public WebElement Commerciallink;

	@FindBy(linkText = "Auction")
	public WebElement Auctionlink;

	@FindBy(linkText = "2nd Charge")
	public WebElement secondChargelink;
	
	@FindBy(linkText = "About Us")
	public WebElement AboutUslink;
	
	public void clickAboutUslink(){
		Actions x = new Actions(driver);

		x.moveToElement(AboutUslink).build().perform();
		
	}

	public void clickResidential() {
		Actions x = new Actions(driver);

		x.moveToElement(Products).build().perform();
		x.moveToElement(Residentiallink).build().perform();

		// WebDriverWait wait=new WebDriverWait(driver,100);

		Residentiallink.click();
		// wait.until(ExpectedConditions.elementToBeClickable(Residential));

	}

	public void clickAuctionlink() {
		Actions x = new Actions(driver);

		x.moveToElement(Products).build().perform();
		x.moveToElement(Auctionlink).build().perform();

		// WebDriverWait wait=new WebDriverWait(driver,100);

		Auctionlink.click();

	}

	public void clickCommerciallink() {
		Actions x = new Actions(driver);

		x.moveToElement(Products).build().perform();
		x.moveToElement(Commerciallink).build().perform();

		// WebDriverWait wait=new WebDriverWait(driver,100);

		Commerciallink.click();

	}

	public void clickDevelopmentlink() {
		Actions x = new Actions(driver);

		x.moveToElement(Products).build().perform();
		x.moveToElement(Developmentlink).build().perform();

		// WebDriverWait wait=new WebDriverWait(driver,100);

		Developmentlink.click();

	}

	public void clicksecondChargelink() {
		Actions x = new Actions(driver);

		x.moveToElement(Products).build().perform();
		x.moveToElement(secondChargelink).build().perform();

		// WebDriverWait wait=new WebDriverWait(driver,100);

		secondChargelink.click();

	}

	/*
	 * }
	 * 
	 * @FindBy(linkText = "News") public WebElement Newslink;
	 * 
	 * public void clickNewslink() { Actions x = new Actions(driver);
	 * x.moveToElement(Newslink).build().perform();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 100);
	 * wait.until(ExpectedConditions.elementToBeClickable(Newslink));
	 * 
	 * }
	 */

	/*
	 * public void clickCommercial() { Commerciallink.click();
	 * 
	 * }
	 * 
	 * public void clickAuction() { Auctionlink.click();
	 * 
	 * }
	 * 
	 * public void clicksecondCharge() { secondChargelink.click();
	 * 
	 * }
	 */

	/*
	 * public void backtoburgermenu() { //driver.navigate().back(); Actions x=
	 * new Actions(driver); x.moveToElement(Products).build().perform();
	 * WebDriverWait wait=new WebDriverWait(driver,100);
	 * wait.until(ExpectedConditions.visibilityOf(Commercial)); }
	 */
}
