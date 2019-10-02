package com.glenhawk.pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.glenhawk.base.TestBase;

public class Auctionpage extends TestBase{


	public Auctionpage(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css= ".textWrapper h1")
	public WebElement auctionpagetitle;
	
	public void  validateauctionpage() {
		assertEquals(auctionpagetitle.getText(), "Auction");
		
		
		
	}

}

