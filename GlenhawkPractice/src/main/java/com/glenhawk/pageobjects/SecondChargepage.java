package com.glenhawk.pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.glenhawk.base.TestBase;

public class SecondChargepage extends TestBase{

	
	public SecondChargepage(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css= ".textWrapper h1")
	public  WebElement SecondChargetitle;
	
	public  void  validatesecondChargepage() {
		assertEquals(SecondChargetitle.getText(), "2nd Charge");
		
		
	}

}

