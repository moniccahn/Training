 package com.glenhawk.pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.glenhawk.base.TestBase;

public class Residentialpage extends TestBase{

	//Residentialpage residentialpage;
	
	public Residentialpage(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css= ".textWrapper h1")
	public  WebElement residentialpagetitle;
	
	public void  validateresidentialpage() {
		System.out.println(residentialpagetitle.getText());
		assertEquals(residentialpagetitle.getText(), "Residential");
		
		
		
	}

}

