package com.glenhawk.pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.glenhawk.base.TestBase;

public class AboutUspage extends TestBase {

	AboutUspage aboutUs;

	public AboutUspage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".textWrapper h1")
	public WebElement AboutUspagetitle;

public void  validateAboutUspage() {
	String pagetitle="Your success is our success";
		assertEquals(AboutUspagetitle.getText(), pagetitle);
}

}
