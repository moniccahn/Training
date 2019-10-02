package com.glenhawk.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.glenhawk.base.TestBase;

public class Contactpage extends TestBase{

	
	Contactpage contactpage;
	
	public Contactpage(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText= "Contact")
	public static WebElement Contactlink;
	
	public static void clickContact(){
		Actions x= new Actions(driver);
		x.moveToElement(Contactlink).build().perform();
		
		 WebDriverWait  wait=new WebDriverWait(driver,100);		
		  wait.until(ExpectedConditions.visibilityOf(Contactlink));
	}

	
}

