package com.glenhawk.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.glenhawk.base.TestBase;
import com.glenhawk.pageobjects.AboutUspage;
import com.glenhawk.pageobjects.Auctionpage;
import com.glenhawk.pageobjects.Commercialpage;
import com.glenhawk.pageobjects.Developmentpage;
import com.glenhawk.pageobjects.Homepage;
import com.glenhawk.pageobjects.Residentialpage;
import com.glenhawk.pageobjects.SecondChargepage;

public class HomepageTC extends TestBase {
	
	Homepage homepageobj;
	Residentialpage residentialobj;
	Auctionpage auctionpageobj;
	Commercialpage commercialpageobj;
	Developmentpage developmentpageobj;
	SecondChargepage secondChargepageobj;
	AboutUspage aboutUspageobj;
	
	/*Contactpage contactpage;
	Newspage newspage;
	AboutUs aboutUs;*/
	
	
	public HomepageTC(){
		super();
	}

	@BeforeMethod
	public void beforeMethod() {
		initialization();
		homepageobj = new Homepage();
		
	}

	@Test
	public void f() {
		
		homepageobj.Burgermenu.click();
		homepageobj.clickResidential();
		
			
		residentialobj= new Residentialpage();
		residentialobj.validateresidentialpage();
		
		homepageobj.Burgermenu.click();
		homepageobj.clickAuctionlink();
		auctionpageobj= new Auctionpage();
		auctionpageobj.validateauctionpage();
		
		homepageobj.Burgermenu.click();
		homepageobj.clickCommerciallink();
		commercialpageobj=new Commercialpage();
		commercialpageobj.validatecommercialpage();
		
		homepageobj.Burgermenu.click();
		homepageobj.clickDevelopmentlink();
		developmentpageobj=new Developmentpage();
		developmentpageobj.validatedevelopmentpage();
		
		homepageobj.Burgermenu.click();
		homepageobj.clicksecondChargelink();
		secondChargepageobj=new SecondChargepage();
		secondChargepageobj.validatesecondChargepage();
		
		homepageobj.Burgermenu.click();
		
		homepageobj.AboutUslink.click();
		aboutUspageobj=new AboutUspage();
		aboutUspageobj.validateAboutUspage();
		
		
		//homepageobj.clickCommercial();
		//homepageobj.clicksecondCharge();
		//homepageobj.clickAuction();
		
		//Contactpage.clickContact();
		//Newspage.clickNewslink();
	    
	   /*assertEquals(homepageobj.Validationmsg.g, prop.getProperty("validationmsg"));
	   homepageobj.validatedelfolder();*/

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}
	
}
