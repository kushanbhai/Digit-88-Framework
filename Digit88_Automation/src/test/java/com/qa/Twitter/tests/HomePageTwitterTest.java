package com.qa.Twitter.tests;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Twitter.pages.BaseClass;
import com.qa.Twitter.pages.HomePage;
import com.qa.Twitter.pages.LoginPage;

public class HomePageTwitterTest extends BaseClass {
	
	@BeforeClass
	public void beforemethod() {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.LoginTwitter(config.getDatafromConfig("username"), config.getDatafromConfig("password"));
	}

	@Test(priority = 1, description = "to follow the person")
	public void followperson() throws AWTException {

		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.searchperson("Sania Mirza");
		homepage.logoutapp();
		System.out.println("========logged out of twitter app==============");
	}

	@Test(priority = 2, description = "to unfollow the person")
	public void unfollowperson() throws AWTException {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.personunfollow("Sania Mirza");
		homepage.logoutapp();
		System.out.println("========logged out of twitter app==============");
	}
	
	
	}


