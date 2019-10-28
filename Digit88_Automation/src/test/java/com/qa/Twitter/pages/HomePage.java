package com.qa.Twitter.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qa.Twitter.utility.TestUtil;

public class HomePage {
	WebDriver driver;

	HomePage(WebDriver ldriver, WebDriver driver) {
		this.driver = driver;
	}

	public HomePage() {

	}

	@FindBy(xpath = "//input[@enterkeyhint='search']")
	WebElement search;

	@FindBy(xpath = "//div[@data-testid='87174678-follow']")
	WebElement follow;
	
	
	@FindBy(xpath = "//div[@data-testid='87174678-unfollow']")
	WebElement unfollow;
	
	
	@FindBy(xpath = "//span[text()='Unfollow']")
	WebElement unfollowbtn;
	
	@FindBy(xpath = "//div[@data-testid='AppTabBar_More_Menu']")
	WebElement more;
	
	@FindBy(xpath = "//div[@title='Log out']")
	WebElement logout;
	
	
	@FindBy(xpath = "//span[text()='Log out']")
	WebElement logoutbtn;
	
	public void searchperson(String personname) throws AWTException {

		search.sendKeys(personname);
		TestUtil.clickusingrobot();
		follow.click();
		System.out.println("====clicked on follow button========");
		//to validate whether we are following the same
		Assert.assertTrue(unfollow.isDisplayed());
	}
	
	public void personunfollow(String personname) throws AWTException {
		search.sendKeys(personname);
		TestUtil.clickusingrobot();
		unfollow.click();
		System.out.println("====clicked on unfollow button========");
		unfollowbtn.click();
		//to validate whether we are unfollowed the same person
		Assert.assertTrue(follow.isDisplayed());
	}
	
	public void logoutapp() {
		more.click();
		logout.click();
		logoutbtn.click();
		
	}
}
