package com.glenhawk.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.glenhawk.pageobjects.Homepage;
import com.glenhawk.util.TestUtil;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	Homepage homepage;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Monicca2502\\workspace\\GlenhawkPractice\\src\\main\\java\\com\\glenhawk\\config\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	public void beforeMethod() {
//		initialization();
//		homepage = new Homepage();
//	}

	public static void initialization() {
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monicca2502\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		
		 else if(browser.equals("FF"))
		 {
		  System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\Monicca2502\\workspace\\GlenhawkPractice\\src\\main\\java\\com\\glenhawk\\util\\geckodriver.exe"); 
		  driver= new FirefoxDriver(); 
		  
		 }
		 
		 else if (browser.equals("IE"))
		 {
			  System.setProperty("webdriver.gecko.driver",
					 "/Alfresco_Assignment/src/main/java/com/alfresco/util/IEDriverServer.exe"); 
			  driver= new InternetExplorerDriver(); 
			  
		 }		 

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

	/*public void afterMethod() {
		driver.quit();*/
	}


