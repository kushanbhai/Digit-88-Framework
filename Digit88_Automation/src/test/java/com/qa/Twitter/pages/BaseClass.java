package com.qa.Twitter.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.qa.Twitter.utility.BrowserFactory;
import com.qa.Twitter.utility.ConfigDataProvider;

public class BaseClass {
	public ConfigDataProvider config;
	public WebDriver driver;

	@BeforeSuite
	public void setupSuite() {

		config = new ConfigDataProvider();
	}

	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getTestUrl());
	}

	@AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}

}
