package com.qa.Twitter.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.qa.Twitter.pages.BaseClass;
import com.qa.Twitter.pages.LoginPage;

public class LoginTwitterTest extends BaseClass {

	@Test
	public void loginApp()  {
		 LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		 login.LoginTwitter("kushanchoudhury6@gmail.com", "airtel@123");
}
}
