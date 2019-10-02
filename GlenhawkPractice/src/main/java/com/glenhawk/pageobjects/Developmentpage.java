package com.glenhawk.pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.glenhawk.base.TestBase;

public class Developmentpage extends TestBase{

	public Developmentpage(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css= ".textWrapper h1")
	public  WebElement developmentpagetitle;
	
	public void  validatedevelopmentpage() {
		assertEquals(developmentpagetitle.getText(), "Development");
		
		
	}

}

