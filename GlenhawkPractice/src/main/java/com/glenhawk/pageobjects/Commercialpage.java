package com.glenhawk.pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.glenhawk.base.TestBase;

public class Commercialpage extends TestBase{

	public Commercialpage(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css= ".textWrapper h1")
	public  WebElement commercialpagetitle;
	
	public  void  validatecommercialpage() {
		assertEquals(commercialpagetitle.getText(), "Commercial");
		
	}

}

