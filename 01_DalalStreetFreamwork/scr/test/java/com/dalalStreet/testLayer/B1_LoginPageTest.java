package com.dalalStreet.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dalalStreet.pageLayer.B_LoginPage;
import com.dalalStreet.testBase.TestBase;
import com.dalalStreet.utilities.UtilClass;

public class B1_LoginPageTest extends TestBase {
	
	@Test
	public void verifyLoginWithCorrectCred() throws InterruptedException
	{
		String expected_output = "https://www.apps.dalalstreet.ai/dashboard";
		
//		login_obj.enterEmailAddress("dnyanu197@gmail.com");
//		login_obj.enterPassword("@Test@1234");
//		login_obj.clickOnLoginButton();
		
		Thread.sleep(5000);		
		Assert.assertEquals(util_obj.getWebPageUrl(), expected_output);
		logger.info("Login done successfully");
	}
}
