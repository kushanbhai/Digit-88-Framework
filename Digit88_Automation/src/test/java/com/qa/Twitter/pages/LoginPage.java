package com.qa.Twitter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	LoginPage(WebDriver ldriver, WebDriver driver){
		this.driver = driver;
	}
	public LoginPage() {
		
	}
	
	@FindBy(xpath = "//input[@class='js-username-field email-input js-initial-focus'][@name='session[username_or_email]']")
	WebElement username;

	@FindBy(xpath = "//input[@class='js-password-field']")
	WebElement password;

	@FindBy(xpath = "//button[text()='Log in']")
	WebElement loginbtn;
	
	public void LoginTwitter(String uid, String pwd) {
		username.sendKeys(uid);
		password.sendKeys(pwd);
		loginbtn.click();
	}
}
