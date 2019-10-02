package com.glenhawk.pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import com.glenhawk.base.TestBase;

public class Newspage extends TestBase {

	
	public Newspage() {

		PageFactory.initElements(driver, this);
	}

	public static void validatenewspage() {
		assertEquals(Newspage.driver.getTitle(), "News");
	}
}
